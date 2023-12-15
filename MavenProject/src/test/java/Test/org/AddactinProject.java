package Test.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddactinProject {
	@Test
	public void EntireProject() throws InterruptedException, IOException, AWTException {
		System.setProperty("Webdriver.edge.driver", 
				"C:\\Users\\Dilliganesh\\eclipse-workspace\\NewSelenium\\Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		//login page
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("GANESH2410");
		Thread.sleep(1000);
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("admin123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		driver.navigate().refresh();
		
		//search hotel/drop-downs
		
		WebElement Location = driver.findElement(By.name("location"));
		Select s = new Select(Location);
		s.selectByVisibleText("New York");
		Thread.sleep(1000);
		
		
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select a =new Select(Hotel);
		a.selectByValue("Hotel Creek");
		Thread.sleep(1000);
		
		WebElement Room = driver.findElement(By.id("room_type"));
		Select b =new Select(Room);
		b.selectByIndex(2);
		Thread.sleep(1000);
		
		WebElement RoomType = driver.findElement(By.id("room_nos"));
		Select c =new Select(RoomType);
		c.selectByVisibleText("2 - Two");
		Thread.sleep(1000);
		
		WebElement Checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Checkin.clear();
		Thread.sleep(1000);
		Checkin.sendKeys("01/10/2023");
	
		
		WebElement Checkout = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
		Checkout.clear();
		Thread.sleep(1000);
		Checkout.sendKeys("05/10/2023");
		
		
		WebElement AdultperRoom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select d =new Select(AdultperRoom);
		d.selectByValue("3");
		Thread.sleep(1000);
		
		WebElement Childroom = driver.findElement(By.id("child_room"));
		Select f =new Select(Childroom);
		f.selectByValue("2");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class='reg_button'])[1]")).click();
		
		driver.navigate().refresh();
		driver.navigate().forward();
		
		//radiobutton
		
		WebElement RadioBtn = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		boolean r = RadioBtn.isSelected();
		System.out.println(r);
		RadioBtn.click();
		Thread.sleep(1000);
		
		WebElement continueBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		continueBtn.click();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		//booking page
		WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		 userName.sendKeys("Dilli");
		 Thread.sleep(1000);
		 
		 WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		 lastName.sendKeys("Ganesan");
		 Thread.sleep(1000);
		 
		 WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		 address.sendKeys("no:123, SLA, kk nagar,chennai");
		 Thread.sleep(1000);
		 
		 WebElement CardNo = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		 CardNo.sendKeys("3534657568782567");
		 Thread.sleep(1000);
		
		 WebElement cardtype = driver.findElement(By.xpath("//select[@class='select_combobox']"));
		 Select g =new Select(cardtype);
		 g.selectByValue("VISA");
		 Thread.sleep(1000);
		 
		 WebElement ExpiryDate = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		 Select j = new Select(ExpiryDate);
		 j.selectByVisibleText("December");
		 Thread.sleep(1000);
		 
		 WebElement ExpiryYear = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		 Select j1 = new Select(ExpiryYear);
		 j1.selectByVisibleText("2030");
		 Thread.sleep(1000);
		 
		 WebElement Cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		 Cvv.sendKeys("777");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 
		 
		// print orderId
		 
		 WebElement OrderId = driver.findElement(By.xpath("//input[@name='order_no']"));
		 System.out.println("MY ORDER ID:"+OrderId.getAttribute("value"));
		 Thread.sleep(1000);
		
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		 
		 Thread.sleep(2000);
		 
		 TakesScreenshot tk = (TakesScreenshot)driver;
		 File src = tk.getScreenshotAs(OutputType.FILE);
		 File des = new File("C:\\Users\\Dilliganesh\\eclipse-workspace\\NewSelenium\\ScreenShot\\alert.png");
		 FileHandler.copy(src, des);
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 driver.navigate().refresh();
		 
		 Thread.sleep(2000);
		
		 
		// copy/paste the order id in search field
		 
		 driver.findElement(By.xpath("(//input[@disabled='disabled'])[15]")).click();
		 Robot al = new Robot();
		 al.keyPress(KeyEvent.VK_CONTROL);
		 al.keyPress(KeyEvent.VK_A);
		 al.keyPress(KeyEvent.VK_C);
		 al.keyRelease(KeyEvent.VK_CONTROL);
		 al.keyRelease(KeyEvent.VK_A);
		 al.keyRelease(KeyEvent.VK_C);
		 
		 Thread.sleep(2000);
		driver.navigate().forward();
		 driver.navigate().refresh();
		 
		 //search bar
		driver.findElement(By.xpath("//input[@class='input_search']")).click();
		
		 al.keyPress(KeyEvent.VK_CONTROL);
		 al.keyPress(KeyEvent.VK_V);
		 al.keyRelease(KeyEvent.VK_CONTROL);
		 al.keyRelease(KeyEvent.VK_V);
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@style='width:50px;']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='cancelall']")).click();
		 
		 Alert b1 = driver.switchTo().alert();
		 Thread.sleep(3000);
	     b1.accept();
	       
	        
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@value='Logout']")).click();
		 
		
		
		 
	}

}
