package co.com.sofka.modelos;

import java.util.List;

public class PersonaFormModel {

    private String nombre;
    private String apellido;
    private String cedula;
    private String movil;
    private String departamento;
    private String ciudad;

    private String email;

    private String tipoVia;

    private List<String> numeroDireccion;

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public List<String> getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(List<String> numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
