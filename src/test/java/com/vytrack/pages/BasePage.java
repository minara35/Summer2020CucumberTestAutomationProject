package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    @FindBy(className ="oro-subtitle")
    protected WebElement pageSubtitle;

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getPageSubTitleText(){
        return pageSubtitle.getText();
    }

}
