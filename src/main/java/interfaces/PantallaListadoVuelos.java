package interfaces;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;

public class PantallaListadoVuelos extends JPanel {

	private Ventana ventana;
	
	public PantallaListadoVuelos (Ventana v) {
		this.ventana = v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.SOUTH);
		
		JButton botonAtras = new JButton("Atrás");
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irASeleccionVuelo();
			}
		});
		botonAtras.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panelBotones.add(botonAtras);
		
		JButton botonReservar = new JButton("Reservar");
		botonReservar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panelBotones.add(botonReservar);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		GridBagLayout gbl_panelCentral = new GridBagLayout();
		gbl_panelCentral.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCentral.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelCentral.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCentral.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCentral.setLayout(gbl_panelCentral);
		JLabel titulo = new JLabel("Listado de Vuelos");
	}
}
