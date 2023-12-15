
package Test.org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BasicProject
{
	WebDriver driver;
@Test
public void loginURL1() {
WebDriverManager.chromedriver().setup();

		
driver = new ChromeDriver();

driver.get("https://www.facebook.com/"); 
driver.manage().window().maximize();



	}
@Test
public void loginURL2() {
WebDriverManager.edgedriver().setup();

		
driver = new EdgeDriver();

driver.get("https://www.facebook.com/"); 
driver.manage().window().maximize();
driver.quit();


	}
}


