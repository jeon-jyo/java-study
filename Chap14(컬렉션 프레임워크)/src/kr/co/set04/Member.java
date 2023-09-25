package kr.co.set04;

import java.util.Comparator;
 
// java.util.Comparator
public class Member implements Comparator<Member> {

	private int memberId;
	private String memberName;
	
	// 기본 생성자 추가
	public Member() {}
	
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
	}

	@Override
	public int hashCode() {
		return memberId;
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
	}
	
	/* 파라미터로 들어오는 member1, member2 를 비교하는 것 */
	
	// implements Comparator<Member>
	// int compare(T o1, T o2); 구현해야함
	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	
}
