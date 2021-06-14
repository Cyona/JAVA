package com.filehandling.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadDemo {

	public static void main(String[] args) throws IOException {

		String path=System.getProperty("user.dir")+"\\Demodata\\test.txt";
		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
		String s="";
		while((s=br.readLine())!=null){
		System.out.println(s);
	}
		br.close();

}
}
