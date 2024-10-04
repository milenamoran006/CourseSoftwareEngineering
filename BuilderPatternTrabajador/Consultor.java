public class Consultor extends Trabajador{
    private double comision;
    private double venta;

    public Consultordouble comision, double venta){        
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