package practicaListaLigada;

public class Tarea4PracticaListaLigada {

    public static void main(String[] args) {
       ListaLigada<SmartPhone>Telefonos=new ListaLigada<>();
       SmartPhone poco=new SmartPhone(2004,"Poco 2x");
       Telefonos.insertarAlInicio(poco);
       SmartPhone galaxy=new SmartPhone(2014,"Samsung galaxy");
       Telefonos.insertarAlInicio(galaxy);
       SmartPhone motorola=new SmartPhone(2016,"Motorola gp");
       Telefonos.insertarAlInicio(motorola);
       SmartPhone xiaomi=new SmartPhone(2024,"Xiaomi smart plus");
       Telefonos.insertarAlInicio(xiaomi);
       SmartPhone LG=new SmartPhone(2001,"LG powerD");
       Telefonos.insertarAlInicio(LG);
       Telefonos.transversal();
       System.out.println();
       Telefonos.elminar(2);
       Telefonos.transversal();
       System.out.println();
       Telefonos.actualizar(motorola,new SmartPhone(2013,"Alcatel xp"));
       SmartPhone honor=new SmartPhone(2002,"honor elite 24");
       Telefonos.insertarAlInicio(honor);
       SmartPhone oppo=new SmartPhone(2003,"oppo plus x");
       Telefonos.agregarAlFinal(oppo);
       Telefonos.transversal();
       System.out.println();
       Telefonos.eliminarElPrimero();
       Telefonos.transversal();
    }
}
