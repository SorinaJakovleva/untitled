package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver parluks;
    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
private By loginButton = By.id("login-button");

    public WebElement getLoginButton() {
        return parluks.findElement(loginButton);
    }

    public WebElement getUsernameField(){
      return parluks.findElement(usernameInputField);
    }
        public WebElement getPasswordField(){
        return parluks.findElement(passwordInputField);
    }
    public LoginPage(WebDriver parluks){
        this.parluks = parluks;
    }
}
