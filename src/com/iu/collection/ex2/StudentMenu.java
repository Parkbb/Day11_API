package com.iu.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	private ArrayList<Student> students;
	private StudentService ss;
	private StudentView sv;
	private Scanner sc;
	
	
	public StudentMenu() {
		students = new ArrayList<Student>();
		ss = new StudentService();
		sv = new StudentView();
		sc = new Scanner(System.in);
	}
	public void  start() {
		//1. 학생정보등록
		//2. 학생전체정보
		//3. 학생정보조회 - 이름으로 검색
		//4. 학생정보삭제
		//5. 프로그램 종료
		//Scanner sc = new Scanner(System.in);
		//StudentView sv = new StudentView();
		//StudentService ss = new StudentService();
		boolean che =true;

		while(che) {
			System.out.println("1. 학생정보등록");
			System.out.println("2. 학생전체정보");
			System.out.println("3. 학생정보조회");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 프로그램 종료");

			int check;
			check = sc.nextInt();
			switch(check){
			case 1:
				ss.studentInput(students);
				break;
			case 2:
				sv.view(students);
				break;
			case 3:
				Student student = ss.studentSearch(students);
				sv.view(student);
				break;
			case 4:
				ss.studentDelete(students);
				break;

			default:
				che=false;
			}
		}

	}
}
