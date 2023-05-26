package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launching_Chrome {
@Test
	public static void cooooookies()throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/reel/CqUZ17KJydl/?igshid=NzJjY2FjNWJiZg%3D%3D");
		Thread.sleep(9000);
		driver.findElement(By.className("_9zwu")).click();
		System.out.println("done");

	}

}
