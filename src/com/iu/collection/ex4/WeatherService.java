package com.iu.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.collection.ex3.Weather;

public class WeatherService {
	private Scanner sc;
	private StringBuffer sb;

	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		//파싱해서 날씨정보 입력
	}

	public HashMap<String, Weather> init() {
		//메서드명 init
		//날씨정보를 파싱해서 저장.
		String ssb = this.sb.toString();
		StringTokenizer stsb = new StringTokenizer(ssb, "-");
		//HashMap에 추가
		//키는 도시명, value weather
		//리턴은 HashMap
		HashMap<String, Weather> map = new HashMap<String, Weather>();
		while(stsb.hasMoreTokens()) {
			
				Weather weather = new Weather();
				weather.setCity(stsb.nextToken());
				weather.setTemp(Double.parseDouble(stsb.nextToken()));
				weather.setHumi(Integer.parseInt(stsb.nextToken()));
				weather.setStatus(stsb.nextToken());
				
				map.put(weather.getCity(), weather);
				
			}
			return map;
		}
		
		
		
			
			
		

	
	public void addWeather() {
		//메서드명 addWeather
		//날씨 정보를 입력받아서 추가
		System.out.println("추가 정보 입력");
		System.out.println("도시명-기온-습도-상태");
		System.out.println("ex)Busan-15.2-60-맑음");
		sb.append(sc.next());
		this.init();
		
	}
	public Weather findWeather(HashMap<String, Weather> map) {
		//메서드명 findWeather
		//도시명을 입력받아서 해당 Weather 검색
		//weather를 리턴
		System.out.println("도시를 입력");
		String ci = sc.next();
		Weather weather = map.get(ci);
		//System.out.println(weather.getCity());
		//System.out.println(weather.getHumi());
		//System.out.println(weather.getTemp());
		//System.out.println(weather.getStatus());
		
		return weather;
		
	}
	
	public Weather deleteWeather(HashMap<String, Weather> map) {
		//도시명입력 받아서 해당 정보(weather)를 삭제
		System.out.println("도시를 입력");
		String ci = sc.next();
		Weather weather = map.get(ci);
		weather = map.remove(ci);
		return weather;
			
	}
}
