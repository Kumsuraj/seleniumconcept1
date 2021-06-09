package com.cyient.seleniumbasic;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CyientTest {

	public static void main(String[] args) {
		
		WebDriver db=new FirefoxDriver();
		//ChromeDriver driver=new ChromeDriver();
		//db.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		db.get("https://www.cyient.com/");
     String actutalTitle=db.getTitle();
     System.out.println(actutalTitle);
     String actualUrl=db.getCurrentUrl();
     System.out.println(actualUrl);
	}

}
