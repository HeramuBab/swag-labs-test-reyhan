package com.juaracoding.swaglabs.testers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.juaracoding.swaglabs.listeners.ScreenshotListener;
import com.juaracoding.swaglabs.pages.LoginPage;

@Listeners(ScreenshotListener.class)
public abstract class BaseTest {

  protected WebDriver driver;

  @BeforeMethod
  public void setUp(ITestContext context) {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    context.setAttribute("driver", driver);
    openBrowser("https://www.saucedemo.com/");
  }

  @AfterMethod
  public void teardown(ITestContext context) {
    if (driver != null) {
      driver.quit();
    }
  }
  
  public void openBrowser(String url) {
    driver.get(url);
  }

  public void preTestLogin(String username, String password) {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login(username, password);
  }
  
}
