package co.com.sofka.utils;

import co.com.sofka.models.ClientRegisterModel;
import java.util.concurrent.TimeUnit;

import net.datafaker.Faker;
import net.serenitybdd.core.Serenity;


import java.util.Map;

public class Util {

    private static final Faker faker = new Faker();

    public static ClientRegisterModel createCartFormModel(){
        return new ClientRegisterModel(faker.name().firstName()
                ,faker.name().lastName()
                , faker.internet().emailAddress()
                ,("5" + faker.bothify("##########"))
                , ("1" + faker.bothify("##########"))
                ,("31" + faker.bothify("########"))
                , faker.address().fullAddress());
    }


    public static void setImplicitTimeout(int timeoutInSeconds) {
        long timeoutInMillis = TimeUnit.SECONDS.toMillis(timeoutInSeconds);
        System.setProperty("webdriver.timeouts.implicitlywait", String.valueOf(timeoutInMillis));
    }


}
