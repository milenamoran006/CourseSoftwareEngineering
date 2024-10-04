public class Operario extends Trabajador{    
    private double horas;
    private final double valor_hora=5500.0;

    public Operario(int id, String nombre, double horas){
        this.id=id;
        this.nombre=nombre;
        this.comision=horas;        
    }
    public double pagar(){
        return comision*venta;
    }