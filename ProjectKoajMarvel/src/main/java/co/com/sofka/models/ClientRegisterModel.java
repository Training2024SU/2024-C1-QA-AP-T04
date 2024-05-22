package co.com.sofka.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientRegisterModel {
    String name;
    String lastName;
    String email;
    String password;
    String id;
    String phoneNumber;
    String address;

    public ClientRegisterModel(String name, String lastName, String email, String password, String id, String phoneNumber, String address) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
