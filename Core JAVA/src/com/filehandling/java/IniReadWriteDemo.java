package com.filehandling.java;

import java.io.File;
import java.io.IOException;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;

public class IniReadWriteDemo {
	
	public static void main(String[] args) throws IOException {

	String accnum="Cyona_0234";
	String name=accnum.split("_")[0];
	String num=accnum.split("_")[1];
	
	System.out.println(getIni("TC002","Browser"));
	setIni("TC003", "search", "watch");
	setIni("TC004", "Account_name", name);
	setIni("TC004", "Account_num", num);

	
		
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
