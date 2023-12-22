package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_Menu_Page 
{
	WebDriver d;
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menu;
	
	public SwagLab_Menu_Page(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d,this);
	}
	public void VerifyTitle(String expTitle)
	{
		String actTitle=d.getTitle();
		System.out.println(actTitle);
		if(expTitle.equals(actTitle))
		{
			System.out.println("Pass Title TestCase");
		}
		else
		{
			System.out.println("Title is Wrong");
		}
	}
	
	public void ClickMenu()
	{
		menu.click();
	}
}
