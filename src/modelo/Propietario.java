package modelo;


public class Propietario {
    private String nombre;
    private int cedula;
    private int telefono;
    private int ReparacionesAcumuladas;

    public Propietario(String nombre, int cedula, int telefono,int ReparacionesAcumuladas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
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

    public int getTelefono() {
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
