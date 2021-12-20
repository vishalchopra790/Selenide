package org.tests;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
public class FrameTest {

    @Test
    public void test(){
        switchTo().frame("");
        switchTo().defaultContent();
    }
}
