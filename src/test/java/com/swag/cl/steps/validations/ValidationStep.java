package com.swag.cl.steps.validations;

import com.swag.cl.pages.validation.ValidationPages;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPages {

    @Step("Validar visualizacion del modulo producto")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }

}