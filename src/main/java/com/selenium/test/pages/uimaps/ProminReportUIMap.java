package com.selenium.test.pages.uimaps;

import com.selenium.test.tools.ContextVisible;
import com.selenium.test.tools.Control;
import com.selenium.test.tools.Select;
import com.selenium.test.tools.WebDriverUtils;
import com.selenium.test.tools.controls.*;
import com.selenium.test.tools.controls.contracts.*;
import org.openqa.selenium.By;

/**
 * Created by Aleksandr on 05.04.2017.
 */
public class ProminReportUIMap {

    public Button getCreateButton(){
        return new ButtonImpl(new Control(new ContextVisible(By.cssSelector("#xsx > button:nth-child(1)"))));
    }

    public TextInput getStartDateInputFilter(){
        return new TextInputImpl(new Control(new ContextVisible(By.cssSelector("#DF"))));
    }

    public TextInput getEndDateInputFilter(){
        return new TextInputImpl(new Control(new ContextVisible(By.cssSelector("#DT"))));
    }

    public Button getChooseTypeButton(){
        return new ButtonImpl(new Control(new ContextVisible(By.cssSelector("#s2id_combobox > a > span.select2-arrow > b"))));
    }

    public TextInput getFilterTextInput(){
        return new TextInputImpl(new Control(new ContextVisible(By.className("select2-input"))));
    }

    public Link getSubmitSerchResult(){
        return new LinkImpl(new Control(new ContextVisible(By.className("select2-results"))));
    }

    public TextInput getStartDateInput(){
        return new TextInputImpl(new Control(new ContextVisible(By.cssSelector("#DATEFROM_new"))));
    }

    public TextInput getEndDateInput(){
        return new TextInputImpl(new Control(new ContextVisible(By.cssSelector("#DATETO_new"))));
    }

    public Dropdown getSubType(){
        return new DropdownImpl(new Select(new ContextVisible(By.cssSelector("#INKASRTP_new"))));
    }

    public Button getCreateorderButton(){
        return new ButtonImpl(new Control(new ContextVisible(By.cssSelector
                ("#modal > div > div.modal-footer > button.btn.btn-primary"))));
    }

}



