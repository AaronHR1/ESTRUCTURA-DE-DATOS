public class ClienteBanco {
    private int prioridad;
    private int saldo;
    private String nombre;
    public ClienteBanco(int prioridad,int dinero,String nombre){
        this.nombre=nombre;
        this.prioridad=prioridad;
        this.saldo=dinero;
    }
    public int getPrioridad() {
        return prioridad;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void retirar(int cantidad){
        if(cantidad>this.saldo){
            System.out.println("No cuentas con esa cantidad de saldo");
        }else{
            saldo-=cantidad;
            System.out.println("Retiro de "+ cantidad+" completado");
        }
        
    }

    public void depositar(int cantidad){
        saldo+=cantidad;
        System.out.println("Deposito completado");
    }
    @Override
    public String toString() {
        return "ClienteBanco{ " + this.nombre+
                " saldo= " + this.saldo+
                " prioridad= " + this.prioridad;
    }       
}
