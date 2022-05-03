package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass {

	@Test
	public void duplicateLead() throws InterruptedException {
		
		cd.findElement(By.linkText("Find Leads")).click();
		cd.findElement(By.xpath("//div[@id='findLeads']//span[contains(text(), 'Email')]")).click();
		cd.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sangi.kings@gmail.com");
		cd.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		cd.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']"));
		Thread.sleep(3000);
		String name = cd.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']")).getText();
		System.out.println(name);
		Thread.sleep(3000);
		cd.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']")).click();
		
		cd.findElement(By.xpath("//a[@class='subMenuButton'][contains(text(), 'Duplicate Lead')]")).click();
		if (cd.getTitle().equals("Duplicate Lead"))
		{
			System.out.println("Title verified");
		}
		cd.findElement(By.xpath("//input[@type='submit']")).click();
		if (cd.findElement(By.xpath("//div[@class='form']//span[@id='viewLead_firstName_sp']")).getText().equals(name)) {
			System.out.println("Name is duplicated");
		}
	}

}
