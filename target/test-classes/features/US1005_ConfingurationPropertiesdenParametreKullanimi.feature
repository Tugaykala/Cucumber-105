@p1
  Feature: US1005 Kullanici configuration.properties'de yazilan datalari parametre olarak kullan
    # 3 senaryo olusturup, amazon, wisequarter ve walmart anasayfalarina gidin
    # ve o anasyfalara gittigimizi test edin
    # parametre olarak kullandigimiz kelimeler direk testte kullanilacak datalar olabilecegi gibi
    # configuration.properties'de bulunan key'ler de olabilir
    # Bu durumda stepdefinition'da yolladigimiz key ile
    # ConfigReader'daki getProperty() kullanilip
    # configuration.properties dosyasindaki value testte kullanilabilir

    Scenario: TC09 Kullanici amazon sitesine gidisi test eder

      Given kullanici "amazonUrl" anasayfaya gider
      Then Url de "amazon" oldugunu test eder
      And sayfayi kapatir

    Scenario: TC10 Kullanici wisequarter sitesine gidisi test eder

      Given kullanici "wqUrl" anasayfaya gider
      Then Url de "wisequarter" oldugunu test eder
      And sayfayi kapatir

    Scenario: TC11 Kullanici walmart sitesine gidisi test eder

      Given kullanici "walmartUrl" anasayfaya gider
      Then Url de "walmart" oldugunu test eder
      And sayfayi kapatir



