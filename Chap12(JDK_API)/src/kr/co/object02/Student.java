package kr.co.object02;

import java.util.Objects;

public class Student implements Cloneable {
	
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// studentId 반환으로 오버라이딩
	@Override
	public int hashCode() {
		return studentId;
//		return Objects.hash(studentId, studentName);
	}

	// studentId 값이 같으면 true 로 오버라이딩
	@Override
	public boolean equals(Object obj) {		// 파라미터에서 업캐스팅됨
		
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(this.studentId == stu.studentId) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
	
	// implements Cloneable
	// Object.clone()
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}
