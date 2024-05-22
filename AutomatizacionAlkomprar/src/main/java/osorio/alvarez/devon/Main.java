package osorio.alvarez.devon;

import net.datafaker.Faker;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

import static osorio.alvarez.devon.ui.PageCompraProducto.*;
import static osorio.alvarez.devon.utils.UtilCompra.cedula;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i=1; i<=20; i++) {
            System.out.println(cedula());
        }
    }
}


