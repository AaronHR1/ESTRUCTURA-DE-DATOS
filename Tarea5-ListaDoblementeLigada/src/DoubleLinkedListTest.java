public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> listaNumeros= new DoubleLinkedList<>();
        listaNumeros.agregarAlInicio(50);
        listaNumeros.agregarAlFinal(60);
        listaNumeros.agregarAlFinal(65);
        listaNumeros.agregarAlFinal(70);
        listaNumeros.agregarAlFinal(80);
        listaNumeros.agregarAlFinal(90);
        listaNumeros.transversal(0);
        listaNumeros.eliminar(2);
        listaNumeros.transversal(0);
        listaNumeros.actualizar(4,88);
        listaNumeros.transversal(0);
        System.out.println(listaNumeros.buscar(80));
    }
    
}
    
