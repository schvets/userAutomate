package com.selenium.test.pages.uimaps;

import com.selenium.test.tools.ContextVisible;
import com.selenium.test.tools.Control;
import com.selenium.test.tools.WebDriverUtils;
import com.selenium.test.tools.controls.*;
import com.selenium.test.tools.controls.contracts.*;
import org.openqa.selenium.By;

/**
 * Created by Aleksandr on 05.04.2017.
 */
public class AuthPageUIMap {


    public AuthPageUIMap() {
        if (!(new WebDriverUtils().getCurrentUrl().contains("/auth.privatbank.ua"))) {
            throw new RuntimeException("This is not \"Auth page\" page.");
        }
    }

    public TextInput getLdapTextInput(){
        return new TextInputImpl(new Control(new ContextVisible(By.cssSelector("div:nth-child(1) > input"))));
    }

    public TextInput getPasswordTextInput(){
        return new TextInputImpl(new Control(new ContextVisible(By.cssSelector("#input-password"))));
    }

    public Button getLoginButton(){
        return new ButtonImpl(new Control(new ContextVisible(By.cssSelector("#firstAuth"))));
    }

    public Link getRemindPasswordLink(){
        return new LinkImpl(new Control(new ContextVisible(By.cssSelector("td:nth-child(2) > a"))));
    }

    public Link getChangePasswordLink(){
        return new LinkImpl(new Control(new ContextVisible(By.cssSelector("td:nth-child(2) > div > a"))));
    }

    public Checkbox getChangePasswordCheckbox(){
        return new CheckboxImpl(new Control(new ContextVisible(By.cssSelector("td:nth-child(2) > div > input*"))));
    }

/*    body > div.workspace > div:nth-child(3) > div > div:nth-child(1) > input
    #input-password
    #firstAuth
    body > div.workspace > div:nth-child(3) > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > a
    body > div.workspace > div:nth-child(3) > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > a
    body > div.workspace > div:nth-child(3) > div > table > tbody > tr:nth-child(2) > td:nth-child(2) > div > input*/
}



