package Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdowns {
	WebDriver driver;
	
public void Login() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://letcode.in/test");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("//a[text()= 'Drop-Down']")).click();
	}

public void singleDropDown() {
	WebElement fruits = driver.findElement(By.id("fruits"));
	Select A = new Select(fruits);
	A.selectByVisibleText("Pine Apple");
}

public void multselect() {
	WebElement Heros = driver.findElement(By.id("superheros"));
	
	Select B = new Select(Heros);
	B.
	
}
}
