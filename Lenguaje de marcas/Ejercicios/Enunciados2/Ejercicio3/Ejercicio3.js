let texto = document.getElementById('textoNota').value;
let colorFuente = document.getElementById('colorFuente').value;
let colorFondo = document.getElementById('colorFondo').value;
let notasContainer = document.getElementById('notasContainer');

function agregarNota() {

    if (texto) {
        let nuevaNota = document.createElement('div');
        nuevaNota.className = 'nota';
        nuevaNota.style.color = colorFuente;
        nuevaNota.style.backgroundColor = colorFondo;
        nuevaNota.innerHTML = `<p>${texto}</p><button onclick="eliminarNota(this)">Eliminar</button>`;
        notasContainer.appendChild(nuevaNota);
        // Limpiar el campo de texto después de agregar la nota
        document.getElementById('textoNota').value = '';
    } else {
        alert('Por favor, introduce un texto para la nota.');
    }
}

function eliminarNota(button) {
    let nota = button.parentElement;
    nota.remove();
}