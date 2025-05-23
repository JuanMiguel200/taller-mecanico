package modelo;

import java.time.LocalDate;

public class Vehiculo implements Calculos{
    protected String marca;
    protected String placa;
    protected int modelo;
    protected LocalDate fechaInfreso;
    protected LocalDate fechaSalida;
    protected Propietario elPropietario;

    public Vehiculo(String marca, String placa, int modelo, LocalDate fechaInfreso, LocalDate fechaSalida, Propietario elPropietario) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.fechaInfreso = fechaInfreso;
        this.fechaSalida = fechaSalida;
        this.elPropietario = elPropietario;
    }
    
    public void agregarReparacion(){
        
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

    public LocalDate getFechaInfreso() {
        return fechaInfreso;
    }

    public void setFechaInfreso(LocalDate fechaInfreso) {
        this.fechaInfreso = fechaInfreso;
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
        return "EntregaFinal{" + "marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", fechaInfreso=" + fechaInfreso + ", fechaSalida=" + fechaSalida + ", elPropietario=" + elPropietario + '}';
    }


}