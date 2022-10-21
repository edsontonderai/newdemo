package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String baseurl = "https://datamateinc.com/";
        driver.get(baseurl);
        driver.findElement(By.xpath( "//*[@id=\"default-btn-01f06781c25298ff3d6c80e52ee04520\"]/span")).click();
        driver.findElement(By.name("name")).sendKeys("Edson");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/form/div/span[2]/input")).sendKeys("emukandabvute@gmail.com");

        Thread.sleep(3000);
        driver.quit();
    }

}