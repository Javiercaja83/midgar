let celdas = document.querySelectorAll('.celda');
let resultado = document.querySelector('.resultado');
let jugador = 'X';
let estadoJuego = ['', '', '', '', '', '', '', '', ''];
let posicionesGanadoras = [
    [0, 1, 2], [3, 4, 5], [6, 7, 8], // filas
    [0, 3, 6], [1, 4, 7], [2, 5, 8], // columnas
    [0, 4, 8], [2, 4, 6]            // diagonales
];

    // Función para manejar el clic en una celda
    function handleCellClick(e) {
        let cellIndex = parseInt(e.target.getAttribute('data-index'));
        
        if (gameState[cellIndex] !== '') return; // Si la celda ya está ocupada, no hacer nada

        e.target.classList.add(currentPlayer.toLowerCase());
        gameState[cellIndex] = currentPlayer;
        e.target.classList.add('clicked');

        if (checkWin(currentPlayer)) {
            resultDisplay.textContent = `¡${currentPlayer} ha ganado!`;
            disableBoard();
        } else if (!gameState.includes('')) {
            resultDisplay.textContent = '¡Empate!';
        } else {
            currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
        }
    }

    // Función para comprobar si hay un ganador
    function checkWin(player) {
        return winningConditions.some(condition => 
            condition.every(index => gameState[index] === player)
        );
    }

    // Función para deshabilitar el tablero después de que haya un ganador o empate
    function disableBoard() {
        cells.forEach(cell => {
            cell.removeEventListener('click', handleCellClick);
        });
    }

    // Añadir el evento de clic a cada celda
    cells.forEach(cell => cell.addEventListener('click', handleCellClick));
