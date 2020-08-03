package MyTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{
	
	@Test
	public void facebookTest() {
		Reporter.log(String.format("Facebook Test Started %s", Thread.currentThread().getId()), true);
		getDriver().navigate().to("https://www.facebook.com");
		Assert.assertEquals(getDriver().getTitle(), "Facebook - Log In or Sign Up");
		Reporter.log(String.format("Facebook Test Started %s", Thread.currentThread().getId()), true);
	}
	
	@Test
	public void gmailTest() {
		getDriver().navigate().to("https://www.gmail.com");
		Assert.assertEquals(getDriver().getTitle(), "Gmail");
	}
	
	@Test
	public void instagramTest() {
		getDriver().navigate().to("https//www.instagram.com");
		Assert.assertEquals(getDriver().getTitle(), "Instagram");
	}
	

}
