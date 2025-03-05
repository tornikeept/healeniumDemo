package ge.tbc.testautomation.pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$x;

public class Page1 {
    public SelenideElement button = $x("//button[@class=\"btn btn-bd-primary py-2 dropdown-toggle d-flex align-items-center\"]");
}
