package com.selenium.test.testng.tests;

import com.selenium.test.pages.AuthPage;
import com.selenium.test.pages.PageUrls;
import com.selenium.test.pages.ProminReport;
import com.selenium.test.specification.TestConfig;
import com.selenium.test.tools.DayQualifier;
import com.selenium.test.tools.WebDriverUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Aleksandr on 05.04.2017.
 */
public class AuthTest {
    @BeforeTest
    public void setUp() {
        new WebDriverUtils().load(new PageUrls().PROMIN_REPORTS_URL);
    }

/*    @AfterTest
    public void tearDown() {
        new WebDriverUtils().stop();
    }*/

    @Test
    public void testUserAuth() {
        AuthPage authPage = new AuthPage();
        authPage.getLdapTextInput().clear();
        authPage.getLdapTextInput().type(new TestConfig().getLdapUser());
        authPage.getPasswordTextInput().clear();
        authPage.getPasswordTextInput().type(new TestConfig().getLdapPass());
        authPage.getLoginButton().click();
    }

    @Test
    public void testProminReports() throws InterruptedException, AWTException {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_YEAR, -2);
        DayQualifier dayQualifier = new DayQualifier();
        String startDate = dayQualifier.getFormatedDate(calendar.getTime());
        String endDate = dayQualifier.getFormatedDate(new java.util.Date());

        /*
        ProminReport prominReport = new ProminReport();
        Thread.sleep(3000);
        prominReport.getCreateButton().click();
        prominReport.getChooseTypeButton().click();
        prominReport.getFilterTextInput().type("INKASR");
        prominReport.getSubmitSerchResult().click();
        DayQualifier dayQualifier = new DayQualifier();
        int currentDayNum = dayQualifier.getWeekDay(new java.util.Date());
        Calendar calendar = new GregorianCalendar();
        if (currentDayNum == 2) {
            calendar.add(Calendar.DAY_OF_YEAR, -3);
            prominReport.getStartDateInput().type(String.valueOf(calendar.getTime()));
            prominReport.getEndDateInput().type(String.valueOf(new java.util.Date()));
        } else {
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            System.out.println(calendar.getTime());
            String startDate = dayQualifier.getFormatedDate(calendar.getTime());
            String endDate = dayQualifier.getFormatedDate(new java.util.Date());
            prominReport.getStartDateInput().type(startDate);
            prominReport.getEndDateInput().type(endDate);
            System.out.println(startDate);
            System.out.println(endDate);
        }
        prominReport.getSubType().selectByVisibleText("TRANSACTION - Отчёт по транзакциям инкасаторов");

        prominReport.getCreateorderButton().click();
*/
    }
}


