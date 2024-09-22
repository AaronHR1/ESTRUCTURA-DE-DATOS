import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    
    public static void main(String[] args) {
        String codigo="";
        try {
            codigo = new String(Files.readAllBytes(Paths.get("C:/Users/arn/Estructuras-de-Datos/pruebatexto3.txt")));
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        revisionBalanceo(codigo);
        
    }

    public static boolean revisionBalanceo(String texto){
        StackADT parentesis = new StackADT<>();
        StackADT llaves  = new StackADT<>();
        boolean p=true;
        boolean l=true;

        for(int i=0;i<texto.length();i++){
            char c=texto.charAt(i);

            switch (c) {
                case '(':
                    parentesis.push(c);
                    break;
                case ')':
                    if(parentesis.isEmpty()){
                        System.out.println("un parentesis de mas en la posicion: " + i);
                        p=false;
                    }else{
                        parentesis.pop();
                    }
                    
                    break;
                case '{':
                    llaves.push(c);
                    break;
                case '}':
                    if(llaves.isEmpty()){
                        System.out.println("una llave de mas en la posicion: " + i);
                        l=false;
                    }else{
                        llaves.pop();
                    }
                    break;
            }
        }

        if(p && !parentesis.isEmpty()){
            System.out.println("hay parentesis sin cerrar");
            p=false;
        }

        if(l && !llaves.isEmpty()){
            System.out.println("hay parentesis sin cerrar");
            l=false;
        }


        if(p && l){
            System.out.println("Balanceo de parentesis y llaves correcto");
        }else{
            System.out.println("El codigo no esta balanceado");
        }
        return p && l;

    }
    
}
