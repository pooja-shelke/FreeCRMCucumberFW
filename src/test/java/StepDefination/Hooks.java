package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hooks {

	WebDriver driver;

	private By email = By.name("email");
	private By password=By.name("password");
	private By login=By.xpath("//div[text()='Login']");

	
	public  Hooks(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterEmail(String e)
	{
		driver.findElement(email).sendKeys(e);
	}

	public void EnterPassword(String p)
	{
		driver.findElement(password).sendKeys(p);
	}
	
	public void ClickMe()
	{
		WebElement e=driver.findElement(login);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
		
	}

}
