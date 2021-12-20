package org.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class GoogleTest {

    @Test
    public void googleSearchTest(){
        open("https://www.google.com");
        $(By.name("q")).setValue("Vishal Industry");
        $(By.name("q")).sendKeys(Keys.ENTER);

        $(By.id("logo")).shouldHave(appear);
        int headercount=$$(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).size();
       $$(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(9));
        System.out.println(headercount);

    }
}
