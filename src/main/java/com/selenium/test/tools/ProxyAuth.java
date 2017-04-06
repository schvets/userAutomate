package com.selenium.test.tools;

import com.selenium.test.specification.TestConfig;
import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

/**
 * Created by Aleksandr on 05.04.2017.
 */
public class ProxyAuth {
    public void proxyUserAuth() throws InterruptedException, AWTException {
        StringSelection ldap = new StringSelection(new TestConfig().getLdapUser());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ldap, null);
        Robot rb = new Robot();
        Thread.sleep(100);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        Thread.sleep(100);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(100);
        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(100);
        StringSelection pass = new StringSelection(new TestConfig().getLdapPass());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pass, null);
        Thread.sleep(100);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        Thread.sleep(100);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(100);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }
}
