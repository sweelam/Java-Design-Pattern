package com.sweelam.design.pattern.observer.weather.engine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONObject;

public class WeatherConsumer {
	private static final String WEATHER_API = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";

	public static JSONObject getWeatherData() {
		URL url = null;
		StringBuffer content = new StringBuffer();
		
		try {
			url = new URL(WEATHER_API);
			if(null != url) {				
				
				BufferedReader bufferedReader = 
						new BufferedReader(new InputStreamReader(url.openStream()));
				String k = null;
				while((k=bufferedReader.readLine()) != null) {
					content.append(k);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return new JSONObject(content.toString());
	}
}
