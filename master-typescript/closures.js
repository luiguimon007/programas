const coche = (function() {
    let marca, _velocidad, _puertas;

    function setMarca(marca){
        _marca = marca;
        
        return _marca;
    }

    function getMarca(){
        return _marca;
    }

    return{
        setMarca,
        getMarca
    };

})();

coche.setMarca("Renaul");
console.log(coche.getMarca());