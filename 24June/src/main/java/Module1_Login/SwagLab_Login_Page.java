 package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.util.Log;

public class SwagLab_Login_Page
{
	@FindBy(xpath="//input[@id=\"user-name\"]")
	private WebElement UN;
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement PWD;
	@FindBy(xpath="//input[@id=\"login-button\"]")
	private WebElement Login;
	
	public SwagLab_Login_Page(WebDriver d)
	{
		PageFactory.initElements(d,this);
	}
	public void EnterUN(String UserName)
	{
		UN.sendKeys(UserName);
	}
	public void EnterPWD(String pass)
	{
		PWD.sendKeys(pass);
	}
	public void ClickLogin()
	{
		Login.click();
	}
	
}
