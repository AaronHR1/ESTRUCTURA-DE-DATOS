public class potenciaNumero {
    public static void main(String[] args) {
        System.out.println("7 a la 3:"  );
        System.out.println(potencia(7,3));
    }
    
    public static int potencia(int numero,int exponente){
        if(exponente==0){
            return 1;
        }

        return numero*potencia(numero, exponente-1);
    }
}
