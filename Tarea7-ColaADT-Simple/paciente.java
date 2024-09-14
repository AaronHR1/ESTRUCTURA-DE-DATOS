public class paciente {
    private String nombre;
    private String padecimiento;
    private int edad;
    
    public paciente(String nombre,String padecimiento,int edad){
        this.nombre=nombre;
        this.padecimiento=padecimiento;
        this.edad=edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getPadecimiento() {
        return padecimiento;
    }

   
    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

  
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre +
                ", Padecimiento: " + padecimiento +
                ", Edad: " + edad; 
    }
    
}
