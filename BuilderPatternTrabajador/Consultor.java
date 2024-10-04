public class Consultor extends Trabajador{
    private int id;
    private String nombre;
    private double comision;
    private double venta;

    public Consultor(int id, String nombre, double comision, double venta){
        this.id=id;
        this.nombre=nombre;
        this.comision=comision;
        this.venta=venta;
    }
    public double pagar(){
        return comision*venta;
    }
    //git add.
    //git commit-m "creacion clase trabador"
    //git push  o   git push origin main
}