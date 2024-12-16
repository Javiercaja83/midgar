//Este es el elemento <ul>
let ulNombres = document.getElementById("ulNombres")
// Esta es la lista en foram de array. Inicia vacia
let lista= []
//este es el input donde se ponen los nombres a agregar
let inNombre = document.getElementById("inNombre")
function agregar() 
{
    if(inNombre.value){
    //Meter el valor introducido en el array
    lista.push(inNombre.value)
    //Ampliar la etiqueta <ul> en el array
    // esto equivale a "<li>" + inNombre.value + "</li>"
    ulNombres.innerHTML += `<li>${inNombre.value}</li>`
    //vaciar input
    inNombre.value = ""
    }
}
function borrar() {
    ulNombres.innerHTML = ""
    lista = []
//investigar en w3Schools como eliminar un elemento html en javascript, siendo esta splice(), que sirve para agregar, sustituir o borrar
//comprobar la lsita el nombre introducido dentro del array y eliminarlo dentro del array y el ul
}
