public class Main {
    public static void main(String[] args) {
        
        NodoArbol<Integer> raiz = new NodoArbol<>(10,new NodoArbol<>(5,new NodoArbol(1),null),new NodoArbol<>(15,null,new NodoArbol<>(25)));
        
        System.out.println("Arbol de numeros:");
        System.out.println(raiz);

        NodoArbol<String> raiz2 = new NodoArbol<>("Diego",new NodoArbol<>("Pedro",new NodoArbol<>("Susan"),new NodoArbol<>("Diana")),new NodoArbol<>("Mario"));
        System.out.println("Arbol de nombres:");
        System.out.println(raiz2);
        
        
    }
}