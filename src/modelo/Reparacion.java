public class Reparacion {
    private String descripcion;
    private String estado;
    private double valorInicial;
    static private String encargado;

    
    public Reparacion(String descripcion, String estado, double valorInicial, String encargado) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.valorInicial = valorInicial;
        this.encargado = encargado;
    }
    
    public Reparacion(String descripcion, String estado, double valorInicial) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.valorInicial = valorInicial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public static String getEncargado() {
        return encargado;
    }

    public static void setEncargado(String encargado) {
        Reparacion.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "descripcion=" + descripcion + ", estado=" + estado + ", valorInicial=" + valorInicial + ", encargado=" + encargado +'}';
    }


    
}
