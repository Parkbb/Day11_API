package com.iu.collection.ex3;

import java.util.StringTokenizer;

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

	public Weather[] init() {
		//메서드명 init
		//날씨정보를 파싱해서 저장.
		String ssb = this.sb.toString();
		StringTokenizer stsb = new StringTokenizer(ssb, "-");
		Weather [] weathers = new Weather[4];
		
		int index =0;
		while(stsb.hasMoreTokens()) {
			Weather weather = new Weather();
			String city = stsb.nextToken();
			weather.setCity(city);
			String tem = stsb.nextToken();
			double temp = Double.parseDouble(tem);
			weather.setTemp(temp);
			String hum = stsb.nextToken();
			int humi = Integer.parseInt(hum);
			weather.setHumi(humi);
			String status = stsb.nextToken();
			weather.setStatus(status);
			weathers[index]=weather;
			index++;
		}
		
			
			return weathers;
		}

	

		//메서드명 addWeather
		//날씨 정보를 입력받아서 추가

		//메서드명 findWeather
		//도시명을 입력받아서 해당 Weather 검색
	
}
