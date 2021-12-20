package org.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.locks.Condition;

import static com.codeborne.selenide.Selenide.*;
public class FindElementsConcept {

    @Test
    public void test(){
        open("https://www.amazon.com");
       ElementsCollection ele= $$(By.tagName("a"));

        System.out.println(ele.size());
        /*for(SelenideElement e:ele){
            System.out.println(e.getText());
            System.out.println(e.getAttribute("href"));
        }*/
        ele.shouldHave(CollectionCondition.sizeLessThan(400));
        //ele.forEach(e-> System.out.println(e.getText()));
        ele.stream().filter(e->!e.getText().isEmpty()).forEach(e-> System.out.println(e.getText()));
        //ele.last(10).forEach(e-> System.out.println(e.getText()));
        //ele.parallelStream().filter(e->!e.getText().isEmpty()).forEach(e-> System.out.println(e.getText()));
    }
}
