package com.juaracoding.swaglabs.components;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavbarComponent extends BaseComponent {
  private By burgerMenu = By.id("react-burger-menu-btn");
  private By resetSidebarLink = By.id("reset_sidebar_link");

  public NavbarComponent(WebDriver driver) {
    super(driver);
  }

  public void clickBurgerMenu() {
    WebElement element = waitingElementReady(burgerMenu);
    element.click();
  }

  public void clickResetSideBar() {
    WebElement element = waitingElementReady(resetSidebarLink);
    element.click();
  }

}
