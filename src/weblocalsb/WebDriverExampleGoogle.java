package weblocalsb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * 
 * 
 * @author Silvia Branco
 *
 */
public class WebDriverExampleGoogle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	
		WebElement element1 = driver.findElement(By.name("q"));
		//driver.manage().timeouts().implicitlyWait(0, null)
		//implicitlyWait(Duration.ofSeconds(10));
		element1.sendKeys("Banco do Brasil");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		element1.submit();
         System.out.println("Page title is: " + driver.getTitle());
		//driver.quit();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.close();
		
		;
	}
}
