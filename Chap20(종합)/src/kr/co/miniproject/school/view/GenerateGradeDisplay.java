package kr.co.miniproject.school.view;

import java.util.ArrayList;

import kr.co.miniproject.school.School;
import kr.co.miniproject.school.Score;
import kr.co.miniproject.school.Student;
import kr.co.miniproject.school.Subject;
import kr.co.miniproject.school.grade.BasicEvaluation;
import kr.co.miniproject.school.grade.GolfEvaluation;
import kr.co.miniproject.school.grade.GradeEvaluation;
import kr.co.miniproject.school.grade.MajorEvaluation;
import kr.co.miniproject.utils.Constant;

public class GenerateGradeDisplay {

	School school = School.getInstance();
	
	public static final String TITLE = "과목 학점 결과 >>>\n";
	public static final String LINE = "-------------------------------------------------------\n";
	public static final String HEADER = "이름 \t\t 학번 \t\t 필수 \t 점수 \t 학점\n";
	public static final String LINE2 = "=======================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() {
		ArrayList<Subject> subjects = school.getSubjects();
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter(subject);
		}
		return buffer.toString();
	}
	
	private void makeHeader(Subject subject) {
		buffer.append(subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE);
	}
	
	private void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			if(student.getStudentName().length() >= 5) {
				buffer.append("\t");
			} else {
				buffer.append("\t\t");
			}
			buffer.append(student.getStudentId());
			buffer.append("\t");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("\t");
			getScoreGrade(student, subject);
			buffer.append("\n");
		}
	}

	private void getScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scoreList = student.getScores();
		int majorId =  student.getMajorSubject().getSubjectId();
		
		GradeEvaluation[] gradeEvaluations = 
			{ new BasicEvaluation(), new MajorEvaluation(), new GolfEvaluation() };	// 학점 평가 클래스들
		
		for(int i = 0; i < scoreList.size(); i++) {	// 학생이 가진 점수들
			Score score = scoreList.get(i);
			
			if(score.getSubject().getSubjectId() == subject.getSubjectId()) {
				String grade;
				
				// 골프과목
				if(score.getSubject().getSubjectId() == Constant.GOLF) {
					grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore());
				} else {
					// 필수과목
					if(score.getSubject().getSubjectId() == majorId) {
						grade = gradeEvaluations[Constant.SAB_TYPE].getGrade(score.getScore());
					} else {
						grade = gradeEvaluations[Constant.AB_TYPE].getGrade(score.getScore());
					}
				}
				
				buffer.append(score.getScore());
				buffer.append("\t");
				buffer.append(grade);
			}
		}
	}

	private void makeFooter(Subject subject) {
		buffer.append(GenerateGradeDisplay.LINE2);
		buffer.append("\n");
	}
	
}
