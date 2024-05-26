package co.com.sofka.utils;

import co.com.sofka.models.FormularioTarjeta;
import net.datafaker.Faker;

public class CrearTarjeta {
    private static Faker faker = new Faker();
    private static FormularioTarjeta tarjeta = new FormularioTarjeta();

    public static FormularioTarjeta crearTarjeta() {
        tarjeta.setNumeroDeTarjeta(faker.number().digits(16));
        tarjeta.setNombreEnTarjeta(faker.name().name());
        tarjeta.setCodigoDeSeguridad(faker.number().digits(3));
        return tarjeta;
    }
}
