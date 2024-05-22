package osorio.alvarez.devon.utils;

import net.datafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;

public class UtilCompra {

    public static String cedula() {
        int numeroSeisCifras = ThreadLocalRandom.current().nextInt(100000, 1000000);
        String cedula = "1003"+String.valueOf(numeroSeisCifras);
        return cedula;
    }

}
