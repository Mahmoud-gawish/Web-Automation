package tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeSuite
	
public void startDriver() {
		
		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		Set<Cookie>  cookies = driver.manage().getCookies();
		cookies.clear();
	}
	
	@AfterSuite
	public void stopDriver() {
		
		driver.close();
		driver.quit();
		
	}

}
