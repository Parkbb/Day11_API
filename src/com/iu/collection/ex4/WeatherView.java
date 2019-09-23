package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Iterator;

import com.sun.javafx.collections.MappingChange.Map;

public class WeatherView {
	private WeatherService ws;

	//메서드명 view
	//날씨전체정보
	public void view(HashMap<String, Weather> map) {
		ws = new WeatherService();
		System.out.println("도시\t기온\t습도\t상태");
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String k = it.next();
			Weather weather = map.get(k);
			System.out.print(weather.getCity()+"\t");
			System.out.print(weather.getTemp()+"\t");
			System.out.print(weather.getHumi()+"\t");
			System.out.println(weather.getStatus());
		}



	}

	public void view (Weather weather) {
		//메서드명 view
		//날씨하나 정보출력
	}
	

	public void view(String str) {
		System.out.println(str);
	}
}


