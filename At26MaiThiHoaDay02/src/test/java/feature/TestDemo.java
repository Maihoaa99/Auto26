package feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ui.RequestDemoPageUI;

public class TestDemo {
    private WebDriver driver;
    private RequestDemoPageUI requestDemoPageUI;
    public TestDemo(WebDriver driver) {
        this.driver = driver;
        this.requestDemoPageUI = new RequestDemoPageUI(driver);
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/request-demo");
        // Tạo instance của TestDemo
        TestDemo testDemo = new TestDemo(driver);
        // Sử dụng requestDemoPageUI
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
