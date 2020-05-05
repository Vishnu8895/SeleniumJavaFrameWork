package Day31;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet_Function_Cell {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//constructor
	public ExcelSheet_Function_Cell(String excelPath , String sheetName){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		rowCountNumber();
		cellDataString(0,0);
		cellDataNumber(1,1);
		
	}
		
	public static void rowCountNumber(){
		
		try {
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows :"+ rowCount); 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	public static void cellDataString(int rowNum , int colNum){
		
		
		try {
			
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		}
	public static  void cellDataNumber(int rowNum , int colNum){
		
		try {
			double cellDataNumber = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellDataNumber);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
	}
		
	}
}

