package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    static WebDriver driver = null;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://serenity-bdd.github.io/");
        driver.quit();
    }
}