class Empleado{
    constructor(nombre, salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    

    obtenerDetalles(){
        return `Empleado: Nombre: ${this.nombre}, Salario: ${this.salario}`;
    }

}

class Gerente extends Empleado{
    constructor(nombre, salario, departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    obtenerDetalles(){
        return `Gerente: ${super.obtenerDetalles()}, Departamento: ${this.departamento}`;
    }
}
// polimorfismo: usar la misma interfaz para objetos de diferentes tipos.
function imprimir(tipo){
    console.log(tipo.obtenerDetalles());
    if(tipo instanceof Empleado){
        console.log('Es un objeto de tipo Empleado');

    }else if(tipo instanceof Gerente){
        console.log('Es un objeto de tipo Gerente');
    }
    else if (tipo instanceof Object){
        console.log('Es un objeto de tipo Object');
    }

}

// sobreescritura de metodos

let empleado1 = new Empleado('Juan', 3000,);
console.log(empleado1); // Empleado: Nombre: Juan, Salario: 3000
let gerente1 = new Gerente('Carlos', 5000, 'Sistemas');
console.log(gerente1); // Gerente: Empleado: Nombre: Carlos, Salario: 5000, Departamento: Sistemas

imprimir(empleado1); // Empleado: Nombre: Juan, Salario: 3000
imprimir(gerente1); // Gerente: Empleado: Nombre: Carlos, Salario: 5000, Departamento: Sistemas 