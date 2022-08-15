package weblocalsb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class WebDriverExamplePlataforma {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://plataforma.hm.bb.com.br/gaw/v3/");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#idToken1")));
	element.sendKeys("f9159149");
	driver.findElement(By.cssSelector("input#idToken2")).sendKeys("53072409");
	driver.findElement(By.cssSelector("input#loginButton_0")).click();

	try {
		   	Thread.sleep(10000);
		   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'AMBIENTE DE HOMOLOGACAO')]")));
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-ng-model='vm.inputTypeahead']")));
			element1.click();
			
		try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
    	}
    	catch(Exception e) {
    		//jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
    	}
    		//System.out.println(driver.getTitle());
    		System.out.println("Final do Script");
    		driver.quit();

	
}
}