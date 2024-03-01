import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart_Page {
    WebDriver driver;

    public Cart_Page(WebDriver driver){
        this.driver = driver;
    }

    public static By CartItem(){
        return By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/a/div");
    }
    public static By CheckOutButton(){
        return By.xpath("//*[@class=\"btn_action checkout_button\"]");
    }


}
