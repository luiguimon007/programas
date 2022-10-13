var x = 5 //este es un comentario de js
console.log(x);

var lenguaje = "Javascript";

console.log(lenguaje[1]);

var cadena = "Hola cadena";
cadena[0] = 'e'; 

function sumar(a,b){
    let suma = a+b;
    return suma;
}

console.log(sumar(4,5));
let nombre = `Luis López ${lenguaje}` ; // backtilts
console.log(nombre);

var proximoEnLaFila = (arreglo,elemento) => {
    arreglo.push(elemento);
    return arreglo.shift();
}
var miArreglo = [1,2,3,4,5];
console.log("Antes: "+ JSON.stringify(miArreglo));
console.log(proximoEnLaFila(miArreglo,6));
console.log("Despues: "+ JSON.stringify(miArreglo));

var miPerro = {
    "nombre":"Persi",
    "edad":5,
    "peso":10,
    "raza": "Beagle"
};
console.log(miPerro);
//delete miPerro.edad;
//console.log(miPerro);

function verificarPropiedad(obj,propiedad){

    if(!obj.hasOwnProperty(propiedad)){
        return "El objeto  no tiene la propiedad";
    }
    return "Propiedad " + obj[propiedad];
}

var miReceta = {
    description:"mi postre",
    costo: 15.6,
    ingredientes:{
        masa:{
            harina:"100 grs",
            sal: "1 cuchara",
            agua : "1 litro"
        },
        cobertura:{ 
            azucar:"120 grs",
            leche:"500 ml"
        }
    }
}

console.log(verificarPropiedad(miPerro,"nombre"));

