@wip
Feature: US1002 kullanici ortak adimlari Backgroundile calisir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icin arama yapar
      Then sonuclarin Nutella icerdigini test eder
      And  sayfayi kapatir


      Scenario: TC05 amazon java arama
        And kullanici Java icin arama yapar
        Then sonuclarin Java icerdigini test eder
        And  sayfayi kapatir