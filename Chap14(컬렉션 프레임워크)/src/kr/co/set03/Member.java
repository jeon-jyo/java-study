package kr.co.set03;

// java.lang.Comparable
public class Member implements Comparable<Member> {

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

	/* 새로 들어오는 member 와 기존 member 비교 구현 */
	
	// implements Comparable<Member>
	// public int compareTo(T o); 구현해야함
	@Override
	public int compareTo(Member member) {
		/*
		 * 두 객체가 같으면 0, 비교하는 값보다 작으면 음수, 크면 양수를 int형으로 반환
		 * -> 오름차순	/ 더 클 때 -1 -> (-1 곱해서) 내림차순 정렬
		 */
		
//		if(this.memberId > member.memberId) {
//			return 1;
//		} else if(this.memberId < member.memberId) {
//			return -1;
//		} else {
//			return 0;
//		}

		return (this.memberId - member.memberId);
	}
	
}
