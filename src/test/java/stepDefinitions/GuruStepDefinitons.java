package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitons {
    GuruPage guruPage = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi= guruPage.baslikListesi;
        //listemiz webelementlerden olusuyor
        //dolayisiyla bbu webelementlerden hangisi
        //istenen sutun basligini tasiyor bilemeyiz

        int istenenBaslikIntexi=-3;
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIntexi=i+1;
                break;
            }
        }
        //for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilastiralim
        //loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve
        //bulundugu ise yoluma devam etmek istiyorum

        if (istenenBaslikIntexi != -3){ //baslik bulundu
            List<WebElement> istenenSutundakiElementler=
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIntexi+"]"));
            for (WebElement each:istenenSutundakiElementler
                 ) {
                System.out.println(each.getText());
            }

        }else { //baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }

    }
}
