package co.com.sofka.utils;

import co.com.sofka.modelos.PersonaFormModel;
import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Util {
    // Método para calcular el hash MD5
    public static String md5(String text) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(text.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static PersonaFormModel generarFormularioPersonaAleatorio() {
        // Establecer la localidad en español latino
        Locale locale = new Locale("es", "MX");
        Faker faker = new Faker(locale);

        // Crear una instancia de PersonaFormModel
        PersonaFormModel personaForm = new PersonaFormModel();

        // Establecer los datos mediante setters con valores generados directamente por Faker
        personaForm.setEmail(faker.internet().emailAddress());
        personaForm.setNombre(faker.name().firstName());
        personaForm.setApellido(faker.name().lastName());
        personaForm.setCedula("1" + faker.number().digits(9));
        personaForm.setMovil("3" + faker.number().digits(9));
        personaForm.setCiudad("Medellín");
        personaForm.setDepartamento("Antioquia");

        List<String> numerosAleatorios = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int numCifras = faker.number().numberBetween(2, 4); // Genera 2 o 3
            String numeroAleatorio = faker.number().digits(numCifras);
            numerosAleatorios.add(numeroAleatorio);
        }

        personaForm.setNumeroDireccion(numerosAleatorios);
        personaForm.setTipoVia("Calle");

        return personaForm;
    }

}
