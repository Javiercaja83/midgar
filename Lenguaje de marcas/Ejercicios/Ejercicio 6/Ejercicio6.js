let insertTarea = document.getElementById("input_tarea")
let botonTarea = document.getElementById("boton_tarea")
let listaTareas = document.getElementById("lista_tareas")
let contador = 1;

botonTarea.addEventListener("click", () =>{
    if(insertTarea.value.trim() === "" ){
        alert("Espacio vacío, por favor ingresa algo de texto")
    }else{
    let Tarea = document.createElement("li")
    Tarea.textContent = insertTarea.value
    listaTareas.appendChild(Tarea)
    insertTarea.value = "";
}
});