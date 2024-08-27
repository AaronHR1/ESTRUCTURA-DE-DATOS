public class PracticaNodo {
    public static void main(String[] args){
        
        Nodo<Integer> head = new Nodo<>(100,new Nodo<>(200, new Nodo<>(300, new Nodo<>(400,new Nodo<>(600)))) );
        Nodo<Integer>aux=head;
        System.out.print("|");
        while(aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }

        System.out.println();
        System.out.println("Cambiamos valor a 333");
        
        aux=head;
        
        aux=aux.getSiguiente().getSiguiente();
        aux.setDato(333);
        aux=head;

        System.out.print("|");
        while(aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }

        System.out.println();
        System.out.println("Agregamos el nodo 700");
        
        aux=head;
        while(aux.getSiguiente() != null){
            aux=aux.getSiguiente();
        }
        aux.setSiguiente(new Nodo(700));
        aux=head;
        System.out.print("|");
        while(aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }

        

        System.out.println();
        System.out.println("Agregamos el nodo 50");
        
        Nodo<Integer> nuevoHead = new Nodo(50,head);
        aux=nuevoHead;
        System.out.print("|");
        while(aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
    
    }  
}
