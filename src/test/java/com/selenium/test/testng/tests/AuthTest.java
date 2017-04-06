package com.selenium.test.testng.tests;

import com.selenium.test.pages.AuthPage;
import com.selenium.test.pages.PageUrls;
import com.selenium.test.pages.ProminReport;
import com.selenium.test.specification.TestConfig;
import com.selenium.test.tools.DayQualifier;
import com.selenium.test.tools.WebDriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Aleksandr on 05.04.2017.
 */
public class AuthTest {
    @BeforeClass
    public void setUp() {
        new WebDriverUtils().load(new TestConfig().getSystemUnderTestBaseUrl());
    }

    @AfterClass
    public void tearDown() {
        new WebDriverUtils().stop();
    }

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
    public void testProminReports() {
        SimpleDateFormat curentFormatDate = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = new GregorianCalendar();
        String startDate = curentFormatDate.format(calendar.getTime());
        new WebDriverUtils().load(PageUrls.PROMIN_REPORTS_URL);
        ProminReport prominReport = new ProminReport();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        prominReport.getCreateButton().click();
        prominReport.getChooseTypeButton().click();
        prominReport.getFilterTextInput().type("INKASR");
        prominReport.getSubmitSerchResult().click();
        DayQualifier dayQualifier = new DayQualifier();
        int currentDayNum = dayQualifier.getWeekDay(new java.util.Date());
        Calendar newCalendar = Calendar.getInstance();
        if (currentDayNum == 2) {
            newCalendar.add(Calendar.DATE, -3);
            String endDate = curentFormatDate.format(newCalendar.getTime());
            prominReport.getEndDateInput().type(endDate);
        } else {
            newCalendar.add(Calendar.DATE, -1);
            String endDate = curentFormatDate.format(newCalendar.getTime());
            prominReport.getEndDateInput().type(endDate);
        }
        prominReport.getStartDateInput().type(startDate);
        prominReport.getSubType().selectByVisibleText("TRANSACTION - Отчёт по транзакциям инкасаторов");
        prominReport.getCreateorderButton().click();
    }
}


