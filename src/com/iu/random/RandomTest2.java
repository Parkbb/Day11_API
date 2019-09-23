package com.iu.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {

		//로또 번호 출력
		//1~45
		int num=0;

		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		boolean check = false;
		for(int i=0;i<6;i++) {
			num = random.nextInt(45)+1;
			ar.add(num);

			for(int j=0;j<i;j++) {
				if(num==ar.get(j)) {
					i--;
					ar.remove(j);
					break;
				}

			}
		}
		for(int i=0;i<6;i++) {
			System.out.println(ar.get(i));
		}
		//중복처리 어떻게??


	}
}

