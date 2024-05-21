package co.com.sofka.utils.configurationRequest;

import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static co.com.sofka.utils.Util.md5;

public class ParamsConfig {

    private static final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    public static final String TS = "ts";
    public static final String API_KEY = "apikey";
    public static final String HASH = "hash";
    public static final String ID = "id";

    public static final String PUBLIC_KEY = environmentVariables.optionalProperty("environment.publicKey").orElse("");
    public static final String PRIVATE_KEY = environmentVariables.optionalProperty("environment.privateKey").orElse("");
    public static final String TIMESTAMP = Long.toString(System.currentTimeMillis());
    public static final String HASH_API = md5(TIMESTAMP + PRIVATE_KEY + PUBLIC_KEY);

}
