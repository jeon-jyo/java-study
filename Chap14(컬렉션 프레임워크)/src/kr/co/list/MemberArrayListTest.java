package kr.co.list;

public class MemberArrayListTest {
	
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberL = new Member(2023, "이순신");
		Member memberW = new Member(2024, "원균");
		Member memberN = new Member(2025, "나대용");
		Member memberR = new Member(2026, "류성용");
		Member memberL2 = new Member(2023, "이순신");
		
		memberArrayList.addMember(memberL);
		memberArrayList.addMember(memberW);
		memberArrayList.addMember(memberN);
		memberArrayList.addMember(memberR);
		memberArrayList.addMember(memberL2);
		memberArrayList.showAllMembers();
		/*
			Member [memberId=2023, memberName=이순신]
			Member [memberId=2024, memberName=원균]
			Member [memberId=2025, memberName=나대용]
			Member [memberId=2026, memberName=류성용]
			Member [memberId=2023, memberName=이순신]
		 */
		
		memberArrayList.removeMember(memberL.getMemberId());
		memberArrayList.showAllMembers();
		/*
			Member [memberId=2024, memberName=원균]
			Member [memberId=2025, memberName=나대용]
			Member [memberId=2026, memberName=류성용]
			Member [memberId=2023, memberName=이순신]
		 */
	}
}
