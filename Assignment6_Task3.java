//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//Write a script that should be able to add user > search user > delete the user.
//Flow- Login > Admin> Add User> Search User > Delete User > Logout
//Add an assertion after each section
//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//Admin/admin123

package assignment_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6_Task3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		// Login
		driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);

		// Navigate to admin and click add
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(3000);

		// ===================================================//

		// Selecting user role
		WebElement userRole = driver.findElement(By.xpath("(//div[contains(@class,'select-text')])[1]"));
		userRole.click();
		List<WebElement> userRoles = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		for (WebElement role : userRoles) {
			if (role.getText().equalsIgnoreCase("Admin")) {
				System.out.println("Required role admin is available and hence selecting it");
				role.click();
				Thread.sleep(1000);
				break;
			}
		}
		String userRoleSet = userRole.getText();
		// ===================================================//

		// Setting employee name
		WebElement emplName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		emplName.sendKeys("a");
		Thread.sleep(2000);
		List<WebElement> employeeName = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		employeeName.get(0).click();
		Thread.sleep(2000);
		String empNameAfterSelect = emplName.getAttribute("value");
		// ===================================================//

		// setting status
		WebElement status = driver.findElement(
				By.xpath("(//label[contains(text(),'Status')]//following::div[contains(@class,'select-text')])[1]"));
		status.click();
		Thread.sleep(2000);
		List<WebElement> statusOptions = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		for (WebElement Status : statusOptions) {
			if (Status.getText().equalsIgnoreCase("Enabled")) {
				System.out.println("Required status is available and hence selecting it");
				Status.click();
				Thread.sleep(1000);
				break;
			}
		}
		String StatusAfterSetting = status.getText();

		// ===================================================//

		// setting username
		WebElement userName = driver.findElement(By.xpath("//label[contains(text(),'Username')]//following::input[1]"));
		userName.sendKeys("Lakshmi");
		Thread.sleep(1000);
		String userNameAfterSetting = userName.getAttribute("value");
		// ===================================================//

		// setting password
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][1]"));
		password.sendKeys("Lakshmi@123");
		Thread.sleep(1000);
		String passWordAfterSetting = password.getAttribute("value");
		// ===================================================//

		// setting Confirmpassword
		WebElement Confpassword = driver.findElement(By.xpath("//label[contains(text(),'Confirm')]//following::input"));
		Confpassword.sendKeys("Lakshmi@123");
		Thread.sleep(1000);
		String confpassWordAfterSetting = Confpassword.getAttribute("value");
		// ===================================================//

		// Assertions of values input in each field before submiting
		WebElement save = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		if (userRoleSet.contains("Admin") && (empNameAfterSelect.contains("a"))
				&& (StatusAfterSetting.contains("Enabled")) && (userNameAfterSetting.contains("Lakshmi"))
				&& (passWordAfterSetting.contains("Lakshmi@123"))
				&& (confpassWordAfterSetting.contains("Lakshmi@123"))) {

			// click save
			System.out.println("All fields are having the value as entered and hence we can submit the record");
			save.click();
			Thread.sleep(9000);

		}

		// =============================================//

		// Search for the user created
		try {
			userName.click();
			userName.sendKeys("Lakshmi");
		} catch (StaleElementReferenceException e) {
			userName = driver.findElement(By.xpath("//label[contains(text(),'Username')]//following::input[1]"));
			userName.sendKeys("Lakshmi");
		}

		try {
			save.click();

		} catch (StaleElementReferenceException e) {
			save = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			save.click();
			Thread.sleep(10000);
		}

		String record = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText();

		if (record.equalsIgnoreCase("(1) Record Found")) {
			System.out.println("username to delete is listed");
		}

		String empName = driver.findElement(By.xpath("//div[normalize-space()='Odis Adalwin']")).getText();
		String user = driver.findElement(By.xpath("//div[normalize-space()='Lakshmi']")).getText();
		String role = driver.findElement(By.xpath("//div[normalize-space()='Admin']")).getText();
		String Status = driver.findElement(By.xpath("//div[normalize-space()='Enabled']")).getText();

		// Validation of data created vs search output

		if (userNameAfterSetting.equalsIgnoreCase(user) && (empNameAfterSelect.contains(empName))
				&& (role.equalsIgnoreCase(userRoleSet)) && (Status.equalsIgnoreCase(StatusAfterSetting))) {
			System.out.println("Search output data is same as data created");
		}

		// Delete the record
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[contains(@class,'label-danger')]")).click();
		Thread.sleep(15000);

		// Verify delete action

		try {
			String actualNoRecordMsg = driver.findElement(By.xpath("//span[text()='No Records Found']")).getText();
			String expectedNoRecordMsg = "No Records Found";
			if (actualNoRecordMsg.equalsIgnoreCase(expectedNoRecordMsg)) {
				System.out.println("Record successfully deleted");
			}

		} catch (Exception e) {
			String actualNoRecordMsg = driver.findElement(By.xpath("//span[text()='No Records Found']")).getText();
			String expectedNoRecordMsg = "No Records Found";
			if (actualNoRecordMsg.equalsIgnoreCase(expectedNoRecordMsg)) {
				System.out.println("Record successfully deleted");
			}

		}

		// logout

		driver.findElement(By.xpath("(//i[contains(@class,'bi-caret-down-fill')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@role='menu']//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		String expectedURL= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(currentUrl.equalsIgnoreCase(expectedURL)) {
			System.out.println("User has successfully logged out of the application");
		}

		driver.quit();

	}

}
