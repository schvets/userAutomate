package com.selenium.test.tools;

import com.selenium.test.specification.TestConfig;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public final class WebDriverUtils {
    public final int ABSENCE_TIMEOUT = 5;
    private final long IMPLICITLY_WAIT_TIMEOUT = 4;
    private final long IMPLICITLY_LONG_WAIT_TIMEOUT = 20;
    private static WebDriver driver;

    public WebDriverUtils() {
    }

    public WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments(new TestConfig().getCurrentAuthorizedUser());
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            try {
                driver = new RemoteWebDriver(new URL(new TestConfig().getLocalPort()), capabilities);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            driver.manage().timeouts().implicitlyWait(
                    getImplicitlyWaitTimeout(), TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    long getImplicitlyWaitTimeout() {
        return IMPLICITLY_WAIT_TIMEOUT;
    }
    long getImplicitlyLongWaitTimeout() {
        return IMPLICITLY_LONG_WAIT_TIMEOUT;
    }

    public void load(final String path) {
        getDriver().navigate().to(path);
    }

    public void stop() {
        if (driver != null) {
            try {
                driver.manage().deleteAllCookies();
                driver.close();
            } catch (UnhandledAlertException e) {
                String errorMessage = e.getMessage();
                while (!errorMessage.equals("")) {
                    try {
                        driver.close();
                        errorMessage = "";
                    } catch (UnhandledAlertException e1) {
                        errorMessage = e1.getMessage();
                    }
                }
                driver = null;
                throw new UnhandledAlertException(e.getMessage());
            }
        }
        driver = null;
    }

    public void refresh() {
        getDriver().navigate().refresh();
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    String getTitle() {
        return getDriver().getTitle();
    }

    public void switchToNewWindow() {
        java.util.Set<String> handles = driver.getWindowHandles();
        for (String handle1 : driver.getWindowHandles()) {
            getDriver().switchTo().window(handle1);
            getDriver().manage().window().maximize();

        }
    }

}
