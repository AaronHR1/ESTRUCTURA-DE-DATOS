public class mergeSort{
    public static void main(String[] args) {
        int[] arreglo={3,42,3,9,25,12,100,91,0,18};
        arreglo=mergesort(arreglo);
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i] + ">");
        }
    }
    
    public static int[] mergesort(int[] arreglo){
        int mitad=0;
        if (arreglo.length>1){
            mitad=arreglo.length/2;   
        

            int[ ] left = new int[mitad];     
            int[ ] right = new int[arreglo.length - mitad];  

            int i=0;
            for(i=0;i<mitad;i++){
                left[i]=arreglo[i];
            }

            for(i=0;i<right.length;i++){
                right[i]=arreglo[mitad+i];
            }

            mergesort(left);
            mergesort(right);

            i=0;
            int d=0;
            int k=0;

            while (i< left.length && d<right.length) {
                if(left[i]<right[d]){
                    arreglo[k]=left[i];
                    i++;
                }else{
                    arreglo[k]=right[d];
                    d++;
                }

                k++;
            
            }

            while(i<left.length){
                arreglo[k]=left[i];
                i++;
                k++;
            }
            while(d<right.length){
                arreglo[k]=right[d];
                d++;
                k++;
            }

            return arreglo;
        }
        return null;
    }
}