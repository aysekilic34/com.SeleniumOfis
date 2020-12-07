package com.ofis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestCase05 {
     /*
    1. wikipedia.org sitesine gidin
    2. arama kutusuna selenium webdriver ı girin
    3. Sonuçlar kısmındaki Selenium (software) e tıklayın
    4. url'nin Selenium_(software)' ile bittiğini doğrulayın
​
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org");

        WebElement searchBox=driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("selenium webdriver"+ Keys.ENTER);
        driver.findElement(By.linkText("Selenium (software)")).click();
        String seleniumURL=driver.getCurrentUrl();
        if(seleniumURL.endsWith("Selenium_(software)")){
            System.out.println("istenen sekılde bıtmektedir");
        }else{
            System.out.println("istenen sekılde bıtmemektedır");
        }

        driver.quit();
    }
}
