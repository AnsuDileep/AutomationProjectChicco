package baseclasspackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ChiccoSetup {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chicco.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	

}
