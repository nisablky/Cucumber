Feature: US1011 web tablosundaki istenen sutunu yazdirma

  @guru @pr1
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    And "Company", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir