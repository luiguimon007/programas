let personas = ["victor","paco","pepe","juan"];

let busqueda = personas.find(persona =>{
    return persona === "pepe";
})

let indice = personas.findIndex(persona => persona ==="juan")


let array_letras = Array.from("victorrobles");

let nuevas_personas = personas.filter(persona => persona.includes("a"));
console.log(indice);