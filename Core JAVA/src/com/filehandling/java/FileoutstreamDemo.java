package com.filehandling.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutstreamDemo {
	public static void main(String args[]) throws IOException {
		String path=System.getProperty("user.dir")+"\\Demodata\\test.txt";
		FileOutputStream fos=new FileOutputStream(path);
		String s="welcome to java";
		byte[] b=s.getBytes();
		fos.write(b);
		
}
}