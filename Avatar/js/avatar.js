/*
Una forma de hacer la funcion
function seleccionarPersonajeJugador(){
    // Obtiene el input seleccionado
    //input selecciona elementos con etiqueta input
    //name selecciona elementos con atributo name="personaje"
    //checked selecciona el input que está marcado, el que el usuario eligio
    //querySelector selecciona el primer elemento que coincide con el selector CSS
    //en este caso selecciona el primer input que tiene el atributo name="personaje" y que está marcado
    const seleccion = document.querySelector('input[name="personaje"]:checked');

    if (seleccion) {
        // Usa el id del input para encontrar su label
        //querySelector es un método que permite seleccionar elementos del DOM(Document Object Model)
        //en este caso selecciona el primer elemento label que tiene el atributo for igual al id del input seleccionado(en este caso personaje)
        const label = document.querySelector(`label[for="${seleccion.id}"]`);
        //label.textContent obtiene el texto del label asociado al input seleccionado
        alert("Has seleccionado el personaje: " + label.textContent);
    
}
*/

//En JavaScript, cuando trabajás con el DOM (Document Object Model), 
// los elementos HTML se representan como objetos, y esos objetos tienen:
//Propiedades: como innerHTML, id, value, className, etc.
//Métodos: como getElementById(), appendChild(), addEventListener(), etc.

function seleccionarPersonajeJugador(){
    let inputZuko = document.getElementById('zuko')
    let inputKatara = document.getElementById('katara')
    let inputAang = document.getElementById('aang')
    let inputToph = document.getElementById('toph')
    spanPersonajeJugador = document.getElementById('personaje-jugador')

    if(inputZuko.checked){
        alert('Seleccionaste a Zuko')
        // innerHTML es una propiedad es una propiedad del objeto HTMLElement
        // reemplaza todo el contenido interno si le asignas un nuevo valor
        spanPersonajeJugador.innerHTML = 'Zuko'
    }
    else if(inputAang.checked){
        alert('Seleccionaste a Aang')
         spanPersonajeJugador.innerHTML = 'Aang'
    }
    else if(inputKatara.checked){
        alert('Seleccionaste a Katara')
         spanPersonajeJugador.innerHTML = 'Katara'
    }
    else if(inputToph.checked){
        alert('Seleccionaste a Toph')
         spanPersonajeJugador.innerHTML = 'Toph'
    }
    else{
        alert('Selecciona un personaje')
    }
}


function iniciarJuego(){
    let botonPersonajeJugador= document.getElementById("boton-personaje");
    botonPersonajeJugador.addEventListener("click", seleccionarPersonajeJugador)
}


//window es el objeto global en el navegador que representa la ventana del navegador
//Contiene informacion del DOM metodos para manipular la ventana y eventos como load, scroll, etc
//Si tratas de acceder a elementos del DOM (como con document.getElementById) antes de que el HTML
// haya cargado, puedes obtener errores como null porque esos elementos aún no existen.
// Entonces, usar window.addEventListener('load', ...) te asegura que el DOM ya está listo y todos 
// los elementos están disponibles para que los manipules.
window.addEventListener('load', iniciarJuego)
