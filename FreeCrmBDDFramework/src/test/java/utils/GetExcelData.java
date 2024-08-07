package utils;

import java.io.FileInputStream;
import java.io.IOException;

public class GetExcelData {

	public static void main(String[] args) throws IOException {
	
	//	FileInputStream excelPath = new FileInputStream("./datasheet/TestData.xlsx"); //--- Used when file is placed in system drive not in framework
		
		//String projDir = System.getProperty("user.dir");
				//System.out.println(projDir);
				//String excelPath = projDir + "/datasheet/TestData.xlsx";
		
		String excelPath = "./datasheet/TestData.xlsx";
		String sheetName = "Sheet1";
		ExcelUtils excelData = new ExcelUtils(excelPath, sheetName);
		
		excelData.getRowCount();
		
		int rowCount = 1, colCount = 3;
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<=colCount-1;j++) {
				
		excelData.getCellData(i, j);	
			}
		}
		
		excelData.writeData(1, 3, "9845765476");
		
		
		
	}

}
