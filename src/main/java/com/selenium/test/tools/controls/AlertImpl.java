package com.selenium.test.tools.controls;

import com.selenium.test.tools.AlertWrapper;
import com.selenium.test.tools.controls.contracts.Alert;

/**
 * implementation of the Alert popup.
 */
public final class AlertImpl implements Alert {

    /**
     * Alert to handle.
     */
    private AlertWrapper alert;

    /**
     * Constructor.
     * initialization of the <code>alert</code> field.
     *
     * @param anAlert popup to wrap as Alert.
     */
    public AlertImpl(final AlertWrapper anAlert) {
        alert = anAlert;
    }

       @Override
    public void accept() {
        alert.accept();
    }

    @Override
    public void dismiss() {
        alert.dismiss();
    }

    @Override
    public String getText() {
        return alert.getText();
    }
}
