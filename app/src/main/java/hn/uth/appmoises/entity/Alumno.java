package hn.uth.appmoises.entity;
//creamos un objeto
public class Alumno {
    private String nombre;
    private String cuenta;
    private String correo;
    private String genero:
    private  String campus;


    public Alumno(String nombre, String cuenta, String correo, String genero, String campus) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.correo = correo;
        this.genero = genero;
        this.campus = campus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
