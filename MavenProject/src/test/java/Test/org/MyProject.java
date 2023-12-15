package Test.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProject {
	
	WebDriver driver = new ChromeDriver();
	
	
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	    public void openBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}
	@Test(priority = 2)
        public void Login() { 
    	driver.findElement(By.xpath("//input[@data-val-required='Please enter your email']")).sendKeys("dilipsam642@gmail.com");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
    	driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }
	@Test(priority = 3)
	    public void search() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone15");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
	}
	@Test(priority = 4)
	    public void selectCateogory() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Electronics '][1]")).click();
		driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 5)
	    public void sortCategory() throws InterruptedException {
		WebElement price = driver.findElement(By.name("products-orderby"));
		Select s = new Select(price);
		s.selectByVisibleText("Price: High to Low");
		
		WebElement size = driver.findElement(By.name("products-pagesize"));
		Select a =new Select(size);
		a.selectByValue("9");
		Thread.sleep(3000);
	}
	@SuppressWarnings("deprecation")
	@Test(priority = 6)
	    public void addCart() {
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
	}
	@Test(priority = 7)
	    public void checkoutCart() {
		WebElement checkbox = driver.findElement(By.id("termsofservice"));
		checkbox.click();
		driver.findElement(By.xpath("//button[@class='button-1 checkout-button']")).click();
	}
	@Test(priority = 8)
	    public void billingAdress() throws InterruptedException {
		//driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Dilli");
		//driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Ganesan");
		//driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("dilipsam642@gmail.com");
		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select c = new Select(country);
		c.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Chennai");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("No:12345");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("987654");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("2336676876");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue'][1]")).click();
		Thread.sleep(3000);
				
	}
	@Test(priority = 9)
	    public void shippingMethod() throws InterruptedException {
		driver.findElement(By.id("shippingoption_1")).click();
		driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 10)
	    public void paymentMethod() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 11)
	    public void PaymentInfo() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 12)
	    public void confirmOrder() {
		driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	}
    @Test(priority= 13)
	     public void takesScreenshot() throws IOException{ 
		 TakesScreenshot tk = (TakesScreenshot)driver;
		 File src = tk.getScreenshotAs(OutputType.FILE);
		 File des = new File("C:\\Users\\Dilliganesh\\eclipse-workspace\\NewSelenium\\ScreenShot\\alert.png");
		 org.openqa.selenium.io.FileHandler.copy(src, des);
		
	}}
	

