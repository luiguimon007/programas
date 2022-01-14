class Coche{
    #npuertas = 4; //private
    
    constructor(){
        this.modelo= "Mercedes";
        this.color= "Negro";
        this.velocidad=0;
        this.year =2020;
    }

    subirVelocidad(){
        this.velocidad+=20;
    }
    static saludar(nombre){
        return "Hola"+nombre;
    }
    get numeroPuertas(){
        return this.npuertas;
    }
}

class Quad extends Coche{
    constructor(){
        super();
    }
}

let mi_coche = new Coche();
console.log(mi_coche.color);