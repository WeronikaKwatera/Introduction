import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Xpath  //tagname[@attribute='value']
		// CSS  tagname(attribute='value')
		
		// without tagname:
		// CSS  (class='identity')
		//Xpath //*[@class='identity']
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\spajk\\Desktop\\studia\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("#username")).sendKeys("Weronika");

	}

}
