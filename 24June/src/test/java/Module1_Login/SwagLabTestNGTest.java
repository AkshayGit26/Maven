package Module1_Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import Module1_Login.SwagLab_Login_Page;
import Module1_Login.SwagLab_Logout_Page;
import Module1_Login.SwagLab_Menu_Page;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabTestNGTest extends BaseClass 
{
	
	SwagLab_Login_Page lo;
	SwagLab_Menu_Page mu;
	SwagLab_Logout_Page ln;
	Sheet sh;
	int TCID;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
//		FileInputStream f=new FileInputStream("C:\\Users\\Raviraj\\Desktop\\TestExcel.xlsx");
//		sh=WorkbookFactory.create(f).getSheet("Sheet2");
		
//		d=new ChromeDriver();
//		d.get("https://www.saucedemo.com/v1/");
//		d.manage().window().maximize();
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		initialiseBrowser();
		lo=new SwagLab_Login_Page(d);
		mu=new SwagLab_Menu_Page(d);
		ln=new SwagLab_Logout_Page(d);
		
	}
	@BeforeMethod
	public void LoginApp() throws EncryptedDocumentException, IOException
	{
		lo.EnterUN(UtilityClass.getdata(0,0));
		lo.EnterPWD(UtilityClass.getdata(0,1));
		lo.ClickLogin();
	}
	@Test
	public void verifyTitle()
	{
		TCID=101;
		mu.VerifyTitle(sh.getRow(0).getCell(1).getStringCellValue());
		
	}
	@AfterMethod
	public void LogoutApp(ITestResult a) throws InterruptedException, IOException
	{
		if(a.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(d,TCID);
		}
		mu.ClickMenu();
		Thread.sleep(3000);
		ln.ClickLogout();
		Thread.sleep(3000);
		
	}
	@AfterClass
	public void CloseBrowser()
	{
		d.close();
	}
}
