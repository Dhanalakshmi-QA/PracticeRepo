package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	
		WebDriver driver;
		GoogleSearchPage googlePage;
		@BeforeClass
		public void setup()
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			googlePage = new GoogleSearchPage(driver);
		}
		
		@Test
		public void searchDogsAndClickFirstLink()
		{
			googlePage.searchFor("Dogs");
			googlePage.clickFirstResult();
		}
		@Test
		public void helloWorld()
		{
			System.out.println("Hello world");
			System.out.println("Hi");
		}
		
		@AfterClass
		public void teardown()
		{
			driver.quit();
		}

	}


