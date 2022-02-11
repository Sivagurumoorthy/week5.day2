package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditLead extends BaseeClass 
{
	@BeforeClass
	public void setUp() {
		
		fileName = "EditLead";
	}
	
	@Test (dependsOnMethods = "week5.day2.CreateLead.cratelead", dataProvider = "fetchData")
	public void editLead (String cName, String NAME) throws InterruptedException {
		
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(cName);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	System.out.println(driver.getTitle()); 
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	WebElement Companyname = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName'][@name='companyName']"));
	Companyname.clear();
	Companyname.sendKeys(NAME);
	driver.findElement(By.className("smallSubmit")).click();		
	}}

