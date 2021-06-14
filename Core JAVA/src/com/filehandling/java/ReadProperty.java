package com.filehandling.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir")+"\\Demodata\\config.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("url"));
	}

}
