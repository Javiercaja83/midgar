let divBotones = getElementById("botones")

function agregar()
{
    divBotones.innerHTML += "<button onclick='eliminar(this)'>BOTON</button>"
}

function eliminar(boton)
{
    boton.remove()
}

function agregarimagen(boton_imagen){
    divimagenes.innerHTML += "<img src='imagen.jpg'>"
}