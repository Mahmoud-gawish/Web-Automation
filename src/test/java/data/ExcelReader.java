package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static FileInputStream fis = null;
	
	public FileInputStream getFileInputStream() {
		
		File filePath = new File("src\\test\\java\\data\\data.xlsx");
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
		System.out.println("test data file not found : "+e.getMessage());
		System.exit(0);
		}
		return fis ;
	}
	
	public Object[][] getExcelData() throws IOException{
		
		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int totalNumberOfRows = (sheet.getLastRowNum()+1);
		int totalNumerOfClos = 2;
		String[][] arrayExcelData = new String [totalNumberOfRows][totalNumerOfClos];
		for (int i = 0; i < totalNumberOfRows; i++) {
			
			for (int j = 0; j <totalNumerOfClos; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString();
				
			}
			
		}
		wb.close();
		return arrayExcelData;
		
		
	}
	

}
