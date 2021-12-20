package org.tests;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class NavigationConcepts {
    @Test
    public void Test(){
        open("https://www.google.com");
        System.out.println(title());
        open("https://www.amazon.com");
        System.out.println(title());
        back();
        System.out.println(title());

        forward();
        System.out.println(title());
    }
}
