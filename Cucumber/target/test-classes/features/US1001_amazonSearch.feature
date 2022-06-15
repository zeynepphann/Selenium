@tumu
Feature: Amazon Search

  @Nutella @ikisi
  Scenario:  TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @java @ikisi @sirali
  Scenario: TC02 kullanici amazonda java aratir
     Given kullanici amazon anasayfasinda
     Then kullanici Java icin arama yapar
     And sonuclarin Java icerdigini test eder
     And sayfayi kapatir


  @iphone @pr1
  Scenario: TC03 kullanici iphone aratir
    When kullanici amazon anasayfasinda
    And kullanici iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir