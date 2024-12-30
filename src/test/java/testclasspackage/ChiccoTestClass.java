package testclasspackage;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclasspackage.ChiccoSetup;
import pageclasspackage.Cart;
import pageclasspackage.FirstProductAddToCart;
import pageclasspackage.HygieneAndSafety;
import pageclasspackage.LoginPage;
import pageclasspackage.ProceedToCheckout;
import pageclasspackage.SearchProduct;
import pageclasspackage.TitleVerification;
import pageclasspackage.UserLogin;
import pageclasspackage.UserRegistration;
import pageclasspackage.ViewCart;
import pageclasspackage.Wishlist;
import utilityclasspackage.ExcelReader;

public class ChiccoTestClass extends ChiccoSetup{
	TitleVerification tv;
	
	LoginPage loginPage;
	
	
	@Test (priority=0)
	public void testClass1() throws InterruptedException, IOException
	{
		tv=new TitleVerification(driver);
		tv.titleVerify();
		
		
		UserRegistration ur=new UserRegistration(driver);
		Thread.sleep(2000);
		ur.userIconClick();
		Thread.sleep(2000);
		ur.createAccountClick();
		ur.registrationForm();
		ur.scrollDownSignUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ur.signUpClick();
		Thread.sleep(3000);
		
		UserLogin ul=new UserLogin(driver);
		ul.loginLinkClick();
		
	}
		
		
	@DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {
        return ExcelReader.getExcelData("C:\\\\Users\\\\atuls\\\\Desktop\\\\Login.xlsx", "Sheet1");
    }

    // Test method that runs the test using the data provided by the DataProvider
    @Test(dataProvider = "loginData",priority=1)
    public void dataDrivenTest(String username, String password) {
        loginPage = new LoginPage(driver);
        
        driver.get("https://www.chicco.in/login");
        
        // Perform login operation using the data from the Excel file
        loginPage.login(username, password);
        
        
    }
	

		@Test(priority=2)
		public void testClass2() throws InterruptedException, IOException
		{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		HygieneAndSafety has=new HygieneAndSafety(driver);
		has.hygieneLinkClick();
		
		Thread.sleep(3000);
		has.dropDownSortby();
		Thread.sleep(4000);
		has.itemScreenshot();
		Thread.sleep(3000);
		has.clickItem();
		
		FirstProductAddToCart fpac=new FirstProductAddToCart(driver);
		fpac.windowHandle();
		fpac.firstItemClick();
		Thread.sleep(4000);
		fpac.addToCart();
		
		tv.windowHandle();
		//driver.navigate().back();
		
		ViewCart vc=new ViewCart(driver);
		vc.viewCartItems();
		
		Thread.sleep(5000);
		
		SearchProduct sp=new SearchProduct(driver);
		sp.searchBabyPowder();
		Thread.sleep(5000);
		sp.scrollDownToPriceCheckBox();
		
		
		Wishlist wl=new Wishlist(driver);
		wl.clickPowder();
		wl.windowHandle();
		Thread.sleep(4000);
		wl.addItem();
		wl.scroll();
		Thread.sleep(4000);
		wl.addToCart();
		Thread.sleep(5000);
		wl.scrollUp();
		
		
		Thread.sleep(5000);
		
		
		
		wl.mouseHoverFashion();
		Thread.sleep(4000);
		wl.wishList();
		Thread.sleep(4000);
		wl.addWishListToCart();
		
		Thread.sleep(4000);
		Cart cart=new Cart(driver);
		cart.viewCart();
		Thread.sleep(4000);
		cart.itemIncrease();
		Thread.sleep(4000);
		cart.itemDecrease();
		
		ProceedToCheckout ptc=new ProceedToCheckout(driver);
		ptc.secureCheckout();
		Thread.sleep(4000);
		ptc.address();
		Thread.sleep(4000);
		ptc.paymentProceed();
		Thread.sleep(4000);
		ptc.placeOrder();
		
	
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.quit();
	}

}

