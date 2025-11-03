package mavenpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Petstore {
	WebDriver driver;
	
  @Test (priority= 1)
  public void test() throws InterruptedException {
	    driver.findElement(By.linkText("Sign In")).click();  
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Register Now!")).click();  
	    Thread.sleep(2000);
  }
  @Test (priority= 2)
  public void regist() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("hee");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("heepass");
		Thread.sleep(2000);
		driver.findElement(By.name("repeatedPassword")).sendKeys("heepass");
		Thread.sleep(2000);
		driver.findElement(By.name("account.firstName")).sendKeys("lee");
		Thread.sleep(2000);
		driver.findElement(By.name("account.lastName")).sendKeys("hi");
		Thread.sleep(2000);
		driver.findElement(By.name("account.email")).sendKeys("hee@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("account.phone")).sendKeys("3152752991");
		Thread.sleep(2000);
		driver.findElement(By.name("account.address1")).sendKeys("akshya Nagar");
		Thread.sleep(2000);
		driver.findElement(By.name("account.city")).sendKeys("bangalore");
		Thread.sleep(2000);
		driver.findElement(By.name("account.state")).sendKeys("karnadaka");
		Thread.sleep(2000);
		driver.findElement(By.name("account.zip")).sendKeys("518316");
		Thread.sleep(2000);
		driver.findElement(By.name("account.country")).sendKeys("india");
		Thread.sleep(2000);
		driver.findElement(By.name("account.listOption")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("account.bannerOption")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("newAccount")).click();
		Thread.sleep(2000);
}
  @Test (priority= 3)
  public void log() throws InterruptedException
  {
	   driver.findElement(By.linkText("Sign In")).click();  
	   Thread.sleep(2000);
		
	   WebElement inputField = driver.findElement(By.name("password"));
       inputField.clear();
       inputField.sendKeys("heepass");
       Thread.sleep(2000);
      
	   driver.findElement(By.name("signon")).click();
	   Thread.sleep(2000);
  }
  @Test (priority= 4)
  public void tests()
  {
	  WebElement title= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]"));
	  String msg= title.getText(); 
	  String Expected= "Sign Out";
	  if(msg.equalsIgnoreCase(Expected)) { System.out.println("Login success"); }
	  else { System.out.println("Error"); }
  }
  @Test (priority= 5)
  public void order() throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/map/area[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("AV-CB-01")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add to Cart")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Proceed to Checkout")).click(); 
		Thread.sleep(2000);
  }
  @Test (priority= 6)
  public void confirm() throws InterruptedException
  {
	    driver.findElement(By.name("newOrder")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Confirm")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Return to Main Menu")).click(); 
		Thread.sleep(2000);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","E:\\Selenium\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
		 driver= new EdgeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("https://petstore.octoperf.com/actions/Catalog.action");
  }

  @AfterTest
  public void afterTest() {
  }

}
