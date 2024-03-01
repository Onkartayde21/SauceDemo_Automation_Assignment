import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Home_Page {
    WebDriver driver;

    public Home_Page(WebDriver driver){
        this.driver=driver;
    }

    private By sortDropdown = By.xpath("//*[@class=\"product_sort_container\"]");
    private By LowPriceProduct = By.className("btn_inventory");
    private By CartIcon = By.xpath("//*[@class=\"shopping_cart_container\"]");

    public static By LowProductPrice(){
        return By.className("inventory_item_price");
    }
    public static By ProductTab(){
        return By.xpath("//*[@class=\"product_label\"]");
    }



    public Home_Page SortByPriceLowToHigh(){
        Select dropdown = new Select(driver.findElement(sortDropdown));
        dropdown.selectByValue("lohi");
        return new Home_Page(driver);

    }

    public Home_Page performAddToCart(){
        List<WebElement> Products = driver.findElements(LowPriceProduct);
        Products.get(0).click();
        return new Home_Page(driver);
    }
    public Cart_Page GotoCart(){
        driver.findElement(CartIcon).click();
        return new Cart_Page(driver);
    }
}
