package com.filehandling.java;

import java.io.File;
import java.io.IOException;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IniDemo {

	public static void main(String[] args) throws InvalidFileFormatException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",getIni("TC001","path"));
		WebDriver driver=new ChromeDriver();
		driver.get(getIni("TC001","url"));
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(getIni("TC003", "search"),Keys.ENTER);
		Thread.sleep(1000);

		String price=driver.findElement(By.xpath("//span[text()='1,199']")).getText();
		setIni("TC005", "Price", price);
		Thread.sleep(1000);
		driver.quit();
	}
	
		public static String getIni(String title,String key) throws InvalidFileFormatException, IOException {
			String path= System.getProperty("user.dir")+"\\Demodata\\sample.ini";
			File f=new File(path);
			Ini i=new Ini(f);
			String result=i.get(title,key);
			return result;
			
		}
		
		public static void setIni(String title,String key,String value) throws InvalidFileFormatException, IOException {
			String path= System.getProperty("user.dir")+"\\Demodata\\sample.ini";
			File f=new File(path);
			Ini i=new Ini(f);
			i.put(title,key,value);
			i.store();
			
		}
		
	}

