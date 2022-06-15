Feature: US1011 web tablosundaki istenen sutunu yazdirma
  
  
  @guru @pr2
  Scenario: TC16
               
    Given kullanici "guruUrl" anasayfasinda
    And kullanici 3 sn bekler
    And "Company", sutunundaki tum degerleri yazdirir
    Then sa yfayi kapatir