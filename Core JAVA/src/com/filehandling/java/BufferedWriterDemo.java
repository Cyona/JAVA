package com.filehandling.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
			
		String path=System.getProperty("user.dir")+"\\Demodata\\test.txt";
		FileWriter fw=new FileWriter(path);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello world");
		bw.newLine();
		bw.write("Welcome to Automation");
		bw.newLine();
		bw.close();
	}

}
