package practicaListaLigada;

public class ListaLigada<T> {
    private Nodo<T> head;
    private int tamanio=0;
    
    public ListaLigada() {
    }

    public void agregarDespuesDe(Nodo<T> referencia,T dato){
        Nodo<T> auxiliar= new Nodo<>(dato,referencia.getSiguiente());
        referencia.setSiguiente(auxiliar);;
        tamanio++;
    }

    public void agregarAlFinal(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if(head == null){
            head = nuevo;
        }else {
            Nodo<T> aux = this.head;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }   
        tamanio++;
    }

    public void transversal(){
        Nodo<T> aux = this.head;
        while (aux != null){
            System.out.print(aux.getDato() + " --> ");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }

    public boolean estaVacia(){
        if (this.head == null) {
            System.out.println("esta vacia");
            return true;
        }
        System.out.println("no esta vacia");
        return false;
    }

    public void insertarAlInicio(T dato){
        
        this.head = new Nodo<>(dato, this.head);
        tamanio++;
    }
    public int getTamanio(){
         return this.tamanio;
    }
    
    public void elminar(int posicion){
        Nodo<T>aux=this.head;
        for(int i=1;i<posicion-1;i++){
            aux=aux.getSiguiente();
        }
        aux.setSiguiente((aux.getSiguiente().getSiguiente()));
        tamanio--;
    }
    public void eliminarElPrimero(){
        head=head.getSiguiente();
        tamanio--;
    }
    public void eliminarElFinal(){
        this.elminar(this.tamanio);
        
    }
    public int buscar(T valor){
        Nodo<T>aux=this.head;
        int contador=1;
        while(aux.getDato()!=valor){
            aux=aux.getSiguiente();
            contador++;
        }
        return contador;

    }
    public void actualizar(T aBuscar,T dato){
        Nodo<T>aux=this.head;
        while(aux.getDato()!=aBuscar){
            aux=aux.getSiguiente();
            if(aux==null){
                System.out.println("no existe esa referencia");
                return;
            }
        }
        aux.setDato(dato);
    }
}

