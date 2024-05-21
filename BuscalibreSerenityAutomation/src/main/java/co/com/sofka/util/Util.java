package co.com.sofka.util;

import co.com.sofka.model.UserModel;
import net.datafaker.Faker;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Util {
    public static UserModel createUser() {
        UserModel user = new UserModel();
        Faker faker = new Faker();

        user.setEmail(faker.internet().emailAddress());
        user.setName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setPassword(faker.internet().password());
        user.setId(faker.idNumber().valid());
        user.setAddress(faker.address().streetAddress());
        user.setPhone(faker.phoneNumber().cellPhone());

        return user;
    }

    public static Integer selectRandomOption(List<WebElementFacade> list) {
        int randomIndex = (int) (Math.random() * list.size());
        return randomIndex;
    }

    public static List<WebElementFacade> selectOptions(Target target) {
        Actor actor = OnStage.theActorInTheSpotlight();
        return target.resolveAllFor(actor);
    }

    public static <T> T selectRandomItem(List<T> list) {
        int indexSelected = (int) (Math.random() * list.size());
        return list.get(indexSelected);
    }
    public static String generateMD5Hash(long timeStamp, String publicKey, String privateKey) {
        try {
            String input = timeStamp + privateKey + publicKey;
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] bytesOfInput = input.getBytes();

            byte[] hashBytes = md.digest(bytesOfInput);

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xFF & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }


}
