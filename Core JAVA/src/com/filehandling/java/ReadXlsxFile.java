package com.filehandling.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlsxFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir")+"\\Demodata\\Book.xlsx";
		FileInputStream fis =new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row>itr= sheet.iterator();
		while(itr.hasNext()) {
			Row row=itr.next();
			Iterator<Cell> cellitr=row.cellIterator();
			while(cellitr.hasNext()) {
				Cell cell=cellitr.next();
				switch(cell.getCellType()) {
				case STRING: System.out.println(cell.getStringCellValue()+"\t\t\t");
							break;
					
				case NUMERIC:System.out.println(cell.getNumericCellValue()+"\t\t\t");
							break;
				default:
					
				}
		
			}
			
			System.out.println("");
		}
		
		
	}

}
