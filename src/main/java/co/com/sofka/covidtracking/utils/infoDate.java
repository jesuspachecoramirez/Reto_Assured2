package co.com.sofka.covidtracking.utils;

import co.com.sofka.covidtracking.model.DateModel;
import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;

public class infoDate {
    public static final String SPANISH_CODE_LANGUAGE = "es";
    public static final String COUNTRY_CODE = "CO";



    public static DateModel generateDate(){

        Faker faker =  Faker.instance(
                new Locale(SPANISH_CODE_LANGUAGE, COUNTRY_CODE),
                new Random()
        );

        DateModel dates = new DateModel();
        dates.setYearinit(String.valueOf(faker.number().numberBetween(2020,2021)));
       if(dates.getYearinit().equals(String.valueOf(2020))){
            dates.setMonthinit(String.format("%02d",faker.number().numberBetween(2,12)));
            if(dates.getMonthinit().equals(String.format("%02d",2))){
                dates.setDayinit(String.format("%02d",faker.number().numberBetween(1,28)));
            }else{
                dates.setDayinit(String.format("%02d",faker.number().numberBetween(1,30)));
            }
        }else {
            dates.setMonthinit(String.format("%02d",faker.number().numberBetween(1,3)));
            if(dates.getMonthinit().equals(String.format("%02d",3))){
                dates.setDayinit(String.format("%02d",faker.number().numberBetween(1,7)));
            }if(dates.getMonthinit().equals(String.format("%02d",2))){
                dates.setDayinit(String.format("%02d",faker.number().numberBetween(1,28)));
            }else {
                dates.setDayinit(String.format("%02d",faker.number().numberBetween(1,30)));
            }

        }

        return dates;
    }


}












