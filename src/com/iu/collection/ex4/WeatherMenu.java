package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;


public class WeatherMenu {
	private WeatherService ws;
	//메서드명 Start
	//1. 날씨정보 초기화 -init
	//2. 날씨정보추가 - addWeather
	//3. 전체날씨정보 - view
	//4. 지역날씨검색 - findWeather, view
	//5. 날씨정보삭제 - deleteWeather
	//5. 프로그램 종료
	Scanner sc = new Scanner(System.in);
	public void Start() {
		ws = new WeatherService();
		WeatherView wv = new WeatherView();
		Boolean check = true;
		Weather weather = new Weather();
		int choose;
		while(check) {
			System.out.println("1. 날씨정보 초기화");
			System.out.println("2. 날씨정보 추가");
			System.out.println("3. 전체날씨정보");
			System.out.println("4. 지역날씨검색");
			System.out.println("5. 프로그램종료");
			choose = sc.nextInt();
			switch(choose) {
			case 1 :
				HashMap<String, Weather> map = ws.init()
				
				break;
			case 2 :
				System.out.println("날씨정보추가 코드");
				break;
			case 3 :
				wv.view(weathers);
				break;
			case 4 :
				Weather weather = ws.findWeather(map);
				break;
			default :
				check = false;
			
			}
		}
	};
}
