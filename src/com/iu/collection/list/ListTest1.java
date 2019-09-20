package com.iu.collection.list;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		//1,2,3
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add("four");
		
		for(int i =0;i<ar.size();i++) {
		System.out.println(ar.get(i));
		} // 1, 2, 4 , four
		
		ar.add(1,"two"); //끼워넣기
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			} // 1, two, 2, 4 , four
		ar.set(1, 100000); //수정
		ar.remove(1); //삭제
		//ar.clear(); // 초기화
		int num=10;
		
		ar.add(num); // auto Boxing
		num = (int)ar.get(0);
		String name = (String)ar.get(3);
		
	}

}
