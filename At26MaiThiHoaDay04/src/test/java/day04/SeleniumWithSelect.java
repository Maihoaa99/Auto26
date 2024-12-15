package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWithSelect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");
        WebElement interestDropdown = driver.findElement(By.name("Solution_Interest__c"));
        Select select = new Select(interestDropdown);

        //chon 1 tuy chon bang gia tri
        //select.selectByValue("Scalable Test Automation");

        //chon 1 tuy chon bang van ban hien thi
        select.selectByVisibleText("Test Analytics ");

        //chon 1 tuy chon bang chi so index
        //select.selectByIndex(6);

        driver.quit();
    }
}
