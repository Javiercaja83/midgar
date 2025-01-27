## Ejercicio notas.
Enunciado del ejercicio: Sistema de Gestión Académica

Diseña un programa en Java que gestione la información de alumnos, módulos y notas de una institución educativa. El programa debe cumplir con los siguientes requisitos: Tendrá las siguientes clases, Principal, Alumno, Modulo, Nota

***Clase Alumno:***

Atributos:

nombre (String): Nombre completo del alumno.

matricula (String): Número de matrícula único del alumno.

modulos (Array de Módulos): Lista de módulos en los que está inscrito el alumno.

Métodos:

Constructor para inicializar los atributos.

Métodos agregarModulo y mostrarInformacion.

***Clase Modulo:***

Atributos:

nombre (String): Nombre del módulo (por ejemplo, "Programación").

codigo (String): Código único del módulo.

notas (Array de Notas): Lista de las evaluaciones (primera, segunda, tercera, ordinaria y extradinaria) del módulo.

Métodos: Constructor para inicializar los atributos. Métodos para agregar una nota y calcular la nota media.

***Clase Nota:***

Atributos: tipo (Enum): Tipo de evaluación (Primera, Segunda, Tercera, Ordinaria, Extraordinaria).

calificacion (double): Nota obtenida.

Métodos:

Constructor para inicializar los atributos.

Enum TipoNota:

Valores: PRIMERA, SEGUNDA, TERCERA, ORDINARIA, EXTRAORDINARIA.

Funcionalidad del programa:

El programa debe permitir registrar nuevos alumnos con sus módulos y notas. (Haremos la prueba creando las instancias en el main)

Debe ser posible calcular y mostrar:

El promedio de calificaciones de un módulo.

La calificación final del alumno (promedio de todos los módulos).

(Una vez escrito el código con las clases y su funcionalidad, añadiremos el menú) El programa debe ofrecer un menú para gestionar:

Añadir alumnos, módulos y notas.

Listar alumnos con sus módulos y calificaciones.

Mostrar estadísticas como promedios por módulo o alumno.