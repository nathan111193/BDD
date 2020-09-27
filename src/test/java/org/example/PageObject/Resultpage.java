package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory
{
    @FindBy(xpath = "//span[contains(text(),'Travel')]")
    WebElement Travel;

    @FindBy(xpath = "//label[@id='filter-price-£5 - £10-label']//div[@class='checkboxWrapper']")
    WebElement Price;

    @FindBy(id = "accordion-controls-filter-799635")
    WebElement SportsandFitness;

    @FindBy(xpath = "//label[@id='filter-price-£15 - £20-label']//div[@class='checkboxWrapper']")
    WebElement Price1;

    public void TravelClick()
    {
        Travel.click();
    }

    public void PriceClick()
    {
        Price.click();
    }

    public void SportsandFitnessClick()
    {
        SportsandFitness.click();
    }

    public void SportsandFitnessURL()
    {
        String actualSporstandFitnessURL = driver.getCurrentUrl();
        Assert.assertThat(actualSporstandFitnessURL, Matchers.containsString("https://www.argos.co.uk/search/nike/category:799635/"));
    }

    public void Price1Click()
    {
        Price1.click();
    }

    public void Price1URL()
    {
        String actualPrice1URL = driver.getCurrentUrl();
        Assert.assertThat(actualPrice1URL, Matchers.containsString("https://www.argos.co.uk/search/nike/price:%C2%A315-%252D-%C2%A320/"));
    }
}
