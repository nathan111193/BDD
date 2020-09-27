package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks
{
    DriverFactory driverFactory = new DriverFactory();

    @Before//cucumber setup
    public void setup()
    {
        driverFactory.openbrowser();
    }

    @After//cucumber setup
    public void teardown()
    {
        driverFactory.closebrowser();
    }
}
