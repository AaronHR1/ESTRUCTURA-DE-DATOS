package practicaListaLigada;

public class SmartPhone {
    int añoVenta;
    String modelo;

    public SmartPhone(){

    }
    public SmartPhone(int año,String modelo){
        this.añoVenta=año;
        this.modelo=modelo;
    }
    public int getAñoVenta() {
        return añoVenta;
    }
    public void setAñoVenta(int añoVenta) {
        this.añoVenta = añoVenta;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public String toString(){
        return "Modelo:" + this.getModelo() + " Año de venta= " + this.getAñoVenta();
    }
}
