package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    // locators
    private static SelenideElement
            linkIndividuals = $(".header__section-navigation").$(byText("Частным лицам")),
            linkFarmers = $(".header__section-navigation").$(byText("Фермерам")),
            linkSmallBusiness = $(".header__section-navigation").$(byText("Малому бизнесу и ИП")),
            linkFail1 = $(".header__section-navigation").$(byText("Несуществующая ссылка 1")),
            linkFail2 = $(".header__section-navigation").$(byText("Несуществующая ссылка 1"));


    public void clickIndividuals() {
        linkIndividuals.click();
    }

    public void clickLinkFarmers() {
        linkFarmers.click();
    }

    public void clickLinkSmallBusiness() {
        linkSmallBusiness.click();
    }

    public void clickLinkFail1() {
        linkFail1.click();
    }

    public void clickLinkFail2() {
        linkFail2.click();
    }


    private static SelenideElement
            linkCareer = $$(".text_links").findBy(text("Карьера")),
            linkPressCentre = $$(".text_links").findBy(text("Пресс центр")),
            linkContacts = $$(".text_links").findBy(text("Контакты")),
            linkAboutCompany = $$(".nav-link").findBy(text("О компании")),
            linkSolutionsServices = $$(".nav-link").findBy(text("Решения и услуги"));

    public void clickCareer() {
        linkCareer.click();
    }



}
