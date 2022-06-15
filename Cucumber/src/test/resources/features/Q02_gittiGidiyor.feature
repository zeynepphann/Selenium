Feature: Gittigidiyor search 

  Scenario: Q01 Gittigidiyor sitesine gidip urun secme
    
    Given  kullanici "gittiGidiyorUrl" anasayfasinda
    And kullanici gGde "Bilgisayar" icin arama yapar
    And kullanici 2.sayfaya gider
    And kullanicinin 2.sayfada oldugu dogrulanir
    And kullanici urune tiklar

