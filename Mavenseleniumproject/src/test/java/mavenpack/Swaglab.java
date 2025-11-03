package mavenpack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Swaglab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","E:\\Selenium\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
		Thread.sleep(2000);
		
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);

        String destinationPath = "E:\\selenium\\Screenshot\\Screenshot 2025-09-26 110627.png";

        try {
           
            FileHandler.copy(sourceFile, new File (destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
        
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		WebElement title= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div"));
		String msg= title.getText();
		String Expected= "Swag Labs";
		if(msg.equalsIgnoreCase(Expected)) {
			 System.out.println("Login success");
		    }
			 else {
				 System.out.println("Error");
			 }
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[1]/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("mino");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("xo");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("559872");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		WebElement test =driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2"));
		String msg1 =test.getText();
		System.out.println(msg1);
		Thread.sleep(2000);
		
		driver.findElement(By.id("back-to-products")).click();
		driver.quit();
	}

}
