// Raton.js  
import { DispositivoEntrada } from './DispositivoEntrada.js';  

export class Raton extends DispositivoEntrada {  
    static contadorRatones = 0;  

    constructor(marca) {  
        super('Raton', marca);  
        this._idRaton = ++Raton.contadorRatones;  
    }  

    toString() {  
        return `Raton ID: ${this._idRaton}, ${super.toString()}`;  
    }  

    
} 