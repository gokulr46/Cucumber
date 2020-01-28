package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	static WebDriver driver;
	@Before
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOKUL\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	
	}
	
	@After
	public void close() {
		driver.quit();
	}
	}


