package com.filehandling.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class readxlsfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir")+"\\Demodata\\Demo.xls";
		FileInputStream fis=new FileInputStream(path);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		int row= sheet.getLastRowNum();
		System.out.println("Total number of rows: "+row);
		
		for(int i=0;i<=row;i++) {
			String name=sheet.getRow(i).getCell(0).getStringCellValue();
			String city=sheet.getRow(i).getCell(1).getStringCellValue();	
		
			DataFormatter df=new DataFormatter();
			String pin=df.formatCellValue(sheet.getRow(i).getCell(2));
			
			System.out.println(name+ "------" +city+ "--------" +pin);
		}
		

	}

}
