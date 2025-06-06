//Esto sirve para leer lo que el usuario escribe por consola.
// Node.js, require("readline") se utiliza para importar el módulo 
// readline, que permite leer entradas desde la consola. Esto es 
// necesario porque, a diferencia de navegadores (que tienen prompt()), 
// Node.js no tiene funciones de entrada por defecto.
const readline = require("readline");

// Crear una interfaz para leer la entrada del usuario
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// Función para calcular el número mínimo de movimientos (2^n - 1)
// Si tienes 1 disco minimo 1 movimiento
// si tienes 2 discos minimo 3 movimientos
// si tienes 3 discos minimo 7
const calcularMovimientos = (n) => {
  return Math.pow(2, n) - 1;
};

// Función recursiva para resolver las Torres de Hanoi
const torresHanoi = (n, origen, destino, auxiliar) => {
  // Solo si hay un disco, lo moveremos directamente
  if (n === 1) {
    console.log(`Mover disco 1 de ${origen} a ${destino}`);
    return;
  }

  //  Mueve los n-1 discos superiores del origen al auxiliar
  torresHanoi(n - 1, origen, auxiliar, destino);

  //  Mueve el disco más grande del origen al destino
  console.log(`Mover disco ${n} de ${origen} a ${destino}`);

  //  Mueve los n-1 discos del auxiliar al destino
  torresHanoi(n - 1, auxiliar, destino, origen);
};

// Función para iniciar el algoritmo
const resolverHanoi = (numDiscos) => {
  console.log(`Resolviendo Torres de Hanoi con ${numDiscos} discos:`);
  console.log("=".repeat(40));
  torresHanoi(numDiscos, "A", "C", "B");
  console.log("=".repeat(40));
  console.log("Problema resuelto!");
  console.log(
    "🔗 Se Puede testear esta solución en: https://www.mathsisfun.com/games/towerofhanoi.html"
  );
  console.log(
    `\nNúmero mínimo de movimientos para ${numDiscos} discos: ${calcularMovimientos(
      numDiscos
    )}`
  );

  // Cerramos la interfaz después de resolver el problema
  rl.close();
};

// Solicitamos un entrada al usuario
rl.question(
  "¿Cuántos discos deseas usar para las Torres de Hanoi? ",
  (respuesta) => {
    const numDiscos = parseInt(respuesta);
    

    // Validamos la entrada
    if (isNaN(numDiscos) || numDiscos <= 0) {
      console.log("Por favor, ingresa un número válido mayor a 0");
      rl.close();
      return;
    }

    // Advertencia por si ingresan números grandes
    if (numDiscos > 10) {
      console.log(
        `Advertencia: ${numDiscos} discos requerirán ${calcularMovimientos(
          numDiscos
        )} movimientos. Esto puede tomar mucho tiempo.`
      );
    }

    resolverHanoi(numDiscos);
  }
);

