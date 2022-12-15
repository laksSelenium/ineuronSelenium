package assignment5;
//Open the below application and verify the capture all href values from social media icons. Run a loop and verify if any url contains youtube. If youtube found then break the loop.

//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Task5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		List<WebElement> mediaIcons = driver.findElements(By.tagName("a"));
		System.out.println("Application contains any hyperlinks ? " + (mediaIcons.size() > 0));

		for (WebElement mediaIcon : mediaIcons) {

			String domain = mediaIcon.getAttribute("href");

			if (domain.contains("youtube")) {
				System.out.println("href of link having youtube is " + domain);
				System.out.println("I found the link with domain youtube and hence exiting");
				break;

			}
		}

		driver.quit();
	}

}
