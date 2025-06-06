// SistemaVentas.js  
import { Monitor } from './Monitor.js';  
import { Raton } from './Raton.js';  
import { Teclado } from './Teclado.js';  
import { Computadora } from './Computadora.js';  
import { Orden } from './Orden.js';  

const monitor1 = new Monitor(1, 'Samsung', '24 pulgadas');  
const raton1 = new Raton('Logitech');  
const teclado1 = new Teclado('Razer');  

const computadora1 = new Computadora('Gaming PC', monitor1, teclado1, raton1);  

const orden1 = new Orden();  
orden1.agregarComputadoras(computadora1);  
console.log(orden1.mostrarOrden());
