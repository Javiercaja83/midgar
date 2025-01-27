public class Principal {
    public static void main(String[] args) {
        Modulo[] modulos = new Modulo[2];
        Nota[] notas = new Nota[5];
        notas[0] = new Nota(TipoNota.EXTRAORDINARIA, 0);
        modulos[0] = new Modulo("Sistemas", "013", notas);
        modulos[1] = new Modulo("Programacion", "014", notas);
        Alumno alumno1 = new Alumno("Javier", 291 , modulos);
        alumno1.mostrarInformacion();
    }
    public void menu(){
        System.out.println("Menu de gestion de alumnos");
    }
}
/* El programa debe ofrecer un menú para gestionar:

Añadir alumnos, módulos y notas.

Listar alumnos con sus módulos y calificaciones.

Mostrar estadísticas como promedios por módulo o alumno. */