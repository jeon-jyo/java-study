package kr.co.map02;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap mHashMap = new MemberHashMap();
		
		Member member1 = new Member(1, "가");
		Member member2 = new Member(2, "나");
		Member member3 = new Member(3, "다");
		Member member4 = new Member(4, "0");
		Member member5 = new Member(5, "1");
		Member member6 = new Member(6, "2");
		Member member7 = new Member(7, "Apple");
		Member member8 = new Member(8, "Banana");
		Member member9 = new Member(9, "Cherry");

		mHashMap.addMember(member1);
		mHashMap.addMember(member2);
		mHashMap.addMember(member3);
		mHashMap.addMember(member4);
		mHashMap.addMember(member5);
		mHashMap.addMember(member6);
		mHashMap.addMember(member7);
		mHashMap.addMember(member8);
		mHashMap.addMember(member9);
		mHashMap.showAllMembers();
		/*
			1 : 가
			2 : 나
			3 : 다
			4 : 0
			5 : 1
			6 : 2
			7 : Apple
			8 : Banana
			9 : Cherry
		 */
		
		Member member77 = new Member(7, "AppleApple");
		mHashMap.addMember(member77);
		mHashMap.showAllMembers();
		/*
			1 : 가
			2 : 나
			3 : 다
			4 : 0
			5 : 1
			6 : 2
			7 : AppleApple
			8 : Banana
			9 : Cherry
		 */
		
		mHashMap.removeMember(9);
		mHashMap.showAllMembers();
		/*
			1 : 가
			2 : 나
			3 : 다
			4 : 0
			5 : 1
			6 : 2
			7 : AppleApple
			8 : Banana
		 */
	}

}
