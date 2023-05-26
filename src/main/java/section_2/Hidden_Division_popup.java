package section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB,"manager",Keys.ENTER);
		
		driver.manage().window().maximize();
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.xpath("(//div[@class='img'])[1]")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='delete button'])[1]"))).click();
		


	String name =	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'You are about to')])[4]"))).getText();

		
		
		System.out.println(name);

	}

}
