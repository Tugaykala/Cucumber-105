@wip
  Feature: Kullanici yanlis bilgilerle giris yapamaz

    Scenario: TC10 Gecerli Kullanici adi ve gecersiz sifre ile negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then cookies kapatir
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecerliUsername" yazar
      And  password kutusuna "qdGecersizPassword" yazar
      Then login butonuna basar
      And 3 saniye bekler
      And giris yapilamadigini test eder
      Then sayfayi kapatir

    Scenario: TC11 Gecersiz Kullanici adi ve gecerli sifre ile negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then cookies kapatir
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And  password kutusuna "qdGecerliPassword" yazar
      Then login butonuna basar
      And 3 saniye bekler
      And giris yapilamadigini test eder
      Then sayfayi kapatir

    Scenario: TC12 Gecersiz Kullanici adi ve gecersiz sifre ile negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then cookies kapatir
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And  password kutusuna "qdGecersizPassword" yazar
      Then login butonuna basar
      And 3 saniye bekler
      And giris yapilamadigini test eder
      Then sayfayi kapatir