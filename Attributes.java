package week6.day1;

import org.testng.annotations.Test;


public class Attributes {
	
	@Test(priority = -1)
	public void createLead() {
		System.out.println("Create Lead");

	}
	
	@Test(invocationCount = 3)
	public void editLead() {
		System.out.println("Edit Lead");

	}
	
	@Test(enabled = false)
	public void deleteLead() {
		System.out.println("Delete Lead");

	}
	
	@Test(priority = 1)
	public void duplicateLead() {
		System.out.println("Duplicate Lead");

	}

}
