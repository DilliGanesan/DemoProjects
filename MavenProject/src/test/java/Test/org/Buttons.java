package Test.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Buttons{
	WebDriver driver;
	@Test(priority = 1)
	public void loginBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver =  new ChromeDriver();
		 driver.get("https://letcode.in/test");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[text()='Click']")).click();
	}
 //Goto Home and come back here using driver command
	@Test(priority = 2)
	public void btnNavigation() {
		WebElement navi = driver.findElement(By.id("home"));
		navi.click();
		driver.navigate().back();
	}
	
	//Get the X & Y co-ordinates
	@Test(priority = 3)
	public void xyCoordinates() {
		Point point = driver.findElement(By.id("position")).getLocation();
		int x = point.getX();
		int y = point.getY();
       System.out.println("X="+x + "Y=" +y);
       
	}
	
	//Find the color of the button
	@Test(priority =4 )
	public void backGroundclr() {
		WebElement btnClr = driver.findElement(By.id("color"));
		String cssValue = btnClr.getCssValue("background-color");
		System.out.println(cssValue);
	}
	
	//Find the height & width of the button
	@Test(priority = 5)
	public void btnSize() {
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		int width = rect.getWidth();
		int height = rect.getHeight();
		System.out.println(width);
		System.out.println(height);

	}
	
	//Confirm button is disabled
	@Test(priority = 6)
	public void isEnabled() {
		WebElement findElement = driver.findElement(By.id("isDisabled"));
		boolean b = findElement.isEnabled();
		System.out.println(b);
	
	}
	//Click and Hold Button
	@Test(priority = 7)
	public void btnHold() {
		driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
		Actions obj = new Actions(driver);
		obj.clickAndHold();
		driver.quit();
	
}}

