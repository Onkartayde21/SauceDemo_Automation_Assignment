import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Login_Page {

    WebDriver driver;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");

    public static By ErrorPopUp(){
        return By.xpath("//*[@class=\"error-button\"]");
    }

    public Home_Page performLogin(String username, String password){
        driver.findElement(userNameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
        return new Home_Page(driver);

    }



}
