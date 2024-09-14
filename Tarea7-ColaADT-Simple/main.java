public class main {
    public static void main(String[] args) {
        SistemaPacientesClinica cola = new SistemaPacientesClinica();
        cola.registrarPaciente(new paciente("Carlos", "dolor de espalda", 76));
        cola.registrarPaciente(new paciente("Fernanda", "diabetes ", 46));
        cola.registrarPaciente(new paciente("Gilberto", "cancer", 22));
        System.out.println(cola.mostrarCola());
        cola.mostrarSiguientePaciente();
        cola.atenderPaciente();
        System.out.println(cola.mostrarCola());
        cola.registrarPaciente(new paciente("Yazmin ", "gripe", 34));
        cola.registrarPaciente(new paciente("Esteban", "alergia", 8));
        cola.atenderPaciente();
        System.out.println(cola.mostrarCola());
    }
}
