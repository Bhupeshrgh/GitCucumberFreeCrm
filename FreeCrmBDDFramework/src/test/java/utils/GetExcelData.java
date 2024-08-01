package utils;

import java.io.IOException;

public class GetExcelData {

	public static void main(String[] args) throws IOException {
	
		String excelPath = "./datasheet/TestData.xlsx";
		String sheetName = "Emp details";
		ExcelUtils excelData = new ExcelUtils(excelPath, sheetName);
		
		excelData.getRowCount();
		
		int rowCount = 3, colCount = 3;
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<=colCount-1;j++) {
				
		excelData.getCellData(i, j);	
			}
		}
		
		
		
		
		
	}

}
