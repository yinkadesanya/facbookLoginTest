package myFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setting the property of your test
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\AUTOMATION TOOLS\\Drivers\\ChroneDriver\\chromedriver.exe");
	   	 
	   	 //Creating an instance of driver, to launch browser
	   	 WebDriver browser = new ChromeDriver();
	   	 
	   	 //to open the faacebook login page
	   	 browser.get("https://www.facebook.com/");
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser.getTitle());
	   	 
	   	 //to write email into email field
	   	 browser.findElement(By.id("email")).sendKeys("yeancaholic@yahoo.com");
	   	 
	   	 //to write password into the password field
	   	 browser.findElement(By.id("pass")).sendKeys("tomkak2807");
	   	 
	   	 //to click the login button
	   	 browser.findElement(By.id("u_0_b")).click();
	   	 
	   	 //to close the browser
	   	 browser.close();}

}
