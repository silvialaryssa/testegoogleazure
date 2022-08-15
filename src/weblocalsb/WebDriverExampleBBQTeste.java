package weblocalsb;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class WebDriverExampleBBQTeste {
public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://qteste.ath.desenv.bb.com.br/");
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#idToken1")));
element.sendKeys("f9159149");
driver.findElement(By.cssSelector("input#idToken2")).sendKeys("12345678");
driver.findElement(By.cssSelector("input#loginButton_0")).click();

try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.close();
}
}