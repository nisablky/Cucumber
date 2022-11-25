package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HerokuappPage;

public class HerokuStepDefinitons {
    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonunaBasar.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        herokuappPage.deleteButonuGorunurOluncayaKadarBekle.isEnabled();

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        herokuappPage.deleteButonuGorunur.isDisplayed();

    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuappPage.deleteButonunaBasar.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        herokuappPage.addElementButonunaBasar.isDisplayed();

    }

}
