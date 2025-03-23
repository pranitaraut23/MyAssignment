package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://testffc.nimapinfotech.com/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		wd.findElement(By.id("mat-input-0")).sendKeys("abc@xyz.com");
		wd.findElement(By.id("mat-input-1")).sendKeys("admin123");
		wd.findElement(By.id("kt_login_signin_submit")).click();
		
		wd.findElement(By.id("toast-container")).click();
		
		
		wd.close();

	}

}
