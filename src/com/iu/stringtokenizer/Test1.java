package com.iu.stringtokenizer;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		//파싱
		String str = "iu,27,suji,24,choa,30,hani,25";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		//com.iu.m1.Member m = new com.iu.m1.Member();
		//이렇게 매번 참조값 쓰기 귀찮으니까 import함
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();//문자열파싱
			String age = st.nextToken();
			System.out.println(s);
			System.out.println(age);
		}

		
	}
}
