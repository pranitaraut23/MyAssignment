package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Register {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://testffc.nimapinfotech.com/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		wd.findElement(By.linkText("Sign Up")).click();
		wd.findElement(By.id("mat-input-2")).sendKeys("Alpha");
		
		wd.findElement(By.id("mat-select-value-1")).click();
		List<WebElement>values=wd.findElements(By.className("kt-register-select-country-name"));
		try {
		for(WebElement op:values) {
			if(op.getText().equals("Hungary")) {
				op.click();
			}
		}
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		
		wd.findElement(By.id("mat-input-4")).sendKeys("admin@123");
		
		wd.findElement(By.id("mat-input-5")).sendKeys("ghf@gmail.com");
		wd.findElement(By.id("kt_login_signin_submit")).click();
	}

}
