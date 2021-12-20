package org.tests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class UserActions {
    @Test
    public void test() throws InterruptedException {
        open("https://www.spicejet.com");
        SelenideElement add = $(By.xpath("//div[contains(text(),'Add-ons')]"));
        actions().moveToElement(add).click().perform();

        SelenideElement visa = $(By.xpath("//div[contains(text(),'SpiceMAX')]"));
        visa.click();
        Thread.sleep(5000);

    }

    @Test
    public void draG() {
        open("https://jqueryui.com/resources/demos/droppable/default.html");
        SelenideElement drag = $(By.id("draggable"));
        SelenideElement drop = $(By.id("droppable"));

        actions().clickAndHold(drag).moveToElement(drop).release().build().perform();


    }
}
