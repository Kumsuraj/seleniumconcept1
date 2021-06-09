package com.cyient.seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
         driver.findElement(By.id("menu_pim_viewMyDetails")).click();
         driver.findElement(By.id("personal_txtOtherID")).sendKeys("test123");
         driver.findElement(By.id("btnSave")).click();
         driver.findElement(By.id("Emergency Contacts")).click();
         driver.findElement(By.id("btnAddContact")).click();
         driver.findElement(By.id("emg_contact_name")).sendKeys("kumar");
         driver.findElement(By.id("emgcontact_relationship")).sendKeys("brother");
         driver.findElement(By.id("emgcontact_homePhone")).sendKeys("6283735377");
         driver.findElement(By.id("emgcontact_mobile")).sendKeys("6283735377");
         driver.findElement(By.id("btnSaveEContact")).click();
         
	}

}
