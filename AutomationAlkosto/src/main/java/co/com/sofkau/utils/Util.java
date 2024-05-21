package co.com.sofkau.utils;

import co.com.sofkau.models.DireccionDeEnvioModel;
import co.com.sofkau.models.UsuarioModel;
import net.datafaker.Faker;

public class Util {
    public static UsuarioModel crearUsuario(){
        Faker faker = new Faker();

        UsuarioModel usuarioModel = new UsuarioModel();

        usuarioModel.setNombre(faker.name().firstName());
        usuarioModel.setEmail(faker.internet().emailAddress());
        usuarioModel.setApellido(faker.name().lastName());
        usuarioModel.setCelular(generarNumeroCelularColombiano(faker));

        return usuarioModel;
    }
    public static DireccionDeEnvioModel crearDireccionDeEnvio(){
        Faker faker = new Faker();

        DireccionDeEnvioModel direccionDeEnvioModel = new DireccionDeEnvioModel();

        direccionDeEnvioModel.setDocumentoIdentidad(faker.numerify("1#########"));
        direccionDeEnvioModel.setDireccion(faker.address().streetAddress());
        direccionDeEnvioModel.setBarrio(faker.address().cityName());

        return direccionDeEnvioModel;
    }
    public static String generarNumeroCelularColombiano(Faker faker) {
        String[] prefixes = {"300", "301", "302", "303", "304", "305", "310", "311", "312", "313", "314", "315", "316", "317", "318", "320", "321", "322", "323", "350"}; // Prefijos de operadores colombianos
        String prefijosRandom = prefixes[faker.number().numberBetween(0, prefixes.length)];
        String number = faker.numerify("#######"); // 7 dígitos aleatorios

        return prefijosRandom + number;
    }
}
