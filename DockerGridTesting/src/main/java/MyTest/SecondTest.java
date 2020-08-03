package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest{
	
	@Test
	public void myntraTest() {
		getDriver().navigate().to("https://www.myntra.com");
		Assert.assertEquals(getDriver().getTitle(), "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	}
	
	@Test
	public void thoughtworksTest() {
		getDriver().navigate().to("https://www.thoughtworks.com");
		Assert.assertEquals(getDriver().getTitle(), "ThoughtWorks: A Global Software Consultancy | ThoughtWorks");
	}

}
