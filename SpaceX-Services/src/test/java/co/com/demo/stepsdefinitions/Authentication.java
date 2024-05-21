package co.com.demo.stepsdefinitions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.codec.digest.DigestUtils;

public class Authentication {

    public static String getAuthenticationHash() {
        RestAssured.baseURI = "https://gateway.marvel.com:443";

        RequestSpecification request = RestAssured.given();

        String publicKey = "4797281e62b54bf2a8938c94dcdeda8e";
        String privateKey = "62a2e8feef2170282cec1c4ba62eb4e77283919f";
        long ts = System.currentTimeMillis();

        String hash = DigestUtils.md5Hex(ts + privateKey + publicKey);

        return hash;
    }
}
