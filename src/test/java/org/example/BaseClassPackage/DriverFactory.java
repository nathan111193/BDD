package org.example.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class DriverFactory
{
    public static WebDriver driver;

    public DriverFactory()
    {
        PageFactory.initElements(driver,this);
    }

  /*  public static final String AUTOMATE_USERNAME = "nathanpereira1";
    public static final String AUTOMATE_ACCESS_KEY = "mbQgfv7geuJ87kqxHxyT";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub"; */

    public void openbrowser() throws MalformedURLException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

      /*  DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "latest-beta");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.5.2");



        driver = new RemoteWebDriver(new URL(URL), caps);*/
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.argos.co.uk/");
        //driver.get("https://www.iceland.co.uk/");
        driver.get("https://www.asda.com/");
        //driver.get("https://www.tesco.com/");
        driver.manage().window().maximize();
    }

    public void closebrowser() throws InterruptedException
    {
        Thread.sleep(10000);
        //driver.quit();
    }
}
