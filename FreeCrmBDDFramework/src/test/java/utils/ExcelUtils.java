package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	// Constructor with parameters
	public ExcelUtils(String excelPath, String sheetName) throws IOException {
		
		//String projDir = System.getProperty("user.dir");
		//System.out.println(projDir);
		//String excelPath = projDir + "/datasheet/TestData.xlsx";
		
		 workbook = new XSSFWorkbook(excelPath);
		 sheet = workbook.getSheet(sheetName);
	}
	
	public static void getCellData(int rowNum, int ColNUm) throws IOException {

		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(ColNUm));
		System.out.println(value);
		
		//String cellName = sheet.getRow(1).getCell(rowNum).getStringCellValue();
		//double cellAge = sheet.getRow(1).getCell(rowNum).getNumericCellValue();
		//System.out.println(cellName);
		//System.out.println(cellAge);
	}
	
	public static void getRowCount() throws IOException {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		System.out.println(rowCount);
		
	}

}
