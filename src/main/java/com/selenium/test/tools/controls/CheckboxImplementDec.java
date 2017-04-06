package com.selenium.test.tools.controls;

import com.selenium.test.tools.ContextVisible;
import com.selenium.test.tools.Control;
import com.selenium.test.tools.controls.contracts.Checkbox;
import org.openqa.selenium.By;

/**
 * Created by Sasha on 18.03.2017.
 */
public class CheckboxImplementDec implements Checkbox {

    private Checkbox checkbox;

    public CheckboxImplementDec(By by) {
        this.checkbox = new CheckboxImpl(new Control(new ContextVisible(by)));
    }


    @Override
    public void check() {
        if (!checkbox.isChecked()) {
            checkbox.check();
        }
    }

    @Override
    public void unCheck() {
        if (checkbox.isChecked()) {
            checkbox.check();
        }
    }

    @Override
    public boolean isChecked() {
        return checkbox.isChecked();
    }

    @Override
    public boolean isEnabled() {
        return checkbox.isEnabled();
    }
   }
