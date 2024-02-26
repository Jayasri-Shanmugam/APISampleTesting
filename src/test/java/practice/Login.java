package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
  @Test
  public void login()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://letcode.in/");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.name("email")).sendKeys("jayasricsemec@gmail.com");
	  driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Jayasri@28");
	  driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
  }
}