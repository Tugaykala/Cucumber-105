@go
  Feature: US1016 aranan urunun ortalama fiyatini test etme

    Scenario: TC21 aranan urunun ortalama fiyati test edilebilmeli

      Given kullanici "amazonUrl" anasayfaya gider
      Then amazon arama kutusuna "Nutella" yazip aratir
      And cikan urunlerden "Nutella" kelimesi icerenlerin fiyat oratlamasinin 20 euro altinda oldugunu test eder
