import javax.swing.JOptionPane;

public class Ejercicio_17 {
    public static void main(String[] args) {
        int codigo,litros,LP1=0,LP2=0,LP3=0;
        float importefactura1,importefactura2,importefactura3,FT1=0,FT2=0,FT3=0;
        float facturaciontotal=0,conteo1mayor600=0,conteo2mayor600=0,conteo3mayor600=0,conteoTT=0;
        
        for(int i=1;i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo número "+i+"\nDigite el código"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo número "+i+"\nDigite la cantidad de litros"));
            //Para producto 1
            if(codigo==1){
              LP1+=litros;                  //Suma de litros 
              importefactura1=(float) (litros*.60);
              FT1+=importefactura1;         //Suma 
              if(importefactura1>600){      
              conteo1mayor600++;    
              }
            }
            //Para producto 2
            if(codigo==2){
              LP2+=litros;                  //Suma de litros 
              importefactura2=(float) (litros*3);
              FT2+=importefactura2;         
              if(importefactura2>600){      
              conteo2mayor600++;               
              }
            }
            //Para producto 3
            if(codigo==3){
              LP3+=litros;                  
              importefactura3=(float) (litros*1.40);
           
              FT3+=importefactura3;
              if(importefactura3>600){      
              conteo3mayor600++;    
              }
            }            
            
            facturaciontotal = FT1 + FT2 + FT3;
            
            conteoTT = conteo1mayor600 + conteo2mayor600 + conteo3mayor600;
        }   
        
            System.out.println("Resumen de ventas");
            System.out.println("Facturación total (USD): "+facturaciontotal);
            //Cantidad de litros vendidos por producto + Respectivo número de facturas
            System.out.println("Producto 1: Cantidad de litros vendidos: "+LP1+"\nFacturas mayores a 600: "+conteo1mayor600);
            System.out.println("Producto 2: Cantidad de litros vendidos: "+LP2+"\nFacturas mayores a 600: "+conteo2mayor600);
            System.out.println("Producto 3: Cantidad de litros vendidos: "+LP3+"\nFacturas mayores a 600: "+conteo3mayor600);
            System.out.println("Número total de facturas mayores a 600: "+conteoTT);
    }
}
