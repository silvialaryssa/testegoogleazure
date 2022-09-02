package weblocalsb;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	@Test 
	//public static void main(String[] args) {
	public void exemplPesquisarGoogle(){
	
	    WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
		
		
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
