package com.filehandling.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {

		String path=System.getProperty("user.dir")+"\\Demodata\\test.txt";
		FileInputStream fis=new FileInputStream(path);
		System.out.println((char)fis.read());
		int input=0;
		while((input=fis.read())!=-1) {
			System.out.println((char)input);

		}
		
	
	}
}
