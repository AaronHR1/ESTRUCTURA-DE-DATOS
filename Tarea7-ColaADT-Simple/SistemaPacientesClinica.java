public class SistemaPacientesClinica {
    ColaADT<paciente> pacientes= new ColaADT<>();

    public SistemaPacientesClinica(ColaADT<paciente> cola){
        this.pacientes=cola;
    }

    public SistemaPacientesClinica(){
        
    }
    
    public void registrarPaciente(paciente p){
        pacientes.encolar(p);
    }
    public void atenderPaciente(){
        paciente pacienteActual=pacientes.desEncolar();
        System.out.println("Atendiendo a el paciente:");
        System.out.println(pacienteActual);
    }
    public String mostrarCola(){
        return pacientes.toString();
    }

    public boolean colaVacia(){
        if(pacientes.estVacia()==true){
            System.out.println("Ya no hay pacientes esperando");
            return true;
        }else{
            System.out.println("Todavia hay pacientes en la cola");
            return false; 
        }
    }
    public void mostrarSiguientePaciente(){
        paciente pacienteSiguiente=pacientes.frente();
        System.out.println("Siguiente paciente en la cola:");
        System.out.println(pacienteSiguiente);
    }
}
