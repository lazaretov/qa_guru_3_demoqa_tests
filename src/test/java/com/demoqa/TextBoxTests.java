package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillFormTest () {
        open("/automation-practice-form");
        Selenide.zoom(0.75);
            //Насколько хорошая идея использовать масштаб?
        $("#firstName").setValue("Dude");
        $("#lastName").setValue("Random");
        $("#userEmail").setValue("random@dude.ai");
        $(".custom-control-label").click();
            /*Не смог найти способ выбрать не первый радио-баттон при таком запросе, как сослаться к
            <label title for="gender-radio-2" class="custom-control-label">Female</label>*/
        $("#userNumber").setValue("88005553535");


    }
}
