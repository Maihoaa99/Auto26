package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestDemoPageUI {
    private final WebDriver driver;

    public RequestDemoPageUI(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findEmailInput() {
        return driver.findElement(By.xpath("//input[contains(@id, 'Email')]"));
    }

    public WebElement findCompanyInput() {
        return driver.findElement(By.xpath("//input[contains(@id, 'Company')]"));
    }

    public WebElement findInterestSelect() {
        return driver.findElement(By.xpath("//select[contains(@id, 'Interest')]"));
    }

    public WebElement findCommentTextArea() {
        return driver.findElement(By.xpath("//textarea[contains(@id, 'Com')]"));
    }

    public WebElement findFirstNameInput() {
        return driver.findElement(By.xpath("//input[contains(@id,'First')]"));
    }

    public WebElement findLastNameInput() {
        return driver.findElement(By.xpath("//input[contains(@id,'Last')]"));
    }

    public WebElement findPhoneInput() {
        return driver.findElement(By.xpath("//input[contains(@id,'Phone')]"));
    }

    public WebElement findCountryInput() {
        return driver.findElement(By.xpath("//select[contains(@id,'Country')]"));
    }
}
