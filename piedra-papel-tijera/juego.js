// Función que maneja el juego
function jugar(jugador) {
  const opciones = ['piedra', 'papel', 'tijera']; // Opciones disponibles
  const CPU = opciones[Math.floor(Math.random() * 3)]; // CPU elige al azar

  let resultado = ''; // Resultado del juego

  // Lógica del juego
  if (jugador === CPU) {
    resultado = `Empate. Ambos eligieron ${jugador}.`;
  } else if (
    (jugador === 'piedra' && CPU === 'tijera') ||
    (jugador === 'papel' && CPU === 'piedra') ||
    (jugador === 'tijera' && CPU === 'papel')
  ) {
    resultado = `¡Ganaste! ${jugador} vence a ${CPU}.`;
  } else {
    resultado = `Perdiste. ${CPU} vence a ${jugador}.`;
  }

  // Mostrar resultado en el navegador
  //document.getElementById('resultado') busca el elemento con id 'resultado' en el HTML.
  //.textContent = resultado; cambia el texto de ese elemento para mostrar el resultado del juego (por ejemplo, "¡Ganaste!" o "Empate...").
  document.getElementById('resultado').textContent = resultado;
}

// Función para reiniciar el juego
function reiniciarJuego() {
  document.getElementById('resultado').textContent = '';
}