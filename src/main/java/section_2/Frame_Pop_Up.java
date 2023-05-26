package section_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Pop_Up {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Frames']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[.='org.openqa.selenium'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("(//span[.='Alert'])[1]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String Text =driver.findElement(By.xpath("(//h2[.='Interface Alert'])[1]")).getText();	
		System.out.println(Text);
		
		driver.close();
		
		
		
		
		

	}

}
