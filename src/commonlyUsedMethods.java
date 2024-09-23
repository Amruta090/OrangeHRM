import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class commonlyUsedMethods {

		// screenShot
		// scrollIng
		// excelDataReading
		// Wait
	public static void takescreenshot(WebDriver driver) throws IOException {
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		File Destination=new File("C:\\Users\\s\\eclipse-workspace\\java basics\\Coverfox Project\\src\\screenshots\\"+timeStamp+".png");
		FileHandler.copy(sourceFile, Destination);
	}
		public static String readDataFromExcel(String excelpath,String sheetName,int rowNum,int cellNum ) throws EncryptedDocumentException, IOException {
			FileInputStream myfile= new FileInputStream ("C:\\Users\\s\\eclipse-workspace\\java basics\\Coverfox Project\\src\\excel\\Datareading.xlsx");	
			String value= WorkbookFactory.create(myfile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			return value;
			
		}
		
	}

