public class main {
    public static void main(String[] args) {

        conjuntoADT<Integer> conjuntoA= new conjuntoADT<>();
        conjuntoADT<Integer> conjuntoB= new conjuntoADT<>();

        //agregando elementos//
        /* 
        conjuntoA.agregar(88);
        conjuntoA.agregar(88);
        conjuntoA.imprimirSet();
        conjuntoA.eliminar(88);
        conjuntoA.imprimirSet();
        */

        conjuntoA.agregar(88);
        conjuntoA.agregar(14);
        conjuntoA.agregar(4);
        conjuntoA.agregar(1);
        conjuntoA.agregar(5);
        conjuntoA.agregar(24);
        conjuntoA.agregar(38);
        conjuntoA.agregar(47);

        conjuntoB.agregar(5);
        conjuntoB.agregar(4);
        conjuntoB.agregar(38);
        conjuntoB.agregar(47);
        conjuntoB.agregar(23);
        conjuntoB.agregar(2);
        conjuntoB.agregar(14);
        conjuntoB.agregar(3);
        conjuntoB.agregar(89);

        
        /* 
        if(conjuntoA.contiene(1)){
            System.out.println("El conjuntoA si contiene ese numero");
        }else{
            System.out.println("El conjuntoA no contiene ese numero");
        }

        if(conjuntoB.contiene(1)){
            System.out.println("El conjuntoBsi contiene ese numero");
        }else{
            System.out.println("El conjuntoB no contiene ese numero");
        }
        */
        /* 
        HashSet<Integer> conjuntoUnion=conjuntoA.union(conjuntoB.getSet());
        conjuntoADT<Integer> conjuntoUnionADT= new conjuntoADT<>(conjuntoUnion);
        System.out.println("Opereación Unión:");
        conjuntoUnionADT.imprimirSet();

        HashSet<Integer> conjuntoInterseccion=conjuntoA.interseccion(conjuntoB.getSet());
        conjuntoADT<Integer> conjuntoInterseccionADT= new conjuntoADT<>(conjuntoInterseccion);
        System.out.println("Opereación Intersección:");
        conjuntoInterseccionADT.imprimirSet();
        
        HashSet<Integer> conjuntoDiferencia=conjuntoA.diferencia(conjuntoB.getSet());
        conjuntoADT<Integer> conjuntoDiferenciaADT= new conjuntoADT<>(conjuntoDiferencia);
        System.out.println("Opereación Diferencia:");
        conjuntoDiferenciaADT.imprimirSet();
        */

        if(conjuntoA.equals(conjuntoB.getSet())){
            System.out.println("los conjuntos son iguales");
        }else{
            System.out.println("los conjuntos no son iguales");
        }

        if(conjuntoA.esSubconjunto(conjuntoB.getSet())){
            System.out.println("El conjunto A es subconjunto del conjunto B");
        }else{
            System.out.println("El conjunto A no es subconjunto del conjunto B");
        }






    }  
}
