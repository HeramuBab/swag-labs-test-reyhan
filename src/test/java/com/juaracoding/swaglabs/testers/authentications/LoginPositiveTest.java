package com.juaracoding.swaglabs.testers.authentications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.juaracoding.swaglabs.pages.InventoryPage;
import com.juaracoding.swaglabs.pages.LoginPage;
import com.juaracoding.swaglabs.testers.BaseTest;

/**
 * TC-LOGIN-001: Login berhasil dengan kredensial yang valid
 * 
 * Pengguna memasukkan username standard_user dan password secret_sauce yang valid, kemudian menekan tombol login.
 * Sistem memverifikasi kredensial dan mengarahkan pengguna ke halaman inventaris produk.
 * Pengujian memastikan bahwa URL halaman inventaris sesuai dengan yang diharapkan (/inventory.html).
 * 
 * @author Juaracoding
 */
public class LoginPositiveTest extends BaseTest {
  private LoginPage loginPage;
  private InventoryPage inventoryPage;

  @BeforeClass
  public void beforeClass() {
    loginPage = new LoginPage(driver);
    inventoryPage = new InventoryPage(driver);
  }

  @Test(priority = 1)
  public void step01(String username, String password) {
    driver.get("https://www.saucedemo.com/");
  }

  @Test(priority = 2)
  @Parameters({"username"})
  public void step02(String username) {
    loginPage.inputUsername(username);
  }


  @Test(priority = 3)
  @Parameters({"password"})
  public void step03(String password) {
    loginPage.inputPassword(password);
  }

  @Test(priority = 4)
  public void step04(String password) {
    loginPage.inputPassword(password);
  }

  @Test(priority = 5)
  public void result() {
    Assert.assertEquals(inventoryPage.getPathURL(), "/inventory.html");
  }
}
