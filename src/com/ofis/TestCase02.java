package com.ofis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase02 {

    /*
1-driver olusturalim
2-java class'imiza chromedriver.exe'yi tanitalim
3-driver'in tum ekrani kaplamasini saglayalim
4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
  söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
5- google'a gidelim
  arama kutusuna "city bike" yazdıralım
6- Arama sonuclarını ekrana yazdıralım
7- Google ın altındaki alışveriş butonuna tıklayalım.

 */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        WebElement searcBox=driver.findElement(By.name("q"));
        searcBox.sendKeys("city bike"+ Keys.ENTER);

        WebElement sonuc=driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());

        WebElement alisverisLink = driver.findElement(By.linkText("Alışveriş"));
        alisverisLink.click();
        driver.quit();



    }
}
