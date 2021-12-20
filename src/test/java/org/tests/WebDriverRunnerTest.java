package org.tests;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static com.codeborne.selenide.WebDriverRunner.*;
import static com.codeborne.selenide.Selenide.*;


public class WebDriverRunnerTest {
    @Test
    public void test(){
        open("https://www.google.com");
        clearBrowserCookies();
        clearBrowserCache();
        System.out.println(source());
        System.out.println(url());
        boolean lo=WebDriverRunner.hasWebDriverStarted();
        if(lo){
            System.out.println("yes");
        }
        System.out.println(WebDriverRunner.isChrome());
       List<File> fi= WebDriverRunner.getBrowserDownloadsFolder().files();
        System.out.println(fi.size());
        WebDriverRunner.closeWebDriver();
    }
}
