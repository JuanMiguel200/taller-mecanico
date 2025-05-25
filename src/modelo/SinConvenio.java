package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class SinConvenio extends Vehiculo implements Serializable{
    private String aseguradora;

    public SinConvenio(String aseguradora, String marca, String placa, int modelo, LocalDate fechaInfreso, LocalDate fechaSalida, Propietario elPropietario) {
        super(marca, placa, modelo, fechaInfreso, fechaSalida, elPropietario);
        this.aseguradora = aseguradora;
    }
    @Override
    public double calcularTotal(ArrayList<Reparacion> data){        
        double res = 0;
        for(Reparacion rep : data){
            res += rep.getValorInicial();
        }  
        return res;
    }
    
    public double calcularBono(){        
        return 0;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    @Override
    public String toString() {
        return "SinConvenio{" + "aseguradora=" + aseguradora + super.toString()+ '}';
    }

    
    
    
}