# hotel my camp sitesinde 3 adet nagative test senaryosu olusturalim
# 1- dogru username- yanlis password
# 2- yanlis username-dogru password
# 3- yanlis username-yanlis password
Feature: US1006 yanlis bilgilerle siteye giris yapilamaz
@sirali
  Scenario:  TC09 yanlis password ile giris yapilamaz
    Given kullanici "HMCurl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario:  TC10 yanlis kullanici adi ile giris yapilamaz
    Given kullanici "HMCurl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir


  Scenario:  TC11 yanlis kullanici adi ve yanlis password ile giris yapilamaz
    Given kullanici "HMCurl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir


