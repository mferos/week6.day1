package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver cd;

	@BeforeMethod
	public void precondition() throws InterruptedException {
		System.out.println("Precondition called");
		WebDriverManager.chromedriver().setup();
		cd = new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps/control/login");
		cd.manage().window().maximize();

		cd.findElement(By.id("username")).sendKeys("DemoCSR");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void postCondition() {
		System.out.println("Post condition called");
		cd.close();

	}
}
