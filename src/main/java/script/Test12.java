package script;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	private static final String TSgetscreenshotas = null;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		File dest = new File("./photo/test.png");
		
	
		
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
driver.findElement(By.id("email")).sendKeys("amanshukla84@gmail.com");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("test");
driver.findElement(By.name("login")).click();
TakesScreenshot TS = (TakesScreenshot) driver;
File Src = TS.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(Src, dest);

driver.close();



	}

}