package com.indra.stepsDefinitions;

import com.indra.actions.AdminCuentaActions;
import com.indra.models.AdminCuentaModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AdminCuentaSteps {
    @Managed
    WebDriver driver;
    AdminCuentaActions adminCuentaActions = new AdminCuentaActions(driver);

    @Given("^el usuario se encuentra logueado e ingresa en la pagina principal$")
    public void elusuarioseencuentralogueadoeingresaenlapaginaprincipal()throws InterruptedException {
        adminCuentaActions.open();
        adminCuentaActions.addLogin();
        adminCuentaActions.hacerclicEnMyAccount();
        adminCuentaActions.seleccionarMyAccont();
        adminCuentaActions.hacerClicEditarDetalles();
        adminCuentaActions.clicBtnChangePassword();
    }


    @When("^el usuario completa el formulario$")
    public void el_usuario_completa_el_formulario(List<AdminCuentaModels> formularioeditarCuenta) {
        adminCuentaActions.userNameEnviadoDesdeElFormulario(formularioeditarCuenta.get(0));
        adminCuentaActions.passwordParaValidacion(formularioeditarCuenta.get(0));
        adminCuentaActions.llenarElFormulario(formularioeditarCuenta.get(0));
    }

    @Then("^el usuario da clic en SAVE$")
    public void elusuariodaclicenSAVE() {
        adminCuentaActions.hacerClickBtnSave();
    }

    @Then("^se muestran los mensajes de username invalido$")
    public void se_muestran_los_mensajes_de_username_invalido() {
        adminCuentaActions.mensajeDeLastNameInvalido();
    }

    @Then("^se muestran el mensaje de password no coinciden$")
    public void se_muestran_el_mensaje_de_password_no_coinciden() {
        adminCuentaActions.mensajesDePasswordDiferente();
    }
}

