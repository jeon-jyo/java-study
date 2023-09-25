package kr.co.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		// Set 이나 Map 은 Iterator 써야하지만 List 는 for문 가능
//		Iterator<Member> iterator = arrayList.iterator();
//		while(iterator.hasNext()) {
//			Member member = iterator.next();
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(member);
//				return true;
//			}
//		}
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
