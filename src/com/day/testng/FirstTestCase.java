package com.day.testng;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(description = "open the url of the provided site")
    void openURL() {
        System.out.println("open the url");
    }

    @Test(description = "now login the application")
    void login() {
        System.out.println("login the open url website");
    }

    @Test(description = "now logout from the application")
    void logout() {
        System.out.println("now logout please");
    }
}
