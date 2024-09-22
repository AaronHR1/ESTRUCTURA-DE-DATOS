public class main {
    public static void main(String[] args) {
        ColaConPrioridadAcotada<ClienteBanco> cola = new ColaConPrioridadAcotada<>(5);

        ClienteBanco cliente1= new ClienteBanco(4, 15000, "Arturo Carlos Gonzales");
        cola.encolar(cliente1.getPrioridad(),cliente1);
        ClienteBanco cliente2= new ClienteBanco(4, 5000, "Fernanda Quinoz Morales");
        cola.encolar(cliente2.getPrioridad(),cliente2);
        ClienteBanco cliente3= new ClienteBanco(5, 40000, "Mariana Alvarado");
        cola.encolar(cliente3.getPrioridad(),cliente3);
        ClienteBanco cliente4= new ClienteBanco(5, 250, "Estephany Martinez");
        cola.encolar(cliente4.getPrioridad(),cliente4);
        ClienteBanco cliente5= new ClienteBanco(5, 10000, "Gilberto Gonzales");
        cola.encolar(cliente5.getPrioridad(),cliente5);
        ClienteBanco cliente6= new ClienteBanco(1, 23000000, "Cristiano Ronaldo");
        cola.encolar(cliente6.getPrioridad(),cliente6);
        System.out.println(cola);
        System.out.println();
        ClienteBanco atender=cola.desEncolar();
        System.out.println("Atendiendo a: " + atender);
        atender.retirar(1000);
        ClienteBanco cliente7= new ClienteBanco(3, 500000, "Mohamed Rodriguez");
        cola.encolar(cliente7.getPrioridad(),cliente7);
        ClienteBanco cliente8= new ClienteBanco(2, 10000000, "Lic. Carlitos J.");
        cola.encolar(cliente8.getPrioridad(),cliente8);
        
        ClienteBanco atender1=cola.desEncolar();
        System.out.println("Atendiendo a: " +atender1);
        System.out.println();
        System.out.println(cola);
        System.out.println();
        while(cola.estaVacia()!= true){
            ClienteBanco actual=cola.desEncolar();
            System.out.println("Atendiendo a: " + actual);
        }
        System.out.println();
        System.out.println(cola);
    }
}
