public class Ejecutartrabajador{
    //Creacion de objetos
    Trabajador objT1 = new Consultor(1.25, 3000000.0);
    Trabajador objT2 = new Operario(192);
    Trabajador objT3 = new Gerente(12000000.0);

    Nomina objNomina1= new Nomina(1, "juan", objT1);
    Nomina objNomina2= new Nomina(2, "pedro", objT2);
    Nomina objNomina3= new Nomina(3, "judas", objT3);

    Nomina objNomina = new Nomina();    

}