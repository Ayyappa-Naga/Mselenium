package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("problem_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Robot r = new Robot();
		driver.findElement(By.id("user-name")).sendKeys("problem_user");		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		  String p = "secret_sauce";
		  char ch[]=p.toCharArray();
	        for(int i=0;i<=p.length()-1;i++) {
	        	if(ch[i]!='_') {
	        	int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch[i]);
	        	r.keyPress(keyCode);
	        	r.keyRelease(keyCode);}
	        	else {
	        	
	        	r.keyPress(KeyEvent.VK_SHIFT);
	        	r.keyPress(KeyEvent.VK_MINUS);
	        	
	        	r.keyRelease(KeyEvent.VK_SHIFT);
	        	r.keyRelease(KeyEvent.VK_MINUS);
	        		        	}
	        
	        
	        	
	        	
	        }Thread.sleep(3000);
	        r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	        
	
	    
		
		
		
		}

}
