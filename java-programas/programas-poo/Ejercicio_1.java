import javax.swing.JOptionPane;

class Ejercicio_1{
    
    public static void main(String[] args) {
        char proximoMov = '0';
        //Crear objeto con cordenadas iniciales x=0, y=0
        Posicion objeto = new Posicion(0,0);
        System.out.println("POSICION INICIAL: ("+objeto.getEjeX()+","+objeto.getEjeY()+")");
        while(proximoMov != 'E'){
            //Identificar el proximo movimiento
            do {                
                proximoMov = Character.toUpperCase(JOptionPane.showInputDialog("Ingrese el siguiente movimiento"+"\n"+"W-Adelante\n"+"S-Atras\n"+"A-Izquierda\n"+"D-Derecha\n"+"E-Salir\n ").charAt(0));
            } while ((proximoMov !='W')&&(proximoMov !='A')&&(proximoMov !='S')&&(proximoMov !='D')&&(proximoMov !='E'));
            //Realizar el movimiento
            switch(proximoMov){
                case 'W': 
                    objeto.moverArriba();
                    break;
                case 'S':
                    objeto.moverAbajo();
                    break;
                case 'A':
                    objeto.moverIzquierda();
                    break;
                case 'D': 
                    objeto.moverDerecha();
                    break;
                case 'E':
                    System.out.println("Gracias por jugar!");
                    break;
                default: 
                    System.out.println("Movimiento no reconocido");
                    break;
            }
        }
    }

    static class Posicion{
        private int ejeX;
        private int ejeY;
        //Metodos
        //Constructor
        public Posicion(int ejeX, int ejeY){
            this.ejeX = ejeX;
            this.ejeY = ejeY;
        }
        //Mover hacia arriba
        public void moverArriba(){
            ejeY += 1;
            System.out.println("DIRECCION HACIA ADELANTE");
            System.out.println("POSICION: ("+ejeX+","+ejeY+")");
        }
        //Mover hacia abajo
        public void moverAbajo(){
            ejeY -= 1;
            System.out.println("DIRECCION HACIA ABAJO");
            System.out.println("POSICION: ("+ejeX+","+ejeY+")");
        }
        //Mover hacia derecha
        public void moverDerecha(){
            ejeX += 1;
            System.out.println("DIRECCION HACIA DERECHA");
            System.out.println("POSICION: ("+ejeX+","+ejeY+")");
        }
        //Mover hacia arriba
        public void moverIzquierda(){
            ejeX -= 1;
            System.out.println("DIRECCION HACIA IZQUIERDA");
            System.out.println("POSICION: ("+ejeX+","+ejeY+")");
        }
        //Getter posicion X
        public int getEjeX(){
            return ejeX;
        }
        //Getter posicion Y
        public int getEjeY(){
            return ejeY;
        }
    }

}