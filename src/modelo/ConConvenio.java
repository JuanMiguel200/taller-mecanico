package modelo;

import java.time.LocalDate;

public class ConConvenio extends Vehiculo{
    private LocalDate fechaAfiliacion;

    public ConConvenio(LocalDate fechaAfiliacion, String marca, String placa, int modelo, LocalDate fechaInfreso, LocalDate fechaSalida, Propietario elPropietario) {
        super(marca, placa, modelo, fechaInfreso, fechaSalida, elPropietario);
        this.fechaAfiliacion = fechaAfiliacion;
    }
    
    public double calcularTotal(){        
        return 0;
    }
    
    public double calcularBono(){        
        return 0;
    }
    
    public LocalDate getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(LocalDate fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    @Override
    public String toString() {
        return "ConConvenio{" + "fechaAfiliacion=" + fechaAfiliacion + super.toString() + '}';
    }
        
}
