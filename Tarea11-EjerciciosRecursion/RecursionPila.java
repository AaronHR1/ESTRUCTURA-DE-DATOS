public class RecursionPila{
    public static void main(String[] args) {
        StackADT<Integer> pila = new StackADT<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);

    
        System.out.println("Pila anterior: " +pila);
        StackADT<Integer> pila2=valorMedioPila(pila,pila.length());
        System.out.println(pila2);
    }

    public static <T> StackADT<T> valorMedioPila(StackADT<T> pila, int longitud){
        if(pila.length()==longitud/2){
            return null;
        }
        
        T valor = pila.pop();

        if(valorMedioPila(pila,longitud)!=null){
            pila.push(valor);
        }

        return pila;
    }
}