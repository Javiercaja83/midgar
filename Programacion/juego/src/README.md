#Tablero de juego
Vamos a escribir un juego en el que nos mostrará un tablero de 5 x 5 posiciones

Avatares disponibles: (?, *, ¿, +, %)

En el tablero habrá 4 personajes, siendo Personaje una clase que debes crear con los siguientes requisitos:

Tendrá un avatar (que en realidad es un carácter).

Tendrá un atributo fuerza, que al crear el Personaje es 0.

Tendrá un método mover, que se invocará al mover el personaje por el tablero, lo que hace es incrementar la fuerza en uno.

Tendrá un método cambiarAvatar, que solo permitirá cambiar el avatar si la fuerza es >3, porque el cambio de avatar implica perder 3 puntos de fuerza

En el tablero,habrá además del personaje con el que jugamos, 3 personajes más que se crearán de forma aleatoria (avatar, posición y fuerza).

Los valores aleatorios de fuerza pueden variar entre 1 y 5. Se permiten repetir valores de avatar y fuerza, pero no de posición.

Una vez comenzado el juego, el objetivo es "comernos" al resto de personajes, nuestro jugador, siempre va a comenzar en la posición 0,0. Y podremos moverlo una posición a la derecha o hacia abajo.

Si llegamos a la posicón 4,4 , es decir, nos salimos del tablero, el juego habrá finalizado.

Al comer al resto de personajes, el juego finaliza.

En el tablero, cuando le pedimos mover un personaje, lo cambiará a la posición solicitada (derecha o abajo). Invocando al método mover. Si el posible el movimiento porque la casilla destino está vacía, incrementa la fuerza en 1.

Si la posición en la que se va a poner el Personaje está ocupada:

si el avatar es el mismo, automáticamente gana nuestro personaje y se come al otro
si no es el mismo avatar, nuestro personaje debe tener la misma o más fuerza para poder ganar. Si en el intento el otro personaje tiene más fuerza, el juego habrá acabado.
Si el personaje es capaz de comerse al otro, además del incremento de la fuerza por el movimiento, se incrementará con la fuerza que tenga el otro personaje.