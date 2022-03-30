import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IE {

	public static void main(String[] args) {
		
		//FirefoxDriver
		
		
		//create Driver object for Firefox Browser
		
		// we will strictly implement methods of webdriver
		//Class name= ChromeDriver, 
		
		//X driver=new X();//
		
		// invoke .exe file first to invoke browsers 
		
		//gecko drivers
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\spajk\\Desktop\\studia\\geckodriver.exe");
				
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}
}
