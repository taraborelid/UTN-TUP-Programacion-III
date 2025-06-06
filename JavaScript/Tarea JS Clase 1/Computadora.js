export class Computadora{
    static contadorComputadora = 0;

    constructor(nombre, monitor, teclado, raton){
        this._idComputadora = ++Computadora.contadorComputadora;
        this._nombre = nombre;
        this._monitor = monitor;
        this._teclado = teclado;
        this._raton = raton;
    }

    toString() {  
        return `Computadora ID: ${this._idComputadora}, Nombre: ${this._nombre}, ${this._monitor.toString()}, ${this._teclado.toString()}, ${this._raton.toString()}`;  
    }  

    get idComputadora() {
        return this._idComputadora;
      }

}

