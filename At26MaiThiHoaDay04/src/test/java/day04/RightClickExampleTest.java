package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExampleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        //tim phan tu nut can double click
        WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
        //tao doi tuong action de dung double click
        Actions actions = new Actions(driver);
        //thuc hien right click vao button
        actions.contextClick(button).perform();
        WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
        edit.click();
        driver.switchTo().alert().accept();
    }
}
