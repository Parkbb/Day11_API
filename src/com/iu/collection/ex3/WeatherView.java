package com.iu.collection.ex3;

public class WeatherView {
	WeatherService ws = new WeatherService();
	//메서드명 view
	//날씨전체정보
	public void view(String [] weathers) {
		System.out.println("도시"+"\t"+"기온"+"\t"+"습도"+"\t"+"상태");

		for(int i=0;i<weathers.length;i++) {
			System.out.println(weathers);
		}
	}
	//메서드명 view
	//날씨하나 정보출력
}
