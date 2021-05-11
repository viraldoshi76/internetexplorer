package ieSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Barclays {

    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("Personal banking | Barclays");
        boolean verifyContains = title.contains("Barclays");
        System.out.println(verifyTitle);
        System.out.println(verifyContains);
        System.out.println(title.length());
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}
