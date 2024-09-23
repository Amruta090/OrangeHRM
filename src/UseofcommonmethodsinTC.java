import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class UseofcommonmethodsinTC {



	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String excelpath=System.getProperty("user.dir")+"\\DataSheets\\ExcelTest.xlsx";
		String sheetName="Sheet5";
		String age =commonlyUsedMethods.readDataFromExcel(excelpath, sheetName, 0, 0);
		String pinCode =commonlyUsedMethods.readDataFromExcel(excelpath, sheetName, 0, 1);
		String mobNum =commonlyUsedMethods.readDataFromExcel(excelpath, sheetName, 0, 2);
		System.out.println(age);
		System.out.println(pinCode);
		System.out.println(mobNum);
		System.out.println("===================================");
	}

}
                                                                                                      