package weblocalsb;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * This class show how to use selenium web driver
 * https://github.com/julianommartins/seleniumWebDriver
 * 
 * @author julianom
 *
 */
public class WebDriverExampleGoogle {
	public static void main(String[] args) {
// If you want to load a existing profile
// Option 1
// ProfilesIni profile = new ProfilesIni();
// FirefoxProfile julianoProf = profile.getProfile("default");
// FirefoxOptions options = new FirefoxOptions().setProfile(julianoProf);
//
// Option 2
// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//	capabilities.setCapability("marionette", true);
// capabilities.setCapability(FirefoxDriver.PROFILE, julianoProf);

		System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
// option 1 to use existing profile
//WebDriver driver = new FirefoxDriver(options);
// option 2 to use existing profile
//WebDriver driver = new FirefoxDriver(capabilities);
		


		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       // driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
        
       // Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
             //   .withTimeout(Duration.ofSeconds(30))
              //  .pollingEvery(Duration.ofSeconds(5))
              //  .ignoring(NoSuchElementException.class);
        
       // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        
		driver.get("http://www.google.com");
	
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait
				//.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		
		WebElement element1 = driver.findElement(By.name("q"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		element1.sendKeys("Banco do Brasil");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		element1.submit();
         System.out.println("Page title is: " + driver.getTitle());
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.close();
		
		;
	}
}