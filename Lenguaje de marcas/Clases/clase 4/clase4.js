//Este es el elemento <ul>
let ulNombres = document.getElementById("ulNombres")
// Esta es la lista en foram de array. Inicia vacia
let lista= []
//Este es el parrafo donde se almacena el numero de personas
let recuentis = document.getElementById("recuento")
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
    actualizarContador
    }
//el caracter ` sirve hacer una referencia de Javascript

}
function cargarlista()
{
    for(let i = 0; i <lista.length; i++) {
        
    }
}
function eliminar()
{
    if (inNombre.value){
        for (let i = 0; i < lista.length; i++) {
            if(inNombre.value == lista[i])  {
                //preguntamos si el nombre introducido coincide con el elemento "i"
                lista.splice(i, 1);
                ulNombres.innerHTML = ""
                cargarLista()
                i--
            }

        
      } 
    
    }
function actualizarContador()
{

}
}
