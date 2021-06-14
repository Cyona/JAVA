package com.filehandling.java;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String args[]) throws IOException {
	String path=System.getProperty("user.dir")+"\\Demodata\\config.properties";
	FileInputStream fis=new FileInputStream(path);
	int s=0;
	while((s=fis.read())!=-1) {
		System.out.print((char)s);
	}
		
	}
}
