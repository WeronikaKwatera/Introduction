import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code 
		
		//create Driver object for chrome Browser
		
		// we will strictly implement methods of webdriver
		//Class name= ChromeDriver, 
		
		//X driver=new X();//
		
		// invoke .exe file first to invoke browsers 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
//		
        WebDriver driver= new ChromeDriver();

        
        driver.get("http://facebook.com");
//        driver.findElement(By.id("email")).sendKeys("this is my first code");
//        driver.findElement(By.name("pass")).sendKeys("123547");
//        driver.findElement(By.linkText("Nie pamietasz has³a?")).click();
        
        driver.findElement(By.cssSelector("#email")).sendKeys("Weronika");
        driver.findElement(By.xpath("//*[@id='passContainer']")).sendKeys("dupa");
        driver.findElement(By.xpath("//*[@id='u_0_i_EE']/div[3]/a")).click();

        
        
        
	}

}
