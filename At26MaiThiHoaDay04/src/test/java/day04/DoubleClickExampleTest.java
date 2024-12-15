package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExampleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        //tim phan tu nut can double click
        WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        //tao doi tuong action de dung double click
        Actions actions = new Actions(driver);
        //thuc hien double click vao button
        actions.doubleClick(button).perform();
        //xu ly canh bao (alert) xuat hien sau double click
        String alertText = driver.switchTo().alert().getText();
        System.out.println("Alert Text after double click: " + alertText);
        //dong alert
        driver.switchTo().alert().accept();
    }
}
