package com.cyient.multipleTabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class MultiTabsPopus {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://eight.openemr.io/openemr/interface/login/login.php?site=default");
        driver.findElement(By.id("authUser")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        //Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
        //selectLanguage.deselectByVisibleText("English (Indian)");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("//div[@role='button']")).click();
        driver.findElement(By.id("logoutinnerframe")).click();
        driver.findElement(By.xpath("//div[text()='Patient/Client']")).click();
        driver.findElement(By.xpath("//div[text()='New/Search']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='pat']")));
        
        Select assign= new Select(driver.findElement(By.id("form_title")));
        assign.selectByVisibleText("Mr.");
        driver.findElement(By.id("form_fname")).sendKeys("Su");
        driver.findElement(By.id("form_lname")).sendKeys("Ku");
        driver.findElement(By.id("form_DOB")).sendKeys("2021-08-04");
        Select gender= new Select(driver.findElement(By.id("form_sex")));
        gender.selectByVisibleText("Male");
        driver.findElement(By.id("create")).click();
        Actions popup= new Actions(driver);
        popup.moveToElement(driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']"))).click().perform();
       

        driver.switchTo().alert().accept();
        
        String alertmsg= driver.switchTo().alert().getText();
        System.out.println(alertmsg);
        System.out.println(driver.findElement(By.xpath("(//div[@class='clearfix'])")).getText());        
        
}

}
