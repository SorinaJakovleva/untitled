package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoTest {

    WebDriver parluks;

    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.saucedemo.com/");
        parluks.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }

    @Test
    public void testLoginEmptyUsernameAndPassword() throws InterruptedException {
       WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name")); //UserNameInputField
        lietotajVardsIevadesLauks.sendKeys("asdasdasadaasasasasad");

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorText = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText,"Epic sadface: Username and password do not match any user in this service");

// TDD - test driven development
@Test
public void testLoginEmptyUsernameAndPassword(){
   // testlogin("adasadada")
        }

        Thread.sleep(5000);

    }
}
