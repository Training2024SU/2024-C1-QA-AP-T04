package garcia.juan.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaModel {
    String nombre, apellidos, tipoDoc, numeroDoc, numeroCel, email, contrasena;

    public PersonaModel(){

    }

    public PersonaModel(String apellidos, String nombre, String contrasena, String email,
                        String numeroCel, String numeroDoc, String tipoDoc) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.numeroCel = numeroCel;
        this.numeroDoc = numeroDoc;
        this.tipoDoc = tipoDoc;
    }

    public static PersonaModel crearUsuario(){
        net.datafaker.Faker faker = new net.datafaker.Faker();
        String nombre = faker.name().firstName();
        String apellidos = faker.name().lastName();
        String contrasena1 = faker.bothify("?#??????#");
        String contrasena=Character.toUpperCase(contrasena1.charAt(0)) + contrasena1.substring(1);
        String email = faker.internet().emailAddress();
        String numeroCel = faker.numerify("##########");
        String numeroDoc = faker.idNumber().valid();
        String tipoDoc = "Cédula de Ciudadanía";

        return new PersonaModel(apellidos, nombre, contrasena, email, numeroCel, numeroDoc, tipoDoc);
    }
}
