package org.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
public class Popup {
    @Test
    public void test(){
  open("https://mail.rediff.com/cgi-bin/login.cgi");
  $(By.name("proceed")).click();

  Alert alert=switchTo().alert();
  String actual=alert.getText();
  Assert.assertEquals("Please enter a valid user nam",actual);
  alert.accept();




    }
}
