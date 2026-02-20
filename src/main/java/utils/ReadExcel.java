package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	    @Test
		public  static String[][] ReadData(String filename) throws IOException{
			XSSFWorkbook wb  = new XSSFWorkbook("./Data/"+filename+".xlsx");
			XSSFSheet ws = wb.getSheet("Sheet1");
			int rowCount = ws.getLastRowNum();
			System.out.println("row count:" +rowCount);
			int columnCount = ws.getRow(0).getLastCellNum();
			System.out.println("Column count:"+columnCount);
			
			String[][] data= new String [rowCount][columnCount];
			
			for(int i=1;i<=rowCount;i++) {
				XSSFRow row = ws.getRow(i);
				
				for(int j=0;j<columnCount;j++) {
					String allData = row.getCell(j).getStringCellValue();
					System.out.println(allData);
			       data[i-1][j]= allData;
				}
		
		}
		return data;
		
	 
		}
	}
