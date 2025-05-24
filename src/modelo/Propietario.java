package modelo;

import java.io.Serializable;


public class Propietario implements Serializable{
    private String nombre;
    private int cedula;
    private long telefono;
    private int ReparacionesAcumuladas;

    public Propietario(String nombre, int cedula, long telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.ReparacionesAcumuladas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getReparacionesAcumuladas() {
        return ReparacionesAcumuladas;
    }

    public void setReparacionesAcumuladas(int ReparacionesAcumuladas) {
        this.ReparacionesAcumuladas = ReparacionesAcumuladas;
    }
    

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    
    
}
