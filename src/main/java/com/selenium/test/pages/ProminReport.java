package com.selenium.test.pages;

import com.selenium.test.pages.uimaps.ProminReportUIMap;
import com.selenium.test.tools.controls.contracts.*;

/**
 * Created by Aleksandr on 04.04.2017.
 */
public class ProminReport {
    private ProminReportUIMap controls;

    public ProminReport() {
        controls = new ProminReportUIMap();
    }

    public Button getCreateButton() {
        return controls.getCreateButton();
    }

    public TextInput getStartDateInputFilter() {
        return controls.getStartDateInputFilter();
    }

    public TextInput getEndDateInputFilter() {
        return controls.getEndDateInputFilter();
    }

    public TextInput getFilterTextInput() {
        return controls.getFilterTextInput();
    }

    public TextInput getStartDateInput() {
        return controls.getStartDateInput();
    }

    public TextInput getEndDateInput() {
        return controls.getEndDateInput();
    }

    public Dropdown getSubType() {
        return controls.getSubType();
    }

    public Button getCreateorderButton() {
        return controls.getCreateorderButton();
    }

    public Button getChooseTypeButton() {
        return controls.getChooseTypeButton();
    }

    public Link getSubmitSerchResult() {
        return controls.getSubmitSerchResult();
    }
}
