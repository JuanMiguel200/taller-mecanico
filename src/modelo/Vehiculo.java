package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Vehiculo implements Calculos, Serializable{
    protected String marca;
    protected String placa;
    protected int modelo;
    protected LocalDate fechaIngreso;
    protected LocalDate fechaSalida;
    protected boolean pazSalvo = false;
    protected Propietario elPropietario;
    protected ArrayList<Reparacion> lasReparaciones = new ArrayList<>();

    public Vehiculo(String marca, String placa, int modelo, LocalDate fechaIngreso, LocalDate fechaSalida, Propietario elPropietario) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.elPropietario = elPropietario;
    }

    public boolean isPazSalvo() {
        return pazSalvo;
    }

    public void setPazSalvo(boolean pazSalvo) {
        this.pazSalvo = pazSalvo;
    }
    
    
    public ArrayList<Reparacion> getLasReparaciones() {
        return lasReparaciones;
    }

    public void setLasReparaciones(ArrayList<Reparacion> lasReparaciones) {
        this.lasReparaciones = lasReparaciones;
    }
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Propietario getElPropietario() {
        return elPropietario;
    }

    public void setElPropietario(Propietario elPropietario) {
        this.elPropietario = elPropietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", elPropietario=" + elPropietario + ", lasReparaciones=" + lasReparaciones + '}';
    }

    
   


}