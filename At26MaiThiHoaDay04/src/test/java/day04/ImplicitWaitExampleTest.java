package day04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExampleTest {
    // Implicit Wait sẽ áp dụng một khoảng thời gian chờ mặc định trước khi ném ra
    // lỗi nếu Selenium không tìm thấy phần tử nào.
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");


    }
}
