package com.selenium.test.pages;

import com.selenium.test.pages.uimaps.AuthPageUIMap;
import com.selenium.test.tools.controls.contracts.Button;
import com.selenium.test.tools.controls.contracts.TextInput;

/**
 * Created by Aleksandr on 04.04.2017.
 */
public class AuthPage {
    private AuthPageUIMap controls;

    public AuthPage() {
        controls = new AuthPageUIMap();
    }

    public TextInput getLdapTextInput() {
        return controls.getLdapTextInput();
    }

    public TextInput getPasswordTextInput() {
        return controls.getPasswordTextInput();
    }

    public Button getLoginButton() {
        return controls.getLoginButton();
    }

    }
