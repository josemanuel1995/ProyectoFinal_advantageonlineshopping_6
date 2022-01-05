package com.indra.actions;

import com.indra.models.AdminCuentaModels;
import com.indra.pages.AdminCuentaPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


@DefaultUrl("/#/")

public class AdminCuentaActions extends AdminCuentaPage {

    public String lastNameParaValidacion;
    public String passwordParaValidacion;

    public AdminCuentaActions(WebDriver driver) {
        super(driver);
    }

    public void addLogin(){
        clicSignInIcono();
        getBtnLoginIcono().waitUntilClickable();
        infoLogin("manuel2020","Mde%42fggre");
        clicBtnSignI();

    }

    public void clicSignInIcono(){
        getBtnLoginIcono().click();
    }

    public void clicBtnSignI(){
        getBtnSignIn().waitUntilClickable();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", getBtnSignIn());
        //getBtnSignIn().click();
    }

    public void infoLogin(String user, String password){
        enter(user).into(getUserName());
        enter(password).into(getPassword());
    }
    public void hacerclicEnMyAccount(){
        getBotonMyAccount().waitUntilClickable();
        getBotonMyAccount().click();
    }

    public  void seleccionarMyAccont(){
        getMyAccount().click();
    }


    public void hacerClicEditarDetalles() throws InterruptedException {
        getBtnEditarDetalles().waitUntilPresent();
        System.out.println("BOTON ************* "+getBtnEditarDetalles().getText());
        getBtnEditarDetalles().click();
        Thread.sleep(4000);
    }

    public void userNameEnviadoDesdeElFormulario(AdminCuentaModels password_editar_cuenta){
        int numero = (int)(Math.random()*100+1);
        lastNameParaValidacion = password_editar_cuenta.getLastName();
        lastNameParaValidacion = lastNameParaValidacion + String.valueOf(numero);
        System.out.println(lastNameParaValidacion);
        enter(lastNameParaValidacion).into(getCampoLastName());
    }

    public void passwordParaValidacion(AdminCuentaModels password_editar_cuenta){
        int numero = (int)(Math.random()*100+1);
        passwordParaValidacion = password_editar_cuenta.getLastName();
        passwordParaValidacion = passwordParaValidacion + String.valueOf(numero);
        System.out.println(passwordParaValidacion);
        enter(passwordParaValidacion).into(getOldPassword());
    }

    public void llenarElFormulario(AdminCuentaModels password_editar_cuenta){
        enter(password_editar_cuenta.getEmail()).into(getCampoemail());
        //System.out.println("otro "+editar_cuenta.getOldPassword());
        enter(password_editar_cuenta.getOldPassword()).into(getOldPassword());
        enter(password_editar_cuenta.getNewpassword()).into(getNewpassword());
        enter(password_editar_cuenta.getConfirmNewPassword()).into(getConfirmNewPassword());
        enter(password_editar_cuenta.getFirstName()).into(getFirstName());
        enter(password_editar_cuenta.getLastName()).into(getCampoLastName());
        enter(password_editar_cuenta.getPhoneNumber()).into(getcelularUsuario());
        selectOptionFromDropDown(By.xpath("//select[@name='countryListboxAccountDetails']"),password_editar_cuenta.getCountry());
        enter(password_editar_cuenta.getCity()).into(getCity());
        enter(password_editar_cuenta.getAddress()).into(getAddress());
        enter(password_editar_cuenta.getState()).into(getState());
        enter(password_editar_cuenta.getPostalCode()).into(getPostalCode());
    }

    public void clicBtnChangePassword() throws InterruptedException {
        getChangepassword().waitUntilPresent();
        System.out.println("BOTON2 ************* "+getChangepassword().getText());
        getChangepassword().click();
        Thread.sleep(4000);
    }

    public void mensajesDePasswordDiferente(){
        MatcherAssert.assertThat("Se muestra el mensaje de password diferente",
                getMensajeoldPasswordInvalido().getText(),
                Matchers.equalTo("Passwords do not match"));
    }


    public void mensajeDeLastNameInvalido(){
        MatcherAssert.assertThat("Se muestra el mensaje de error en el last name",
                getMensajeCampoLastNameInvalido().getText(),
                Matchers.equalTo("Use maximum 30 character"));
    }

    public void hacerClickBtnSave (){
        getGuardar().waitUntilClickable();
        getGuardar().click();
    }
}
