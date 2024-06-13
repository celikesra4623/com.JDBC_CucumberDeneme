Feature: Select Query Execution

  Background: Database baglantisi kurulur
    * database baglantisi kurulur

    @query03
    Scenario: "cron_schedules" tablosunda ilk 2 kaydın "name" bilgisini dogrulama testi

      * query03 hazirlanir ve calistirilir
      * query03 icin donen sonuclar islenir
      * database baglantisi kapatilir