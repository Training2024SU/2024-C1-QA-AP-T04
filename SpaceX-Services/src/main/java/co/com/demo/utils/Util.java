package co.com.demo.utils;

import co.com.demo.models.CreditCardInformation;
import co.com.demo.models.ShippingInformation;
import net.datafaker.Faker;

public class Util {

    public static ShippingInformation createRandomShippingInformation() {
        Faker faker = new Faker();

        ShippingInformation shippingInfo = new ShippingInformation();
        shippingInfo.setEmail(faker.internet().emailAddress());
        shippingInfo.setFirstName(faker.name().firstName());
        shippingInfo.setLastName(faker.name().lastName());
        shippingInfo.setAddress(faker.address().streetAddress());
        shippingInfo.setAddress2(faker.address().secondaryAddress());
        shippingInfo.setCity(faker.address().city());
        shippingInfo.setPostalCode(faker.address().zipCode());
        shippingInfo.setPhone(faker.phoneNumber().cellPhone());


        return shippingInfo;
    }

    public static CreditCardInformation createRandomCreditCardInformation() {
        Faker faker = new Faker();

        CreditCardInformation creditCardInfo = new CreditCardInformation();
        creditCardInfo.setCreditCardNumber(faker.business().creditCardNumber());
        creditCardInfo.setNameOnCard(faker.name().fullName());
        creditCardInfo.setExpirationDate(faker.business().creditCardExpiry());
        creditCardInfo.setSecurityCode(faker.business().securityCode());

        return creditCardInfo;
    }
}
