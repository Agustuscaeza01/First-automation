package com.izzat.automation.tests;

import com.izzat.automation.base.BaseTest;
import com.izzat.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void smokeLoginTest() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        System.out.println("Smoke test completed");
    }
}
