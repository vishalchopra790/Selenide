package org.tests;

import com.codeborne.selenide.AuthenticationType;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.*;
public class BasicAuth {

    @Test
    public void test() throws InterruptedException, MalformedURLException {
        //open("https://the-internet.herokuapp.com/basic_auth", AuthenticationType.BASIC,"admin","admin");
        Configuration.browser="edge";
        open(new URL("https://the-internet.herokuapp.com/basic_auth"), "","admin","admin");
        Thread.sleep(5000);
        String actual=$(By.tagName("p")).getText();
        Assert.assertEquals(actual,"Congratulations! You must have the proper credentials.");
    }
}
