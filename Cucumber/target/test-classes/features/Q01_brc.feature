Feature: Brc odev


  @odev
  Scenario:  001 Brc hesap olusturup giris yapiniz
    Given kullanici "brcUrl" anasayfasinda
    And kullanici 1 sn bekler
    Then kullanici login butonuna tiklar
    And kullanici 1 sn bekler
    And kullanici createNewUser butonunu tiklar
    And kullanici 1 sn bekler
    And isim bolumune firstname yazar
    And kullanici 1 sn bekler
    And soyisim bolumune soyisim yazar
    And kullanici 1 sn bekler
    And kullanici telefon numarasi yazar
    And kullanici 1 sn bekler
    And kullanici adress yazar
    And kullanici 1 sn bekler
    And zip code bolumune zip code yazar
    And kullanici 1 sn bekler
    And email bolumune email yazar
    And kullanici 1 sn bekler
    And gecerli bir password girer
    And kullanici 1 sn bekler
    And gecerli sifreyi tekrar password girer
    And kullanici 1 sn bekler
    Then register butonuna basar


    Scenario: 002 olusturulan hesapla login olalim

    And kullanici giris kismina firstname yazar
    And kullanici giris kismina password girer
    And kullanici login olur
    And kullanici "Audi Q8" i secip reservasyon yapar









