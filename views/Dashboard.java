// views/Dashboard.java
package views;

import javax.swing.*;
import java.awt.*;
import paneles.PanelBusqueda;
import paneles.PanelProductos;

public class Dashboard {
    public Dashboard(String listaProductos) {
        JFrame ventana = new JFrame("Gestión de Productos");
        ventana.setSize(1600, 1000);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        PanelBusqueda panelBusqueda = new PanelBusqueda();
        PanelProductos panelProductos = new PanelProductos(listaProductos);
    
        ventana.add(panelBusqueda, BorderLayout.WEST);   
        ventana.add(panelProductos, BorderLayout.CENTER); 

        ventana.setVisible(true);
    }
}