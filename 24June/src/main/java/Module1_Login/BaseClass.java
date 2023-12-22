package Module1_Login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	 public WebDriver d;
	public void initialiseBrowser() 
	{
		d=new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
