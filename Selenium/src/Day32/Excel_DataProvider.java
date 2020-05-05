package Day32;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_DataProvider {

		String projectPath;
		XSSFWorkbook workbook;
		static XSSFSheet sheet;
		
		//constructor
		public Excel_DataProvider(String excelPath , String sheetName){
			try {
				workbook = new XSSFWorkbook(excelPath);
				sheet = workbook.getSheet(sheetName);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		public void main(String[] args) {
			getrowCountNumber();
			getcolumnCountNumber();
			getcellDataString(0,0);
			getcellDataNumber(1,1);
			
		}
			
		public  int getrowCountNumber(){
			
			try {
				
				int rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("No of rows :"+ rowCount); 
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			return 0;
		}
			
			public int getcolumnCountNumber(){
				
				try {
					
					int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
					System.out.println("No of column :"+ columnCount); 
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println(e.getCause());
					e.printStackTrace();
				}
				return 0;
		}
		public static void getcellDataString(int rowNum , int colNum){
			
			
			try {
				
				String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
				System.out.println(cellData);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			}
		public static  void getcellDataNumber(int rowNum , int colNum){
			
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


