package ieSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Wcht {

    public static void main(String[] args) {
        String baseUrl ="https://www.wcht.org.uk/";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(baseUrl);

        boolean verifyTitle = driver.equals("wccht.com");
        System.out.println(verifyTitle);
        boolean verifyContains = driver.getTitle().contains("wccht");
        System.out.println(verifyContains);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();
    }
}
