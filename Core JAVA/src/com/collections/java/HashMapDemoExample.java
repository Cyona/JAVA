package com.collections.java;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapDemoExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mp=new HashMap<String,String>();
		mp.put("Browser", "Chrome");
		mp.put("url", "https://www.amazon.in/");
		mp.put("search", "watch");
		
		if(mp.get("Browser").equalsIgnoreCase("Chrome")) {
			String path=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",path);
			driver=new ChromeDriver();
			
		}
		driver.get(mp.get("url"));

		
		
		
	}

}
