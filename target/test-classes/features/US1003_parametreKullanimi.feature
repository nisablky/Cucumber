Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre, @pr2
  Scenario:  TC06 kullanici parametre ile amazon arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Nutella" icin arama yapar
    And sonuclarin "Nutella" icerdigini test eder
    Then sayfayi kapatir
