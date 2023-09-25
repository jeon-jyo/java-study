package kr.co.miniproject.school;

import java.util.ArrayList;

public class School {

	// 싱글톤
	private static School instance = new School();
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null)
			instance = new School();
		return instance;
	}

	private ArrayList<Student> students = new ArrayList<Student>();		// 학생 리스트
	private ArrayList<Subject> subjects = new ArrayList<Subject>();		// 과목 리스트
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	
	// 학생 추가 메서드
	public void addStudent(Student student) {
		students.add(student);
	}
	// 과목 추가 메서드
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
}
