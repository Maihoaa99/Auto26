package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ui.RequestDemoPageUI;

import java.util.List;

public class TestDemo {
    private WebDriver driver;
    private RequestDemoPageUI requestDemoPageUI;
    public TestDemo(WebDriver driver) {
        this.driver = driver;
        this.requestDemoPageUI = new RequestDemoPageUI(driver);
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");
        String getUrl = driver.getCurrentUrl();
        System.out.println("Duong dan web la: " + getUrl);
        // Tạo instance của TestDemo
        TestDemo testDemo = new TestDemo(driver);
        // Sử dụng requestDemoPageUI
        //WebElement element = driver.findElement(By.linkText("Try it free"));
        //WebElement element = driver.findElement(By.partialLinkText("Try"));
        //element.click();
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println("H1: " + element.getText());
        List<WebElement> paragraphers = driver.findElements(By.tagName("button"));
        System.out.println("Paragraphers: ");
        for (WebElement paragrapher : paragraphers) {
            System.out.println(paragrapher.getText());
        }
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        //WebElement button = driver.findElements(By.tagName("button[name='Submit']"));
        System.out.println("Buttons: ");
        for (WebElement button : buttons) {
            System.out.println(button.getText());
        }
        WebElement email = driver.findElement(By.cssSelector("input[name='Email']"));
        email.sendKeys("test@example.com");
        testDemo.requestDemoPageUI.findEmailInput().sendKeys("maithihoa09092003@gmail.com");
        testDemo.requestDemoPageUI.findFirstNameInput().sendKeys("Hoa");
        testDemo.requestDemoPageUI.findLastNameInput().sendKeys("Mai Thi");
        testDemo.requestDemoPageUI.findCompanyInput().sendKeys("CMC Global");
        testDemo.requestDemoPageUI.findPhoneInput().sendKeys("0985406364");
        Select select1 = new Select(testDemo.requestDemoPageUI.findCountryInput());
        select1.selectByVisibleText("Angola");
        Select select2 = new Select(testDemo.requestDemoPageUI.findInterestSelect());
        select2.selectByVisibleText("Scalable Test Automation");
        testDemo.requestDemoPageUI.findCommentTextArea().sendKeys("We can walk you through a custom demo");
        driver.quit();
    }
}
