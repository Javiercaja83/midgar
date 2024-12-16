let numero =document.getElementById("numero")
let boton = document.getElementById("boton")
let dbi = document.getElementById("dni")
let letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE"
let cont =0
let letraDNI
let valoractual
function sumar(){
    valoractual = parseInt(numero.innerHTML)
    numero.innerHTML = valoractual +1
}
boton.addEventListener('click', sumar);

function checkDNI()
{
    if (InputDeviceInfo.value.length == 8){
        letraDNI.innerHTML = letrasDNI.charAt(inputDNI.value % 23)
        inputDNI.style.backgroundColor = "darkgreen"
    } else {
        inputDNI.style.backroundColor = "darkred"
        letrasDNI.innerHTML = ""
    }
}   