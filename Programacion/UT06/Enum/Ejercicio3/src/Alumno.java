public class Alumno {
private String nombre;
private int matricula;
private Modulo[] modulos;

public Alumno(String nombre, int matricula, Modulo[] modulos) {
    this.nombre = nombre;
    this.matricula = matricula;
    this.modulos = modulos;
}

public String mostrarInformacion(){
    StringBuilder sb = new StringBuilder();
    System.out.println("Nombre completo: ");
    sb.append(this.nombre);
    System.err.println("Matricula: ");
    sb.append(this.matricula);
    System.out.println("Modulos: ");
    for (Modulo m: modulos){
    sb.append(m.getNombre());    
    }
    
    return sb.toString(); 
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getMatricula() {
    return matricula;
}
public void setMatricula(int matricula) {
    this.matricula = matricula;
}
public Modulo[] getModulos() {
    return modulos;
}
public void setModulos(Modulo[] modulos) {
    this.modulos = modulos;
}
}
/*Clase Alumno:

Atributos:

nombre (String): Nombre completo del alumno.

matricula (String): Número de matrícula único del alumno.

modulos (Array de Módulos): Lista de módulos en los que está inscrito el alumno.

Métodos:

Constructor para inicializar los atributos.

Métodos agregarModulo y mostrarInformacion.
*/