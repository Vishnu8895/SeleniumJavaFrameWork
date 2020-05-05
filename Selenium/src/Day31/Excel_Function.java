package Day31;

public class Excel_Function {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		ExcelSheet_Function_Cell excel= new ExcelSheet_Function_Cell(projectPath+"/Excel/data.xlsx", "Sheet1");

		excel.rowCountNumber();
		excel.cellDataString(0, 0);
		excel.cellDataNumber(1, 1);
	}

}
