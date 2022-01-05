package com.indra.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://advantageonlineshopping.com/")

public class AdminCuentaPage extends BasePage {

    public AdminCuentaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menuUser")
    private WebElementFacade btnLoginIcono;

    @FindBy(xpath = "//input[@name='username']")
    private WebElementFacade userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade password;

    @FindBy(id = "sign_in_btnundefined")
    private WebElementFacade btnSignIn;

    @FindBy(xpath = "(//a[contains(@translate,'Edit')])[1]")
    private WebElementFacade btnEditarDetalles;


    @FindBy(xpath = "//span[contains(@class,'hi-user containMiniTitle ng-binding')]")
    private WebElementFacade botonMyAccount;

    @FindBy(xpath = "//label[@class='option roboto-medium ng-scope'][contains(.,'My account')]")
    private WebElementFacade MyAccount;

    @FindBy(xpath = "//label[@class='option roboto-medium ng-scope'][contains(.,'My account')]")
    private WebElementFacade myAccountUsuario;



    @FindBy(xpath = "//input[contains(@name,'emailAccountDetails')]")
    private WebElementFacade campoemail;

    @FindBy(xpath = "//label[contains(@class,'animated invalid')]")
    private WebElementFacade mensajeEmailInvalido;

    @FindBy(xpath = "//a[@class='link ng-scope']")
    private WebElementFacade changepassword;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElementFacade oldPassword;

    @FindBy(xpath = "//label[@data-ng-click='labelClicked()'][contains(.,'New_passwords do not match')]")
    private WebElementFacade mensajeoldPasswordInvalido;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    private WebElementFacade newpassword;

    @FindBy(xpath = "//label[@data-ng-click='labelClicked()'][contains(.,'One upper letter required')]")
    private WebElementFacade mensajeNewpasswordInvalido;

    @FindBy(xpath = "(//input[@type='password'])[4]")
    private WebElementFacade confirmNewPassword;

    @FindBy(xpath = "//input[@name='addressAccountDetails']")
    private WebElementFacade Direccion;


    @FindBy(xpath = "//input[contains(@name,'last_nameAccountDetails')]")
    private WebElementFacade campoLastName;

    @FindBy(xpath = "//label[@data-ng-click='labelClicked()'][contains(.,'Use maximum 30 character')]")
    private WebElementFacade mensajeCampoLastNameInvalido;

    @FindBy(xpath = "//input[contains(@name,'first_nameAccountDetails')]")
    private WebElementFacade firstName;

    @FindBy(xpath = "//input[contains(@name,'phone_numberAccountDetails')]")
    private WebElementFacade celularUsuario;



    @FindBy(xpath = "//select[@name='countryListboxAccountDetails']")
    private WebElementFacade country;

    @FindBy(xpath = "//input[@name='cityAccountDetails']")
    private WebElementFacade city;

    @FindBy(xpath = "//input[contains(@name,'addressAccountDetails')]")
    private WebElementFacade address;

    @FindBy(xpath = "//input[contains(@name,'postal_codeAccountDetails')]")
    private WebElementFacade postalCode;

    @FindBy(xpath = "//input[contains(@name,'state_/_province_/_regionAccountDetails')]")
    private WebElementFacade state;

    @FindBy(xpath = "//button[@id='save_btnundefined']")
    private WebElementFacade Guardar;



    /********************************************************************************/

    public WebElementFacade getFirstName() {
        return firstName;
    }



    public WebElementFacade getcelularUsuario() {
        return celularUsuario;
    }

    public WebElementFacade getBtnEditarDetalles() {
        return btnEditarDetalles;
    }

    public WebElementFacade getPais() {
        return country;
    }

    public WebElementFacade getDireccion() {
        return Direccion;
    }

    public WebElementFacade getBotonMyAccount() {
        return botonMyAccount;
    }

    public WebElementFacade getMyAccount() {
        return MyAccount;
    }

    public WebElementFacade getMyAccountUsuario() {
        return myAccountUsuario;
    }

    public WebElementFacade getChangepassword() {
        return changepassword;
    }



    public WebElementFacade getGuardar() {
        return Guardar;
    }

    public WebElementFacade getBtnLoginIcono() {
        return btnLoginIcono;
    }

    public WebElementFacade getUserName() {
        return userName;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getBtnSignIn() {
        return btnSignIn;
    }

    public WebElementFacade getCampoemail() {
        return campoemail;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getAddress() {
        return address;
    }

    public WebElementFacade getPostalCode() {
        return postalCode;
    }

    public WebElementFacade getState() {
        return state;
    }

    public WebElementFacade getMensajeEmailInvalido() {
        return mensajeEmailInvalido;
    }



    public WebElementFacade getCountry() {
        return country;
    }

    public WebElementFacade getCampoLastName() {
        return campoLastName;
    }

    public WebElementFacade getMensajeCampoLastNameInvalido() {
        return mensajeCampoLastNameInvalido;
    }

    public WebElementFacade getCelularUsuario() {
        return celularUsuario;
    }

    public WebElementFacade getOldPassword() {
        return oldPassword;
    }

    public WebElementFacade getMensajeoldPasswordInvalido() {
        return mensajeoldPasswordInvalido;
    }

    public WebElementFacade getNewpassword() {
        return newpassword;
    }

    public WebElementFacade getMensajeNewpasswordInvalido() {
        return mensajeNewpasswordInvalido;
    }

    public WebElementFacade getConfirmNewPassword() {
        return confirmNewPassword;
    }


}

