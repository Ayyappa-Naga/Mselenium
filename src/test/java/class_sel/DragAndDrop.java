package class_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
@Test
	public static void cookie()throws Exception {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement dragMadrid = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
	WebElement dropSpain = driver.findElement(By.xpath("//div[text()='Spain']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(dragMadrid, dropSpain).perform();
	Thread.sleep(3000);
	WebElement dragRome = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	WebElement dropItaly = driver.findElement(By.xpath("//div[text()='Italy']"));

	act.dragAndDrop(dragRome, dropItaly).perform();
	Thread.sleep(3000);
	
	WebElement dragSeoul = driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
	WebElement dropSouthKorea = driver.findElement(By.xpath("//div[text()='South Korea']"));
Thread.sleep(3000);
	act.dragAndDrop(dragSeoul, dropSouthKorea).perform();
	
	WebElement dragwashington = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	WebElement dropUs = driver.findElement(By.xpath("//div[text()='United States']"));
	Thread.sleep(3000);
	act.dragAndDrop(dragwashington, dropUs).perform();
	
	WebElement dragOslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
	WebElement dropnorway = driver.findElement(By.xpath("//div[text()='Norway']"));
	Thread.sleep(3000);
	act.dragAndDrop(dragOslo, dropnorway).perform();
	
	WebElement dragStockholm = driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
	WebElement dropsweden = driver.findElement(By.xpath("//div[text()='Sweden']"));
	Thread.sleep(3000);
	act.dragAndDrop(dragStockholm, dropsweden).perform();
	
	WebElement dragCopenhagen = driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
	WebElement dropDenmark = driver.findElement(By.xpath("//div[text()='Denmark']"));
	Thread.sleep(3000);
	act.dragAndDrop(dragCopenhagen, dropDenmark).perform();
	
	
	

	}

}
