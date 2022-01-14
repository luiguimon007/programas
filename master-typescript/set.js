let gadgets = new Set(["movil","tablet","portatil"]);

gadgets.add("maquina de afeitar");

console.log(gadgets);

for(let item of gadgets){
    console.log(item);
}

gadgets.forEach(item => console.log(item));
gadgets.clear();

