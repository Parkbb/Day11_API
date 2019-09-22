package com.iu.collection.ex3;
public class WeatherView {
	
	//메서드명 view
	//날씨전체정보
	public void view(Weather [] weathers) {
		System.out.println("도시\t기온\t습도\t상태");
		for(int i=0;i<4;i++) {
			System.out.print(weathers[i].getCity()+"\t");
			System.out.print(weathers[i].getTemp()+"\t");
			System.out.print(weathers[i].getHumi()+"\t");
			System.out.println(weathers[i].getStatus());
		}
	}
	//메서드명 view
	//날씨하나 정보출력
}
