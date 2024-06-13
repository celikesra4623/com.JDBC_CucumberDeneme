

  Feature: Select Query Execution


    Background: Database baglantisi kurulur
      * database baglantisi kurulur


@query02
    Scenario: "admins" tablosunda "email=info@loantechexper.com" olan datanın "remember_token" bilgisini doğrulayınız


      * query02 hazirlanir ve calistirilir
      * query02 icin donen sonuclar islenir
      * database baglantisi kapatilir



