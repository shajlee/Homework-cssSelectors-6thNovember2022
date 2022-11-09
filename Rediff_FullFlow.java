package homework_cssSelectors_6thNovember2022;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_FullFlow {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl = "https://www.rediff.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualCurrentUrl, expectedCurrentUrl);
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void clickOnSignInLink() {
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("chowdhurygs@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Shajlee1@");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void clickOnLogoutButton() {
		driver.findElement(By.cssSelector("a[class=rd_logout]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void clickOnHomeButton() {
		driver.findElement(By.cssSelector("div.header b")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		
		
		
	
	
		
	}

}
