package kr.co.miniproject.school;

import java.util.ArrayList;

public class Student {

	private int studentId;			// 학번
	private String studentName;		// 이름
	private Subject majorSubject;	// 전공
	private ArrayList<Score> scores = new ArrayList<Score>();	// 성적 리스트
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Subject getMajorSubject() {
		return majorSubject;
	}
	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}
	public ArrayList<Score> getScores() {
		return scores;
	}
	public void setScores(ArrayList<Score> scores) {
		this.scores = scores;
	}
	
	// 성적 추가 메서드
	public void addSubjectScore(Score score) {
		scores.add(score);
	}
	
}
