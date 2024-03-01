import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login_Test extends Base_Test {
    @Test
    public void validLogin(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new Login_Page(driver).performLogin("standard_user", "secret_sauce");
        Assert.assertTrue(driver.findElement(Home_Page.ProductTab()).isDisplayed());

    }
    @Test
    public void invalidLogin(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new Login_Page(driver).performLogin("locked_out_user","secret_sauce");
        Assert.assertTrue(driver.findElement(Login_Page.ErrorPopUp()).isDisplayed());
    }

}
