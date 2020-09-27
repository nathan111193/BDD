package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filterpage extends DriverFactory
{
    @FindBy(xpath = "//div[@class='styles__Container-sc-1h5mbdb-0 gCgRbH xs-12--none lg-9--none xs-stack']//div[1]//div[2]//button[1]")
    WebElement AddtoTrolley;

    @FindBy(xpath = "//div[@class='Modalstyles__ButtonSpacer-m74fhr-2 hPvarY xs-12 sm-6--none xs-order-1 sm-order-2']")
    WebElement GotoTrolley;

    public void TrolleyClick()
    {
        AddtoTrolley.click();
    }

    public void TrolleyClick1()
    {
        GotoTrolley.click();
    }

    public void BasketpageURL()
    {
        String actualBasketPage = driver.getCurrentUrl();
        Assert.assertThat(actualBasketPage, Matchers.containsString("https://www.argos.co.uk/basket"));
    }

}
