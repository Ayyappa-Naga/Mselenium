package section_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_Select {

	public static void main(String[] args)throws Exception {
	WebDriverManager.chromedriver().setup();
		System.out.println("started browser bro");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement element = driver.findElement(By.xpath("//div[contains(@class,'single_tab_div resp')]/p/select"));
	element.click();
	
	Select s = new Select(element);
//	s.selectByValue("ARG");
	//s.selectByVisibleText("Austria");
	//s.selectByIndex(index no);
	System.out.println(s.isMultiple());
    //s.deselectAll(); //only for multiselect dropdown
    // s.deselectByIndex(index no);
     //s.deselectByValue(String value);
     //s.deselectByVisibleText(String value);
	
	
	
		

	}

}
