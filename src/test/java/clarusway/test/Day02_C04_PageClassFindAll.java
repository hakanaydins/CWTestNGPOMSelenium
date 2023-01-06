package clarusway.test;

import clarusway.pages.SauceDemoHomePage;
import clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C04_PageClassFindAll {
    @Test
    public void test(){

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoHomePage lp = new SauceDemoHomePage();

        Assert.assertEquals(3, lp.inputElements.size());
    }


}
