package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class ConConvenio extends Vehiculo implements Serializable{
    private LocalDate fechaAfiliacion;

    public ConConvenio(LocalDate fechaAfiliacion, String marca, String placa, int modelo, LocalDate fechaInfreso, LocalDate fechaSalida, Propietario elPropietario) {
        super(marca, placa, modelo, fechaInfreso, fechaSalida, elPropietario);
        this.fechaAfiliacion = fechaAfiliacion;
    }
    
    public double calcularTotal(){ 
        double res = 0;
        for(Reparacion rep : super.lasReparaciones){
            res += rep.getValorInicial();
        }
        res = res-(res*0.2);  
            
        return res;
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
