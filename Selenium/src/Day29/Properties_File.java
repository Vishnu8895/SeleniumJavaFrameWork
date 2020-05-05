package Day29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Properties_File {
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
	
		getProperty();
		setProperties();
		
	}
		public static void getProperty(){
				
			try {
				
				
			InputStream input = new FileInputStream(projectPath+"/src/Day29/Config.Properties");
			prop.load(input);
			String browser =prop.getProperty("browser");
			
			System.out.println(browser);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		}
		public static void setProperties(){
			try {
				OutputStream output = new FileOutputStream(projectPath+"/src/Day29/Config.Properties");
				prop.setProperty("browser","Firefox");
				prop.store(output, null);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			
		}
	}
}

