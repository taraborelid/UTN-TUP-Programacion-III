export class Monitor {  
    static contadorMonitores = 0;  

    constructor(marca, tamano) {  
        this._idMonitor = Monitor.contadorMonitores++; 
        this._marca = marca;  
        this._tamano = tamano;  
        
    }  

    toString() {  
        return `Monitor ID: ${this._idMonitor.toString}, Marca: ${this._marca}, Tamaño: ${this._tamano}`;  
    }  

    // Getters y Setters  
    get idMonitor() {  
        return this._idMonitor;  
    }  

    set idMonitor(value) {  
        this._idMonitor = value;  
    }  

    get marca() {  
        return this._marca;  
    }  

    set marca(value) {  
        this._marca = value;  
    }  

    get tamano() {  
        return this._tamano;  
    }  

    set tamano(value) {  
        this._tamano = value;  
    }  
}  


