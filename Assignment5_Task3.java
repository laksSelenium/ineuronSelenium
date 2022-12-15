package assignment5;
//Open below application and verify that footer has 4 social media icons

//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Task3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		
		List<WebElement> mediaIcons = driver.findElements(By.xpath("//div[contains(@class,'login-footer-sm')]//a"));
		System.out.println("Application contains 4 media icons ? " + (mediaIcons.size() == 4));

		// Verify the mediaIcons order
		
		System.out.println(
				"First media Icon is LinkedIn ? " + mediaIcons.get(0).getAttribute("href").contains("www.linkedin.com"));
		System.out.println(
				"First media Icon is faceBook ? " + mediaIcons.get(1).getAttribute("href").contains("www.facebook.com"));
		System.out.println(
				"First media Icon is twitter ? " + mediaIcons.get(2).getAttribute("href").contains("twitter.com"));
		System.out.println(
				"First media Icon is youTube ? " + mediaIcons.get(3).getAttribute("href").contains("www.youtube.com"));

		driver.quit();
	}

}
