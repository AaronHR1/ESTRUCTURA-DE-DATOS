import java.util.HashSet;

public class conjuntoADT<T>{

    private  HashSet<T> set = new HashSet<>();


    public conjuntoADT(){

    }
    public conjuntoADT(HashSet<T> setPrev){
        this.set=setPrev;

    }
    
    public int longitud(){
        return this.set.size();
    }

    public boolean contiene(T elemento){
        if(this.set.contains(elemento)){
            return true;
        }else{
            return false;
        }
    }

    public void agregar(T elemento){
        if(this.contiene(elemento)==true){
            System.out.println("El elemento ya esta dentro del set");
        }else{
            set.add(elemento);
        }
    }

    public void eliminar(T elemento){
        if(this.contiene(elemento)==true){
            this.set.remove(elemento);
        }else{
            System.out.println("El elemento no esta dentro del set");
        }
    }

    public boolean equals(HashSet<T> otroConjunto){
        if(this.set.equals(otroConjunto)){
            return true;
        }else{
            return false;
        }
    }

    public boolean esSubconjunto(HashSet<T> otroConjunto){
        if(otroConjunto.containsAll(this.set)){
            return true;
        }else{
            return false;
        }
    }
    
    public HashSet<T> union(HashSet<T> otroConjunto){
        HashSet<T> setAux = new HashSet<>();
        setAux.addAll(this.set);
        setAux.addAll(otroConjunto);
        return setAux;
    }

    public HashSet<T> interseccion(HashSet<T> otroConjunto){
        HashSet<T> setAux= new HashSet<>(this.set);
        setAux.retainAll(otroConjunto);
        return setAux;
    }

    public HashSet<T> diferencia(HashSet<T> otroConjunto){
        HashSet<T> setAux= new HashSet<>(this.set);
        setAux.removeAll(otroConjunto);
        return setAux;
    }
    public HashSet<T> getSet(){
        return this.set;
    }

    public void imprimirSet(){

        if(this.longitud()==0){
            System.out.println("El set no tiene elementos");
        }

        for(T elemento : this.set) {
            System.out.print(elemento + ",");
        }
        System.out.println();
    }

}