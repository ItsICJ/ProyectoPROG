package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class PantallaSeleccionVuelo extends JPanel {
	private Ventana ventana;

	/**
	 * Create the panel.
	 */
	public PantallaSeleccionVuelo(Ventana v) {
		ventana = v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton botonAtras = new JButton("Atrás");
		botonAtras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(botonAtras);
		
		JButton botonSeleccion = new JButton("Seleccionar");
		botonSeleccion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(botonSeleccion);
		
		JLabel eiquetaTitulo = new JLabel("New label");
		add(eiquetaTitulo, BorderLayout.NORTH);

	}

}
