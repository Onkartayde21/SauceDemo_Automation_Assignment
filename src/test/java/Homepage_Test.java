import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Homepage_Test extends Base_Test {
    @Test
    public void SortProduct(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new Login_Page(driver).performLogin("standard_user","secret_sauce")
                .SortByPriceLowToHigh();
        List<WebElement> ProductPrice = driver.findElements(Home_Page.LowProductPrice());
        Assert.assertTrue(isSortedByPriceLowToHigh(ProductPrice));
    }
    @Test
    public void AddtoCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new Login_Page(driver).performLogin("standard_user", "secret_sauce")
                .SortByPriceLowToHigh()
                .performAddToCart();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class=\"fa-layers-counter shopping_cart_badge\"]")).isDisplayed());
    }

    private boolean isSortedByPriceLowToHigh(List<WebElement> productPrice)
    {
        List<WebElement> prices = driver.findElements(Home_Page.LowProductPrice());
        for (int i = 0; i < prices.size() - 1; i++)
        {
            String price1 = prices.get(i).getText().replace("$","");
            String price2 =prices.get(i + 1).getText().replace("$","");
            if(Double.parseDouble(price1)>Double.parseDouble(price2))
            {
                return false;
            }
        }
        return true;
    }
}
