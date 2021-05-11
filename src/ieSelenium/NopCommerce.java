package ieSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {

    public static void main(String[] args) {
        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        System.out.println(driver.getCurrentUrl());

        driver.close();



    }
}
