@wip
  Feature: US1012 Window Testi

    Scenario:  TC17 Kullanici yeni acilan window'u test edebilmeli

      Given kullanici "wduUrl" anasayfaya gider
      Then Login Portal elementine kadar asagi iner
      When 3 saniye bekler
      And Login portala tiklar
      Then Acilan yeni window a gecer
      And username kutusuna deger yazar
      And password kutuuna deger yazar
      Then 3 saniye bekler
      Then webuniversity login butonuna basar
      And Popup ta cikan yazinin validation failed oldugunu test eder
      And OK diyerek popup i kapatir
      And 3 saniye bekler
      Then ilk sayfaya geri doner
      And ilk dondugunu test eder
      Then 3 saniye bekler
      And sayfayi kapatir