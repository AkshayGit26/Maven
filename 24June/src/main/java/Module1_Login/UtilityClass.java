package Module1_Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getdata(int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Raviraj\\Desktop\\TestExcel.xlsx");
		Sheet sh=WorkbookFactory.create(f).getSheet("Sheet2");
		String value=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return value; 
	}
	public static void  CaptureSS(WebDriver d,int TCID) throws IOException
	{
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Raviraj\\Pictures\\Auto_SS\\Dec7"+TCID+".jpeg");
		FileHandler.copy(src, dest);
		
	}
}
