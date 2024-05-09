package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pagesObjets.Home;
import pagesObjets.Resultado;

public class BusquedaDefinitions {
    Home h;
    Resultado r;

    public BusquedaDefinitions(){
       h = new Home();
       r = new Resultado();
    }


    @Given("se abre la pagina web")
    public void seAbreLaPaginaWeb() {
        h.ingresarWeb();
    }

    @When("el usuario selecciona registrar")
    public void elUsuarioSeleccionaRegistrar() {
        h.seleccionarRegistrar();
    }

    @And("el usuario llena el campo {string}, {string}")
    public void elUsuarioLlenaElCampo(String nombre, String apellido) {
        h.escribirNombre(nombre);
        h.escribirApellido(apellido);
    }

    @And("el usuario llena el campo direccion {string}")
    public void elUsuarioLlenaElCampoDireccion(String direccion) {
        h.escribirDireccion(direccion);
    }

    @And("el usuario llena el campo ciudad {string}")
    public void elUsuarioLlenaElCampoCiudad(String ciudad) {
        h.escribirCiudad(ciudad);
    }

    @And("el usuario llena el campo provincia {string}")
    public void elUsuarioLlenaElCampoProvincia(String provincia) {
        h.escribirProvincia(provincia);
    }

    @And("el usuario llena el campo codigo postal {string}")
    public void elUsuarioLlenaElCampoCodigoPostal(String codigo) {
        h.escribirCodigoPostal(codigo);
    }

    @And("el usuario llena el campo telefono {string}")
    public void elUsuarioLlenaElCampoTelefono(String telefono) {
        h.escribirTelefono(telefono);
    }

    @And("el usuario llena el campo ssn {string}")
    public void elUsuarioLlenaElCampoSsn(String ssn) { h.escribirSsn(ssn); }

    @And("el usuario llena el campo username {string}")
    public void elUsuarioLlenaElCampoUsername(String username) {
        h.escribirUsername(username);
    }

    @And("el usuario llena el campo password {string}")
    public void elUsuarioLlenaElCampoPassword(String password) {
        h.escribirPassword(password);
    }

    @And("el usuario llena el campo confirmar password {string}")
    public void elUsuarioLlenaElCampoConfirmarPassword(String confirmar_password) {
        h.escribirConfirmarPassword(confirmar_password);
    }

    @And("el usuario selecciona enviar")
    public void elUsuarioSeleccionaEnviar() {
        h.seleccionarEnviar();
    }

    @Then("el texto buscado es {string}")
    public void elTextoBuscadoEs(String resul) {
        Assert.assertTrue(r.encontrarTexto(resul));
    }




    @When("el usuario esta registrado")
    public void elUsuarioEstaRegistrado() {
    }

    @And("el usuario se logea {string}, {string}")
    public void elUsuarioSeLogea(String usernamelogin, String passwordlogin) {
        h.escribirUsernameLogin(usernamelogin);
        h.escribirPasswordLogin(passwordlogin);
    }

    @Then("el usuario selecciona ingresar")
    public void elUsuarioSeleccionaIngresar() {
        h.seleccionarIngresar();
    }

}
