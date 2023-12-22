package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_Logout_Page
{
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public SwagLab_Logout_Page(WebDriver d)
	{
		PageFactory.initElements(d,this);
	}
	public void ClickLogout()
	{
		logout.click();
	}
}
