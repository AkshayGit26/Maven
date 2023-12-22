package Set1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracNewClass {
	
		public static void main(String[] args) {
			WebDriver d=new ChromeDriver();

			d.get("https://www.facebbok.com/v1/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

}
