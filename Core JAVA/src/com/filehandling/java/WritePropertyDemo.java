package com.filehandling.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"\\Demodata\\config.properties";
		FileOutputStream fos=new FileOutputStream(path);
		Properties p=new Properties();
		p.setProperty("search", "watch");
		p.setProperty("Browser", "IE");
		p.store(fos, "");
	}

}
