let mayor = 0
function encontrarMayor(){
    let arr = [10, 9, 7, 2, 3]; 
    mayor = arr[0]
    for(let i = 0; i < arr.length; i++){
        if(arr[i] > mayor){
            mayor = arr[i];
        }
    }
    return mayor 
}
document.write(mayor)
