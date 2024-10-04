public class Operario extends Trabajador{    
    private double horas;
    private final double valor_hora=5500.0;

    public Operario(double horas){        
        this.comision=horas;      
        this.valor_hora= valor_hora;  
    }
    public double pagar(){
        return comision*venta;
    }