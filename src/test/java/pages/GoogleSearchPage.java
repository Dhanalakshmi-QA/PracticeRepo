package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.tools.javac.util.List;

public class GoogleSearchPage {

	
		WebDriver driver;
		public GoogleSearchPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(name="q")
		WebElement searchBox;
		
		@FindBy(name="btnK")
		WebElement searchButton;
		
		@FindBy(css="h3")
		List<WebElement> searchResults;
		
		public void searchFor(String query)
		{
			searchBox.sendKeys(query);
			searchButton.submit();
		}
		public void clickFirstResult()
		{
			if(!searchResults.isEmpty())
			{
				searchResults.get(0).click();
			}
				
		}
		

	}


