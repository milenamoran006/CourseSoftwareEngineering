public class Nomina{
    private int id;
    private String nombre;
    private Trabajador trabajador;

    public Nomina(int id, String nombre, Trabajdor trabador){
        this.id=id;
        this.nombre=nombre;
        this.trabajador=trabajador;
    }

    public void generarPagos(Trabajador[] t){
        for(int i = 0; i < t.length; i++){
            System.out.println("Id: " + id + "Nombre: " + nombre + "pago generado: " + trabajdor.pagar());
        }
    }
}