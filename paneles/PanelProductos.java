// paneles/PanelProductos.java
package paneles;

import javax.swing.*;
import java.awt.*;
import modules.Modulos;

public class PanelProductos extends JPanel {
    public PanelProductos() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(1300, 1000));

        JLabel titulo = new JLabel("Producto");
        Modulos modulos = new Modulos();

        add(titulo, BorderLayout.NORTH);
        add(modulos);
    }
}