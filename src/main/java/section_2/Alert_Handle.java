package section_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB,"manager",Keys.ENTER);
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='item_link'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ext-comp-1002")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("revi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@value,'      Cancel      ')]")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		Alert alrt=driver.switchTo().alert();
		
		String s =alrt.getText();
		System.out.println(s);
		
		alrt.dismiss();
		
		

	}

}
