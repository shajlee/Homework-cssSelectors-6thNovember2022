package homework_cssSelectors_6thNovember2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static WebDriver driver;
	public static Select select;
	
	
	@BeforeTest
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl = "https://www.facebook.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Facebook - log in or sign up";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualCurrentUrl, expectedCurrentUrl);
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void CreateaNewAccount() {
		driver.findElement(By.cssSelector("div._6ltg a")).click();
		driver.findElement(By.cssSelector("div#u_8_a_yt input")).sendKeys("John");
		driver.findElement(By.cssSelector("input#u_8_d_sj")).sendKeys("Smith");
		driver.findElement(By.cssSelector("input#u_8_g_qp")).sendKeys("chowdhurygsa@gmail.com");
		driver.findElement(By.cssSelector("input#u_8_j_7V")).sendKeys("chowdhurygsa@gmail.com");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("Shajlee1@");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 select = new Select(driver.findElement(By.cssSelector("select#month")));
		 select.selectByVisibleText("January");
		 
		 select = new Select(driver.findElement(By.cssSelector("select#day")));
		 select.selectByVisibleText("1");
		 
		 select = new Select(driver.findElement(By.cssSelector("select#year")));
		 select.selectByVisibleText("1983");
		 
		 WebElement radio = driver.findElement(By.cssSelector("input#u_8_5_bO"));
		 radio.click();
		 
		 driver.findElement(By.cssSelector("button#u_8_s_mn")).click();
		 driver.findElement(By.cssSelector("a#u_1q_2_18")).click();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	
		 
		
				
		
		
		
		
		
		
		
		
	}

}
