package com.filehandling.java;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) throws IOException {
		//String path=System.getProperty("user.dir")+"\\Demodata\\test.txt";
		String path=System.getProperty("user.dir")+"\\Demodata\\config.properties";

		File f=new File(path);
		f.createNewFile();
		
	}

}
