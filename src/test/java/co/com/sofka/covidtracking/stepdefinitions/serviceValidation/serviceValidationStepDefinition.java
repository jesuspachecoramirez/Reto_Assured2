package co.com.sofka.covidtracking.stepdefinitions.serviceValidation;

import co.com.sofka.covidtracking.model.DateModel;
import co.com.sofka.covidtracking.setup.services.setup;
import co.com.sofka.covidtracking.utils.infoDate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;



public class serviceValidationStepDefinition extends setup {
    private static final Logger LOGGER = Logger.getLogger(serviceValidationStepDefinition.class);
     DateModel dateModel;
     Response response;
     RequestSpecification request;


    @Given("El usuario desea obtener informacion de una fecha especifica")
    public void elUsuarioDeseaObtenerInformacionDeUnaFechaEspecifica() {
     try{
         dateModel = infoDate.generateDate();
         dateModel.getYearinit();
         dateModel.getMonthinit();
         dateModel.getDayinit();

         generalSetUp();
         request= given();

     }catch (Exception e){
         LOGGER.error("Hubo un error en el given");
         Assertions.fail("Hubo un error en el given");

     }


    }
    @When("el usuario desea conocer los casos confirmados de la fecha")
    public void elUsuarioDeseaConocerLosCasosConfirmadosDeLaFecha() {
     try{

       request.when().get(dateModel.toString());


     }catch (Exception e){
         LOGGER.error("Hubo un error en el when");


     }

    }
    @Then("la pagina muestra la informacion correspondiente")
    public void laPaginaMuestraLaInformacionCorrespondiente() {
      try{

          request.then().statusCode(HttpStatus.SC_OK)
                  .body("meta.field_definitions[2].name",equalTo("Confirmed Cases"));
      }catch (Exception e){
          LOGGER.error("Hubo un error en el then");
          Assertions.fail("Hubo un error en el then");
      }



    }

}
