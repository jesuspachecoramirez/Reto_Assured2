package co.com.sofka.covidtracking.setup.services;


import io.restassured.RestAssured;
import org.apache.log4j.PropertyConfigurator;


import static co.com.sofka.covidtracking.utils.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;


public class setup {

    private static final String BASE_URL ="https://api.covidtracking.com/v2 ";
    private static final String BASE_PATH ="/us/daily";



    protected void generalSetUp(){
        setUpLog4j2();
        setBaseUri();

    }

    private void setUpLog4j2(){
        PropertyConfigurator.configure(System.getProperty("user.dir") + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

    private void setBaseUri(){
        RestAssured.baseURI=BASE_URL;
        RestAssured.basePath=BASE_PATH;

    }

}
