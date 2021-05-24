package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Utils;

public class CadastrarUsuarioPage {

	private WebDriver driver;
	private Utils util;

	public CadastrarUsuarioPage(WebDriver driver) {
		util = new Utils(driver);
		this.driver = driver;
	}

	public void cadastrarusuario() {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.get("http://automationpractice.com/index.php");

		util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
		util.preencheCampoPorId("email_create", "sonhodejefferson@everis.com");
		util.clickPorCss("button[id='SubmitCreate'] span");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		util.clickPorId("id_gender2");
		util.preencheCampoPorId("customer_firstname", "Jeffinho");
		util.preencheCampoPorId("customer_lastname", "Andrade");
		util.preencheCampoPorId("passwd", "sonholindo");
		util.preencheCampoPorCss("#days", "19");
		util.preencheCampoPorCss("#months", "May");
		util.preencheCampoPorCss("#years", "1995");
		util.preencheCampoPorId("address1", "Street name, 213");
		util.preencheCampoPorId("city", "Honolulu");
		util.preencheCampoPorId("id_state", "Hawaii");
		util.preencheCampoPorId("postcode", "96815");
		util.preencheCampoPorId("id_country", "United States");
		util.preencheCampoPorId("phone_mobile", "9999999999");
		util.clickPorId("submitAccount");

	}

	{
		//DEVIDO AO PÉSSIMO DESEMPENHO DO PC, TIVE QUE FAZER A MODIFICAÇAO DO ENDERECO POR AQUI, MIL PERDOES.
		util.clickPorCss("#header > div.nav > div > div > nav > div:nth-child(1) > a > span");
		util.clickPorCss("#center_column > div > div:nth-child(1) > ul > li:nth-child(3) > a > span");
		util.clickPorCss("#center_column > div.clearfix.main-page-indent > a > span");
		util.preencherCampoPorId("#address1", "rua dos sonhos verdes, 191");
		util.preencherCampoPorId("#city", "Honolulu");
		util.preencherCampoPorId("#id_state", "Hawaii");
		util.preencherCampoPorId("#postcode", "96713");
		util.preencherCampoPorId("id_country", "United States");
		util.preencherCampoPorId("#phone", "000000000");
		util.preencherCampoPorId("#phone_mobile", "9999999999");
		util.preencherCampoPorId("#alias", "My Address");
		util.clickPorCss("#submitAddress > span")

	}
}
