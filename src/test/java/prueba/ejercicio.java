package prueba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ejercicio {

	private WebDriver driver;
	
	@Before
	public void configurar() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@Test
	public void test() {

		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		
		WebElement firstN = driver.findElement(By.id("FirstName"));
		firstN.sendKeys("Juan");
		
		WebElement lastN = driver.findElement(By.id("LastName"));
		lastN.sendKeys("Jiménez");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("pruebaso64l@gmail.com");
	
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("contraseña123");
		
		WebElement cpass = driver.findElement(By.id("ConfirmPassword"));
		cpass.sendKeys("contraseña123");
		
		WebElement registerB = driver.findElement(By.id("register-button"));
		registerB.click();
		
		assertEquals("https://demowebshop.tricentis.com/registerresult/1", driver.getCurrentUrl());
	}

	@After
	
	public void terminar () {
		driver.close();
	}
	
}
