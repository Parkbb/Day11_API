package com.iu.stringtokenizer.ex1;

import java.util.StringTokenizer;

public class MemberMaker {

	private String memberInfo;

	public MemberMaker() {
		this.memberInfo="iu-iu-27-choa-choa-28-suji-suji-30";

	}
	public void makeMember() {
		//memberInfo의 내용을 파싱해서
		//Member 객체를 생성해서
		//모든 정보를 출력
		
		Member [] members = new Member[3];
		StringTokenizer st = new StringTokenizer(memberInfo, "-");
		int index=0;
		while(st.hasMoreTokens()) {
			Member member = new Member();
			String id = st.nextToken();
			member.setId(id);
			String name = st.nextToken();
			member.setName(name);
			String age = st.nextToken();
			int age2 = Integer.parseInt(age);
			member.setAge(age2);
			members[index]=member;
			index++;
		}
		for(int i=0;i<members.length;i++) {
			System.out.println(members[i].getId());
			System.out.println(members[i].getName());
			System.out.println(members[i].getAge());
		}
	}
	public void makeMember2() {
		String [] info = memberInfo.split("-");

		for(int i=0; i<info.length;i++) {
			Member member = new Member();
			member.setId(info[i]);
			member.setName(info[++i]);

		}
	}
}
