package org.example.PageObject;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory
{
    @FindBy(id="searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_1gqeQ")
    WebElement SearchButton;

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    WebElement AccountButton;

    @FindBy(xpath = "//header[@id='haas-v2']//a[3]")
    WebElement WishlistButton;

    public void getHomePageURL()
    {
        String actual = driver.getCurrentUrl();
        Assert.assertThat(actual, Matchers.containsString("https://www.argos.co.uk/"));
    }

    public void doSearch(String item)
    {
        SearchTextBox.sendKeys(item);
        SearchButton.click();
    }

    public void getResultPageUrl()
    {
        String actualNikeResult = driver.getCurrentUrl();
        Assert.assertThat(actualNikeResult,Matchers.containsString("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike"));
    }

    public void ClickButton()
    {
        AccountButton.click();
    }

    public void WishlistClick()
    {
        WishlistButton.click();
    }

    public void WishlistResultURL()
    {
        String actualWishlistURL = driver.getCurrentUrl();
        Assert.assertThat(actualWishlistURL,Matchers.containsString("https://www.argos.co.uk/wishlist?clickOrigin=header:home:wishlist"));
    }

    public void multipleSearch(String item)
    {
        SearchTextBox.sendKeys(item);
        SearchButton.click();
    }


}//end of class
