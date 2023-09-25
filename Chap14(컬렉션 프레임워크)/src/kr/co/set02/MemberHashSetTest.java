package kr.co.set02;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet mHashSet = new MemberHashSet();

		Member member1 = new Member(1, "가");
		Member member2 = new Member(2, "나");
		Member member3 = new Member(3, "다");
		Member member4 = new Member(4, "0");
		Member member5 = new Member(5, "1");
		Member member6 = new Member(6, "2");
		Member member7 = new Member(7, "Apple");
		Member member8 = new Member(8, "Banana");
		Member member9 = new Member(9, "Cherry");

		mHashSet.addMember(member1);
		mHashSet.addMember(member2);
		mHashSet.addMember(member3);
		mHashSet.addMember(member4);
		mHashSet.addMember(member5);
		mHashSet.addMember(member6);
		mHashSet.addMember(member7);
		mHashSet.addMember(member8);
		mHashSet.addMember(member9);

		Member member77 = new Member(7, "Apple");
		Member member777 = new Member(7, "Apple");
		
		System.out.println(member7.equals(member77));	// false	-> true (재정의 후)
		System.out.println(member77.equals(member777));	// false	-> true (재정의 후)
		System.out.println();
		
		mHashSet.addMember(member77);
		mHashSet.addMember(member77);
		mHashSet.addMember(member777);
		mHashSet.addMember(member777);
		mHashSet.addMember(member777);
		mHashSet.showAllMembers();
		/*
			hashCode(), equals() 재정의 안 해주었을 때 : 같은 객체주소만 중복 안됨
			
			8 : Banana
			1 : 가
			3 : 다
			5 : 1
			6 : 2
			2 : 나
			7 : Apple
			4 : 0
			9 : Cherry
			7 : Apple
			7 : Apple
			
			hashCode(), equals() 재정의 후 : key 값이랑 중복 안됨 / 내림차순 정렬
			
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

	}
}
