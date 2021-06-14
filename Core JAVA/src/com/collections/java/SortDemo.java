package com.collections.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortDemo {

	public static void main(String[] args) {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\baretc\\Documents\\jars\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://wikipedia.org/");
		driver.manage().window().fullscreen();
		
		List<String> empty =new ArrayList<String>();
		List<WebElement> lang=driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
		System.out.println(lang.size());
		for(WebElement ele:lang) {
			empty.add(ele.getText());
		}
		
		System.out.println("Before sorting" +empty);
		Collections.sort(empty);
		System.out.println("After sorting" +empty);
		driver.quit();
		
			
	}

}
