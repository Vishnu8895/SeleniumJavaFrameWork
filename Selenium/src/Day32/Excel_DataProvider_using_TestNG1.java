package Day32;

public class Excel_DataProvider_using_TestNG1 {

	public void testData(String excelPath , String sheetName){
		Excel_DataProvider excel = new Excel_DataProvider(excelPath, sheetName);
		
		int rowCount=excel.getrowCountNumber();
		int columnCount = excel.getcolumnCountNumber();
		
		for(int i=0; i<rowCount;i++){
			for(int j=0; j<columnCount;j++){
				
			}
			 
		}
	}
}