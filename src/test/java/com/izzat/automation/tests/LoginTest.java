package com.izzat.automation.tests;

import com.izzat.automation.base.BaseTest;
import com.izzat.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauc1");

        System.out.println("Login successful");
    }
}
