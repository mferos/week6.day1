package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test
	public void createLead() {

		cd.findElement(By.linkText("Create Lead")).click();
		cd.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		cd.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohamed");
		cd.findElement(By.id("createLeadForm_lastName")).sendKeys("Feros");
		cd.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Feros");
		cd.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		cd.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Assignment");
		cd.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("feroseh19@gmail.com");

		WebElement w = cd.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(w);
		s.selectByVisibleText("New York");

		cd.findElement(By.name("submitButton")).click();

		System.out.println("Title - " + cd.getTitle());

	}
}
