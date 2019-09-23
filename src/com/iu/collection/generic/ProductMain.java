package com.iu.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMain {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer computer = new Computer();
		NoteBook noteBook = new NoteBook();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		//Computer와 Computer를 상속 받는 타입.
		ar.add(noteBook);
		
		
		//<Generic>
		//ArrayList<Product> ar = new ArrayList<Product>();
		//ar.add(computer);
		//ar.add(t);
		
		//ArrayList<Product> ar2 = new ArrayList<Product>();
		
		//ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>();
		
		//ArrayList<ArrayList<ArrayList<Product>>> ar4 = new ArrayList<ArrayList<ArrayList<Product>>>();
		//이정도까지는 잘 안 씀
		
		//HashMap<String, ArrayList<Product>> map = new HashMap<String, ArrayList<Product>>();
		
	}
}
