package co.com.sofka.models;


public class CarritoUserModel {

    private String departamento = "Huila";
    private String ciudad = "Neiva";
    private String tipodecalle= "Carrera";
    private String numerocalle= "2";
    private String numero1= "2";
    private String numero2="22";


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
    public String getNumerocalle() {
        return numerocalle;
    }

    public void setNumerocalle(String numerocalle) {
        this.numerocalle = numerocalle;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getTipodecalle() {
        return tipodecalle;
    }

    public void setTipodecalle(String tipodecalle) {
        this.tipodecalle = tipodecalle;
    }

    @Override
    public String toString() {
        return "CarritoUserModel{" +
                "departamento='" + departamento + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", tipodecalle='" + tipodecalle + '\'' +
                ", numerocalle='" + numerocalle + '\'' +
                ", numero1='" + numero1 + '\'' +
                ", numero2='" + numero2 + '\'' +
                '}';
    }

    public static CarritoUserModel carritoUserModel(){
        return new CarritoUserModel();
    }
}
