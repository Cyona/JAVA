package com.filehandling.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\Demodata\\test.txt";
		FileOutputStream fos=new FileOutputStream(path);
		 String input= "Welcome to Java";
		 byte b[]=input.getBytes();
		 fos.write(b);
		 
		 
		 String inp= "Happy learning";
		 byte b1[]=inp.getBytes();
		 fos.write(b1);
	}

}
