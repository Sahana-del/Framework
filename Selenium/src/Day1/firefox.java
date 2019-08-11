package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\haris\\Desktop\\Sahana Job\\Selenium\\firefox driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	 
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 String url ="http://live.guru99.com/index.php/";
	 driver.get(url);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.getTitle();
   /*  String actualTitle = driver.getTitle();
     String expectedTitle = "This is demo site for Guru99";
     if(actualTitle.equalsIgnoreCase(expectedTitle))
    	 System.out.println("Title Matched");
     else
     System.out.println("Title didn't match");*/
     driver.close();
     driver.quit();
    	 
     }

}
