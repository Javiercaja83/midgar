let marcador  =document.getElementById("marcador")
let imagen = document.getElementById("imagen");

function sumar(){
    marcador.innerHTML = parseInt(marcador.innerHTML) + 1
    
    let maxX = window.innerWidth - imagen.width
    let maxY = window.innerHeight - imagen.height

    let randomX = Math.floor(Math.random() * maxX)
    let randomY= Math.floor(Math.random() * maxY)
   do{
    imagen.style.border = "solid gold 5px"
   }while(marcador.innerHTML == "10");
    return imagen.style.left = randomX + "px", imagen.style.top = randomY + "px"
   
}
