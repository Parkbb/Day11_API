package com.iu.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest4 {

	public static void main(String[] args) {
		//닭다리쿠션(40%), 최신휴대폰(10%), 은갈치넥타이(50%)
		
		ArrayList<String> ar = new ArrayList<String>();
		Random random = new Random();
		ar.add("닭다리쿠션");
		ar.add("최신휴대폰");
		ar.add("은갈치넥타이");
		int num = random.nextInt(100);
		if(num<40) {System.out.println(ar.get(0));
			
		}else if(num>=40 && num <90) {
			System.out.println(ar.get(2));
		}else if(num>=90) {
			System.out.println(ar.get(1));
		}
		
		
		
	}
}
