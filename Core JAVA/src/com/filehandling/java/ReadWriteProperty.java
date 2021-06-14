package com.filehandling.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteProperty {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String path=System.getProperty("user.dir")+"\\Demodata\\config.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		
		System.setProperty("webdriver.chrome.driver", p.getProperty("path"));
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().fullscreen();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(p.getProperty("search"),Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
	}

}
