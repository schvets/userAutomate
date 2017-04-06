package com.selenium.test.pages;

import com.selenium.test.specification.TestConfig;

/**
 * System under test page locators are stored here.
 * in order the possibility the web driver to go directly to the
 * specified page location (not "getting the base url->clicking links" to reach the needed page)
 * is present.
 */
public final class PageUrls {

    public final String BASE_URL = new TestConfig().getSystemUnderTestBaseUrl();

    public final String PROMIN_REPORTS_URL = "http://prominreports.privatbank.ua/WebVyborkiIQ/Vyborki";

/*    public final String ADMIN_MAIN_PAGE =
            String.format("%s/Admin", new TestConfig().getSystemUnderTestBaseUrl());*/
}
