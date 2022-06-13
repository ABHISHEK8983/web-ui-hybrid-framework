package com.purnadata.libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.purnadata.libraries.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	private static Logger logger = LoggerFactory.getLogger(BaseClass.class);
	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/other/config.properties");
		   prop.load(fis);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization()
	{
		String browserName = prop.getProperty("browser");		
		if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ prop.getProperty("chromedriver.path"));
		driver = new ChromeDriver();
		logger.info("Launching chrome browser");
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ prop.getProperty("iedriver.path"));				
			driver = new InternetExplorerDriver(); 
			logger.info("Launching IE browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
		logger.info("Launched browser successfully");
		
	}

}
