package assignment5;
//Open the below application and verify the capture all href values from social media icons. Store all 4 href values in map in below format.

//FaceBook - fburl
//Twitter - Twitter url
//Youtube - Youtube URL
//Linkedin - Linkedin URL
//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Task4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		List<WebElement> mediaIcons = driver.findElements(By.xpath("//div[contains(@class,'login-footer-sm')]//a"));
		System.out.println("Application contains 4 media icons ? " + (mediaIcons.size() == 4));

		HashMap<String, String> mediaMapping = new HashMap<String, String>();

		for (WebElement mediaIcon : mediaIcons) {

			String domain = mediaIcon.getAttribute("href").split("//")[1].split("/")[0];

			if (domain.contains("www.")) {
				String media = domain.split("www.")[1].split(".com")[0];
				mediaMapping.put(media, domain);

			} else {
				String media = domain.split(".com")[0];
				mediaMapping.put(media, domain);
			}
		}

		System.out.println("Map containing mediaIcons is " + mediaMapping);

		driver.quit();
	}

}
