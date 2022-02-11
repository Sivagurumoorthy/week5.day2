package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseeClass {
	@BeforeClass
	public void setUp() {
		
		fileName = "CreateLead";
	}
	
	@Test  (dataProvider = "fetchData")
	
	public void cratelead(String cName, String fName, String lastname, String phonenumber, String Mailid) throws InterruptedException {

// click on create leads
driver.findElement(By.linkText("Create Lead")).click();
//Enter the company name
driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
//Enter the first name
driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
//Enter the Last name
driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SIVA GURUMOORTHY");
//enter the phone number
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phonenumber);
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(Mailid);
driver.findElement(By.className("smallSubmit")).click();
String title2 = driver.getTitle();
System.out.println(title2);
Thread.sleep(30);
}
	

}
		
	


