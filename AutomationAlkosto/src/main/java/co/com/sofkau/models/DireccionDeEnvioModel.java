package co.com.sofkau.models;

public class DireccionDeEnvioModel {
    String DocumentoIdentidad;
    String Direccion;
    String Barrio;

    public String getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        DocumentoIdentidad = documentoIdentidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }
}
