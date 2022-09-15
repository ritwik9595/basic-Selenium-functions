import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	static WebDriver driver;
	WebElement firstname;
	WebElement surname;
	WebElement mobilenum;
	WebElement pass;
	WebElement day;
	WebElement gender;
	WebElement submit;
	WebElement month;
	WebElement year;

	public static void main(String args[]) throws IOException{
		
		
		FBSignUp ob = new FBSignUp();
		ob.init();
		ob.objectrepo();
		ob.action();

	}

	public void init() {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzMjM2MzY1LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void objectrepo() {
		
		 firstname = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']"));
		 surname = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='lastname']"));
		 mobilenum = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='reg_email__']"));
		 pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		 day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 gender = driver.findElement(By.xpath("//input[@name='sex']"));
		 submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		
	}
	
	public void action() {
		
		firstname.sendKeys("Ritwik");
		surname.sendKeys("Mukherjee");
		mobilenum.sendKeys("12564");
		pass.sendKeys("7899");
		
		Select select = new Select(day);
		select.selectByVisibleText("10");
		
		Select select1 = new Select(month);
		select1.selectByVisibleText("Sep");
		
		Select select2 = new Select(year);
		select2.selectByVisibleText("2000");
		
		gender.click();
		
		
		submit.click();
		
	}
	
	


}
