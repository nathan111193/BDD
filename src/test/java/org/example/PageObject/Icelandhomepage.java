package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Icelandhomepage extends DriverFactory
{
    @FindBy(xpath = "//input[@id='header-search']")
    WebElement searchbox;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]")
    WebElement searchbutton;

    public void icelandsearch()
    {
        searchbox.sendKeys("crisps");
        searchbutton.click();
    }

    public void icelandurl()
    {
        String Icelandresult = driver.getCurrentUrl();
        Assert.assertThat(Icelandresult, Matchers.containsString("https://www.iceland.co.uk/food-cupboard/crisps-nuts-and-snacks"));
    }

    public void icelandhomepage()
    {
        String Icelandhomepage = driver.getCurrentUrl();
        Assert.assertThat(Icelandhomepage, Matchers.containsString("https://www.iceland.co.uk/"));
    }


    public void selection()
    {
        List<WebElement> crisps = driver.findElements(By.cssSelector(".product-name"));

        for(WebElement crisp : crisps)
        {
            System.out.println(crisp.getText());
            if(crisp.getText().contains("Walkers Classic Variety Crisps 24x25g"))
            {
                crisp.click();
            }
        }
    }
}
