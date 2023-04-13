package Project3;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;
import selenium.SeleniumBase;

import java.awt.*;

public class Lambiek {
    static SeleniumBase base = new SeleniumBase();
    static ChromeDriver driver = base.seleniumInit("https://www.lambiek.net/webshop.html");


    public static void main(String[] args) throws InterruptedException {

        //First test: Choosing a book and adding to the cart

        WebElement Keyword= driver.findElement(By.id("booktitlesearch"));
        WebElement keyword = Keyword;
        keyword.click();
        keyword.sendKeys("Asterix");
        Thread.sleep(8000);
        keyword.sendKeys(Keys.DOWN);
        keyword.sendKeys(Keys.DOWN);
        keyword.sendKeys(Keys.ENTER);
        WebElement submitButton= driver.findElement(By.id("submitButton"));
        submitButton.click();
        WebElement checkout = driver.findElement(By.cssSelector("a.checkout"));

        //Second test searching Asterix'es artist "Albert Uderzo" in the Comiclopdia

       WebElement submitButton1=driver.findElement(By.id("main2-comiclopedia"));
       submitButton1.click();
       WebElement searchBox = driver.findElement(By.name("keyword"));
       searchBox.sendKeys("Albert Uderzo");
       searchBox.click();
       Thread.sleep(8000);
       searchBox.sendKeys(Keys.DOWN);
       searchBox.click();
       searchBox.sendKeys(Keys.RETURN);

        //Third test searching Asterix'es Writer "René Goscinny" in the Comiclopdia
        WebElement link=driver.findElement(By.linkText("René Goscinny"));
        link.click();
        Thread.sleep(8000);
        driver.close(); //closes the browser

















    }}














