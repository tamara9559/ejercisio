import javax.swing.*;

public class carrito {
    public static void main(String[] args) {
        int desicion = 0;
        int gDesicion = 0;
        int pDesicion = 0;
        int hDesicion = 0;
        int precio = 0;
        int gprecio = 0;
        int pprecio = 0;
        int hprecio = 0;

        productos gaseosa = new productos();
        gaseosa.nombre = "coca cola";
        gaseosa.precio = 3000;
        gaseosa.cantidad = 10;

        productos papas = new productos();
        papas.nombre = "margarita";
        papas.precio = 1500;
        papas.cantidad = 5;

        productos helado = new productos();
        helado.nombre = "polet";
        helado.precio = 2000;
        helado.cantidad = 4;

        JOptionPane.showMessageDialog(null, "bienvenido al carrito de compras");
        desicion = Integer.parseInt(JOptionPane.showInputDialog("desea agregar algo al carrito?   1.si  2.no"));
        if (desicion == 1) {
            gDesicion = Integer.parseInt(JOptionPane.showInputDialog("desea agregar gaseosa? hay " +gaseosa.cantidad+ " de gaseosas disponibles   1.si  2.no"));
            if(gDesicion == 1){
                gDesicion = Integer.parseInt(JOptionPane.showInputDialog("cuantas gaseosas? "));
                if( gDesicion <= gaseosa.cantidad){
                    JOptionPane.showMessageDialog(null,"a agrgado "+gDesicion+" gaseosas al carrito");
                }else{
                    JOptionPane.showMessageDialog(null,"cantidad que ingreso no es valida");
                }
            }else{JOptionPane.showMessageDialog(null,"no se ingresan gaseosa");}

            pDesicion = Integer.parseInt(JOptionPane.showInputDialog("desea agregar papas? hay " +papas.cantidad+ " papas disponibles   1.si  2.no"));
            if(pDesicion == 1){
                pDesicion = Integer.parseInt(JOptionPane.showInputDialog("cuantas papas? "));
                if( pDesicion <= papas.cantidad){
                    JOptionPane.showMessageDialog(null,"a agrgado "+pDesicion+" papas al carrito");
                }else{
                    JOptionPane.showMessageDialog(null,"cantidad que ingreso no es valida");
                }
            }else{JOptionPane.showMessageDialog(null,"no se ingresan papas");}

            hDesicion = Integer.parseInt(JOptionPane.showInputDialog("desea agregar helados? hay " +helado.cantidad+ " de helados disponibles   1.si  2.no"));
            if(hDesicion == 1){
                hDesicion = Integer.parseInt(JOptionPane.showInputDialog("cuantos helados? "));
                if( hDesicion <= helado.cantidad){
                    JOptionPane.showMessageDialog(null,"a agrgado "+hDesicion+" helados al carrito");
                }else{
                    JOptionPane.showMessageDialog(null,"cantidad que ingreso no es valida");
                }
            }else{JOptionPane.showMessageDialog(null,"no se ingresa helados");}

            JOptionPane.showMessageDialog(null,"el precio de todo sera");
            gprecio = gDesicion * gaseosa.precio;
            JOptionPane.showMessageDialog(null,+gprecio+"$ de el total de gaseosas");

            pprecio = pDesicion * papas.precio;
            JOptionPane.showMessageDialog(null,+pprecio+"$ de el total de papas");

            hprecio = hDesicion * helado.precio;
            JOptionPane.showMessageDialog(null,+gprecio+"$ de el total de helados");

            precio = gprecio + pprecio + hprecio;

            JOptionPane.showMessageDialog(null,"el total a pagar por todo sera "+precio+"$");

        } else {
            JOptionPane.showMessageDialog(null,"que vuelva pronto");
        }
    }
}

