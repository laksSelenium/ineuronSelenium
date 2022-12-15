package assignment5;
//Open below application and verify logo is present or not

//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		// Approach-1 using List and finding its size
		List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='orangehrm-logo']"));
		System.out.println("Application contains logo using List approach ? " + (logo.size() > 0));

		// Approach-2 - Get pagesource and check for logo
		String appPageSource = driver.getPageSource();
		System.out.println("Application contains logo using pagesource approach ? " + appPageSource.contains("logo"));
		
		 driver.quit();
	}

}
