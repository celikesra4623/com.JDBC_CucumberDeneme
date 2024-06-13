Feature: Select Query Execution

  Background: Database baglantisi kurulur
    * database baglantisi kurulur

  @query01
  Scenario: Deposits tablosunda amount degerine gore user_id sorgulama testi
    * query01 hazirlanir ve calistirilir
    * query01 icin donen sonuclar islenir
    * database baglantisi kapatilir