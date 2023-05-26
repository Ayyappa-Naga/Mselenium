package section_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testrun {
	String s;
static WebDriver driver= new ChromeDriver();
	public static void main(String[] args)throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);	
		find("//input[@placeholder='Username']").sendKeys("Admin", Keys.TAB,"admin123",Keys.ENTER);

	}
	public static WebElement find(String s) {
		

		return driver.findElement(By.xpath(s));
	}

}
