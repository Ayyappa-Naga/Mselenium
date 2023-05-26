package section_2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggest {

	public static void main(String[] args)throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone 11");
		Thread.sleep(4000);
		List<WebElement> element  =driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		/*Iterator<WebElement> i1 = element.iterator();
		while(i1.hasNext())
		{
			String name = i1.next().getText();
			System.out.println(name);
		}
		*/
		for(WebElement e1 :element)
		{
			String name= e1.getText();
			System.out.println(name);
		}
	}

}
