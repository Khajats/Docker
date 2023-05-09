package docker;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.Excelutility;

public class LoginTest {

	@Test(dataProvider = "getData", dataProviderClass = Excelutility.class)
	public void loginTest(Map<String, String> map) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/Login");
		driver.findElement(By.id("Username")).sendKeys(map.get("username"));
		driver.findElement(By.id("Password")).sendKeys(map.get("password"));
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
