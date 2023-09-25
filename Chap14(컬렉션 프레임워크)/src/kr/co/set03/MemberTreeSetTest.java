package kr.co.set03;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		/*
		 * class kr.co.set03.Member cannot be cast to class java.lang.Comparable
		 * -> TreeSet 은 SortedSet 인터페이스를 구현하는 컬렉션 클래스
		 * -> Member implements Comparable<Member>
		 */
		
		MemberTreeSet mTreeSet = new MemberTreeSet();

		Member member1 = new Member(1, "가");
		Member member2 = new Member(2, "나");
		Member member3 = new Member(3, "다");
		Member member4 = new Member(4, "0");
		Member member5 = new Member(5, "1");
		Member member6 = new Member(6, "2");
		Member member7 = new Member(7, "Apple");
		Member member8 = new Member(8, "Banana");
		Member member9 = new Member(9, "Cherry");

		mTreeSet.addMember(member1);
		mTreeSet.addMember(member2);
		mTreeSet.addMember(member3);
		mTreeSet.addMember(member4);
		mTreeSet.addMember(member5);
		mTreeSet.addMember(member6);
		mTreeSet.addMember(member7);
		mTreeSet.addMember(member8);
		mTreeSet.addMember(member9);

		Member member77 = new Member(7, "AppleApple");
		mTreeSet.addMember(member77);
		mTreeSet.showAllMembers();
		/*
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
