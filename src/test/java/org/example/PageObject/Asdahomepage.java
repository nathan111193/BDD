package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Asdahomepage extends DriverFactory
{
    @FindBy(xpath = "//header/div[1]/form[1]/input[1]")
    WebElement Search;

    @FindBy(xpath = "//header/div[1]/form[1]/button[1]")
    WebElement searchbutton1;

    public void searchtask() throws InterruptedException
    {
        Thread.sleep(5000);
        Search.sendKeys("cakes");
        searchbutton1.click();
    }

    public void list()
    {
        List<WebElement> cakes = driver.findElements(By.cssSelector("a[class=co-product__anchor]"));

        for (WebElement cake : cakes)
        {
            try
            {
                System.out.println(cake.getText());
                if (cake.getText().equals("ASDA Extra Special Hand Finished Carrot Cake"))
                {
                    cake.click();
                }
            }
            catch (Exception e)
            {
                System.out.println("exception has been handeled");
            }
        }
    }
}
