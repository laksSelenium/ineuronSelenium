package assignment5;
//Open below application
//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login//
//Capture the application url and verify url ends with “login”//
//Capture the application url and verify url contains “demo”//
//Capture the application title and verify title contains HRM 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Task1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String appURL = driver.getCurrentUrl();

		// Capture the application url and verify url ends with “login”
		System.out.println("Application ends with login ? " + appURL.endsWith("login"));

		// Capture the application url and verify url contains “demo”
		System.out.println("Application contain word demo ? " + appURL.contains("demo"));

		String appTitle = driver.getTitle();

		// Capture the application title and verify title contains HRM
		System.out.println("Application title contains HRM? " + appTitle.contains("HRM"));

		driver.quit();
	}

}
