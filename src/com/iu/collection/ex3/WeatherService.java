package com.iu.collection.ex3;

public class WeatherService {

	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		//파싱해서 날씨정보 입력
		
	}
	//메서드명 init
	//날씨정보를 파싱해서 저장.
	
	
	//메서드명 addWeather
	//날씨 정보를 입력받아서 추가
	
	//메서드명 findWeather
	//도시명을 입력받아서 해당 Weather 검색
}
