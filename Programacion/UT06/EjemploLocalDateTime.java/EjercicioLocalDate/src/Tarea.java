import java.time.LocalDate;
public class Tarea {       
     /*Creamos una clase llamada Tarea, donde cada tarea tiene un nombre, una descripcion y una fecha de vencimiento (utilizando LocalDate)*/
    private String nombre;
    private String descripcion;
    private LocalDate fechaVencimiento;

    public Tarea(String nombre, String descripcion, LocalDate fechaVencimiento) {
        this.nombre = nombre; 
        this.descripcion = descripcion;
        fechaVencimiento = fechaVencimiento;
    }

 public String enseñarTarea(){
    StringBuilder sb = new StringBuilder();
    System.out.println("Nombre" + this.nombre +
    "Descripcion" + this.descripcion +
    "Fecha de vencimiento" + this.fechaVencimiento);
    return "";
 }

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public LocalDate getFechaVencimiento() {
    return fechaVencimiento;
}

public void setFechaVencimiento(LocalDate fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
}
 
}
