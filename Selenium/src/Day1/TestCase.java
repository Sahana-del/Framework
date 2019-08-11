package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	public static void main(String[] args) {

		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\haris\\Desktop\\Sahana Job\\Selenium\\firefox driver\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.manage().window().maximize();
	}

}
