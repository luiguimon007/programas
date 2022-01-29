import javax.swing.JOptionPane;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int cod_art, n_fact, fm600 = 0;
        float cant_lt, precio_lt, cant_lt1 = 0, fact_i, fact_total = 0f;
        JOptionPane.showMessageDialog(null, "Este programa gestiona facturas ingresadas");
        n_fact = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de facturas:"));
        for (int i = 1; i <= n_fact; i++) {
            cod_art = Integer.parseInt(JOptionPane.showInputDialog("Factura N° " + i + "\nCódigo de Artículo:"));
            cant_lt = Float.parseFloat(JOptionPane.showInputDialog("Factura N° " + i + "\nCantidad de litros vendidos:"));
            precio_lt = Float.parseFloat(JOptionPane.showInputDialog("Factura N° " + i + "\nPrecio por litro:"));
            //1.
            fact_i = cant_lt * precio_lt;
            fact_total += fact_i;
            //2.
            if (cod_art == 1) {
                cant_lt1 += cant_lt;
            }
            //3.
            if (fact_i > 600) {
                fm600++;
            }
        }
        JOptionPane.showMessageDialog(null, "Balance general");
        JOptionPane.showMessageDialog(null, "Facturación total: \n$ " + fact_total);
        JOptionPane.showMessageDialog(null, "Cantidad de Litros vendidos del artículo 1: \n" + cant_lt1+" litros");
        JOptionPane.showMessageDialog(null, "Facturas mayores a US$ 600.00: \n" + fm600);
    }
}
