Feature: US1012 kullanici excel bilgilerine ulasir

  Scenario: TC17 kullanici excel bilgilerini kullanir
    Given kullanici excel dosyasini kullanilabilir hale getirir
    Then 1.satirdaki 2.hucreyi yazdirir
    And baskenti berlin olan ulke ismini yazdirir
    And ulke sayisinin 167 oldugunu test eder
    And fiziki olarak kullanilan satir sayisinin 191 oldugunun test edin
