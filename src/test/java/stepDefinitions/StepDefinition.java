package stepDefinitions;

import io.cucumber.java.en.Given;
import manage.QueryManage;
import org.junit.Assert;
import utilities.ReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StepDefinition {
	@Given("database baglantisi kurulur")
	public void database_baglantisi_kurulur() {
		ReusableMethods.getConnection();
	}
	@Given("query01 hazirlanir ve calistirilir")
	public void query01_hazirlanir_ve_calistirilir() {
		ReusableMethods.getStatement();
		ReusableMethods.getResultSet(QueryManage.SELECTQUERY01);
	}
	@Given("query01 icin donen sonuclar islenir")
	public void query01_icin_donen_sonuclar_islenir() throws SQLException {
		int expectedSonuc = 221;

		ReusableMethods.resultSet.last();
		int actualSonuc = ReusableMethods.resultSet.getRow();

		System.out.println("Actual Sonuc: " + actualSonuc);
		Assert.assertEquals(expectedSonuc, actualSonuc);
	}
	@Given("database baglantisi kapatilir")
	public void database_baglantisi_kapatilir() {
		ReusableMethods.closeConnection();
	}



	@Given("query02 hazirlanir ve calistirilir")
	public void query02_hazirlanir_ve_calistirilir() {

		ReusableMethods.getStatement();
		ReusableMethods.getResultSet(QueryManage.SELECTQUERY02);



	}
	@Given("query02 icin donen sonuclar islenir")
	public void query02_icin_donen_sonuclar_islenir() throws SQLException {

		String expectedResult="1xUgfVUD1Ggx5CVz7mxLvcye8RXRbeFqSktSIkhya321TqDkLOsqhys4pnJv";
		ReusableMethods.resultSet.next();
		String actualResult=ReusableMethods.resultSet.getString("remember_token");

		Assert.assertEquals(expectedResult,actualResult);




	}

}
