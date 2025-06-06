/* Dentro de una clase  Se escriben métodos (no funciones independientes).

No se usa function porque JavaScript asume que todo lo que escribes ahí son métodos.

Es más limpio y corto.
*/
export class Orden{
    static contadorOrdenes = 0;

    constructor(){
        this.computadoras = [];
        this._idOrden = ++Orden.contadorOrdenes;
    }

    get idOrden() {
        // Getter para el ID de la orden
        // Devuelve el ID de la orden
        return this._idOrden;
      }

    agregarComputadoras(computadora){
        this.computadoras.push(computadora);
    }

    mostrarOrden() {  
        let computadorasStr = '';  
        for (let i = 0; i < this.computadoras.length; i++) {  
            computadorasStr += this.computadoras[i].toString() + '\n'; // Agregar cada computadora como una cadena  
        }  
        return `Orden ID: ${this._idOrden}\nComputadoras:\n${computadorasStr}`;  
    }  
}
