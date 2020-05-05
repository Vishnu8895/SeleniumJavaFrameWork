package Day30;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet_Read {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		rowCountNumber();
		cellDataString();
		cellDataNumber();
	}
		
	public static void rowCountNumber(){
		
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows :"+ rowCount); 
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	public static void cellDataString(){
		
		projectPath = System.getProperty("user.dir");
		try {
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		}
	public static void cellDataNumber(){
		projectPath = System.getProperty("user.dir");
		try {
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double cellDataNumber = sheet.getRow(1).getCell(3).getNumericCellValue();
			System.out.println(cellDataNumber);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
	}
		
	}
}

