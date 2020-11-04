package test_addbook;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_addressbook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
//		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://161.35.81.8:8080/addressbook/");
		Thread.sleep(3000);
		String btn_title = driver.findElement(By.xpath("//span[text()='Add a New contact']")).getText();
		Assert.assertTrue("Match button title", btn_title.equalsIgnoreCase("Add a New contact"));
		System.out.println("Test Completed");
		driver.close();
		driver.quit();
	}

}
