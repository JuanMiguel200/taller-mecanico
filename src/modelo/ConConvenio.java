package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class ConConvenio extends Vehiculo implements Serializable{
    private LocalDate fechaAfiliacion;

    public ConConvenio(LocalDate fechaAfiliacion, String marca, String placa, int modelo, LocalDate fechaInfreso, LocalDate fechaSalida, Propietario elPropietario) {
        super(marca, placa, modelo, fechaInfreso, fechaSalida, elPropietario);
        this.fechaAfiliacion = fechaAfiliacion;
    }
    
    @Override
    public double calcularTotal(ArrayList<Reparacion> data){        
        double res = 0;
        for(Reparacion rep : data){
            res += rep.getValorInicial();
            
        }  
        res = res*0.8;
        return res;
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
