package org.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.sql.Connection;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
public class LaunchBrowserTest {

    @Test
    public void launchBrowser() {
        Configuration.browser="firefox";
        Configuration.headless=false;
        Configuration.browserSize="1024x768";
        screenshots=false;
        //Configuration.browserBinary="";
        //Configuration.baseUrl=true;
        //mvn clean install -Dselenide.broswer="chrome"
        open("https://www.google.com");
        $(By.name("q")).setValue("Vishal Industry");
        $(By.name("q")).sendKeys(Keys.ENTER);

        $(By.id("logo")).shouldHave(appear);
        int headercount=$$(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).size();
        $$(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(9));
        System.out.println(headercount);
    }

}
