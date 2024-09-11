public class pruebaJuegoDeLaVida {
    public static void main(String[] args) {
        Array2d arreglo=new Array2d( 4,4);
        arreglo.clear('m');
        
        arreglo.setItem(0,0, 'v');
        arreglo.setItem(0,3, 'v');
        arreglo.setItem(1,1, 'v');
        arreglo.setItem(1,2, 'v');
        arreglo.setItem(2,1, 'v');
        arreglo.setItem(2,2, 'v');
        arreglo.setItem(3,0, 'v');
        arreglo.setItem(3,3, 'v');
        
        System.out.println(arreglo);
        juegoDeLaVida(arreglo, 2);
        
        
    }
    

    public static void juegoDeLaVida(Array2d rejilla,int generaciones){
        if(generaciones==0){
            return ;
        }
        
        Array2d nuevaRejilla=new Array2d(rejilla.getRowSize(),rejilla.getColSize());
        

        for(int fila=0;fila<=rejilla.getRowSize();fila++){
            for(int columna=0;columna<=rejilla.getColSize();columna++){
                
                int vivos=numeroVecinosVivos(rejilla,fila,columna);

                if(rejilla.getItem(fila,columna)=='v'){

                    if(vivos>=4 || vivos<=1){
                        nuevaRejilla.setItem(fila,columna,'m');
                    }
                    else{
                        nuevaRejilla.setItem(fila,columna,'v');
                    }

                }else if (rejilla.getItem(fila,columna)=='m') {
                    if(vivos==3){
                        nuevaRejilla.setItem(fila,columna,'v');
                    }else{
                        nuevaRejilla.setItem(fila,columna,'m');
                    }
                }
            }
        }
        
        System.out.println(nuevaRejilla);

        juegoDeLaVida(nuevaRejilla, generaciones-1);
    }

    public static int numeroVecinosVivos(Array2d rejilla,int fila,int columna){
        int numeroVecinos=0;
        for(int i=columna-1;i<=columna+1;i++){
            if(rejilla.getItem(fila-1,i)!='\0' && rejilla.getItem(fila-1,i)=='v'){
                numeroVecinos++;
            }
        }
        for(int i=columna-1;i<=columna+1;i++){
            if(rejilla.getItem(fila+1,i)!='\0' && rejilla.getItem(fila+1,i)=='v'){
                numeroVecinos++;
            }
        }

        if(rejilla.getItem(fila,columna-1)!='\0' && rejilla.getItem(fila,columna-1) == 'v'){
            numeroVecinos++;
        }
        if(rejilla.getItem(fila,columna+1)!='\0' && rejilla.getItem(fila,columna+1) == 'v'){
            numeroVecinos++;
        }

        return numeroVecinos;
    }
}
