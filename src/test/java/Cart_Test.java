import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cart_Test extends Base_Test{
    @Test
    public void Check_Cart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new Login_Page(driver).performLogin("standard_user","secret_sauce")
                .SortByPriceLowToHigh()
                .performAddToCart()
                .GotoCart();
        Assert.assertTrue(driver.findElement(Cart_Page.CheckOutButton()).isDisplayed());
//        Assert.assertNotNull(By.xpath("//*[@class=\"cart_quantity_label\"]"));
        Assert.assertEquals(driver.findElement(Cart_Page.CartItem()).getText(),"Sauce Labs Onesie");
    }
}
