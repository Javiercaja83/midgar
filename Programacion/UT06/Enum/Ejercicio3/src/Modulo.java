import java.util.Arrays;

public class Modulo {
    private String nombre;
    private String codigo;
    private Nota[] notas;

    public Modulo(String nombreModulo, String codigoModulo, Nota[] notas) {
        this.nombre = nombreModulo;
        this.codigo = codigoModulo;
        this.notas  = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Modulo [nombreModulo=" + nombre + ", codigo=" + codigo+ ", notas="
                + Arrays.toString(notas) + "]";
    }

    
 }

/***Clase Modulo*:

Atributos:

nombre (String): Nombre del módulo (por ejemplo, "Programación").

codigo (String): Código único del módulo.

notas (Array de Notas): Lista de las evaluaciones (primera, segunda, tercera, ordinaria y extradinaria) del módulo.

Métodos: Constructor para inicializar los atributos. Métodos para agregar una nota y calcular la nota media. */