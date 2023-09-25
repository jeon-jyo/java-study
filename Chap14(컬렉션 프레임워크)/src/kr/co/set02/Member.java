package kr.co.set02;

import java.util.Objects;

public class Member {

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberId + " : " + memberName;
//		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

	/*
	 * 자바의 최상위 클래스인 Object 클래스에는 equals(), hashCode() 메서드가 있음
	 * 
	 * Object 의 equals() 는 객체의 주소를 비교하여 같은 객체인지 확인
	 * 그래서 각 객체만의 동일성으로 오버라이딩 해줘야 함
	 * 
	 * HashSet 이나 HashMap 은 hashCode() 까지 이용해서 같은 객체인지 판단함
	 * 
	 * Object 의 hashCode() 는 객체의 주소로 HashCode 반환함
	 * 이러한 Side Effect 를 방지하기 위해, equals() 를 재정의 할 때 hashCode() 도 재정의 해줘야 함
	 */
	
	@Override
	public int hashCode() {
		return memberId;
//		return Objects.hash(memberId, memberName);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return memberId == other.memberId && Objects.equals(memberName, other.memberName);
	}
	
}
