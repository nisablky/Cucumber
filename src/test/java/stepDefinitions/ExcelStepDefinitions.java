package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {
    Workbook workbook;

    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu="src/test/resources/baskentler-listesi.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
       workbook = WorkbookFactory.create(fis);

    }
    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreYazisi=workbook
                .getSheet("Table1")
                .getRow(satir-1)
                .getCell(sutun-1)
                .toString();
        System.out.println(satir+".satir " + sutun+ ".sutundeki deger : " + istenenHucreYazisi);

    }
    @Then("baskenti berlin olan ulke ismini yazdirir")
    public void baskenti_berlin_olan_ulke_ismini_yazdirir() {
        //for loop ile tum satirlari kontrol etmem gerekiyor
        //bunun icin de satir sayisina ihtiyacim var
        int satirSayisi = workbook.getSheet("Table1").getLastRowNum();

        for (int i = 0; i <=satirSayisi ; i++) {
            if (workbook.getSheet("Table1").getRow(i).getCell(1).toString().equals("Jakarta")){
                System.out.println("Baskenti Jakarta olan ulke : "+
                        workbook.getSheet("Table1").getRow(i).getCell(0));
            }

        }

    }
    @Then("ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {
        int actualUlkeSayisi = workbook.getSheet("Table1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi==actualUlkeSayisi);


    }
    @Then("fiziki olarak kullanilan satir sayisinin {int} oldugunun test edin")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunun_test_edin(Integer fizikiKullanilanSatir) {
        int actualFizikiKulSatir= workbook.getSheet("Table1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanilanSatir==actualFizikiKulSatir);


    }

}
