let boton_01 = document.getElementById("boton_01")

function cambiarBoton(){
    if (boton_01.innerHTML == "TRUE"){
        boton_01.innerHTML = "FALSE"
    } else {
        boton_01.innerHTML = "TRUE"
    }
}