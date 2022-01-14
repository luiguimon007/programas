
const personas = people.filter(p=>p.age >=18)
const respuesta = personas.reduce((accumulate,current)=>{
    const datos = Object.entries(current)[1][1];
    if(!accumulate[datos]){
        accumulate[datos] = [];
    }
    accumulate[datos].push(current.name);
    return accumulate;
},{})