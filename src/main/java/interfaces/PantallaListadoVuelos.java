package interfaces;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import clases.Vuelo;

import java.awt.GridBagConstraints;

public class PantallaListadoVuelos extends JPanel {

	private Ventana ventana;
	
	public PantallaListadoVuelos (Ventana v) {
		this.ventana = v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(0, 0, 450, 29);
		panelCentral.add(panelTitulo);
		
		JLabel etiquetaTitulo = new JLabel("Listado de Vuelos:");
		etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelTitulo.add(etiquetaTitulo);
		
		final JComboBox<Vuelo> comboBoxVuelos = new JComboBox<Vuelo>();
		comboBoxVuelos.setBounds(139, 82, 171, 22);
		panelCentral.add(comboBoxVuelos);
		
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
		botonReservar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.vuelo = (Vuelo) comboBoxVuelos.getSelectedItem();
				JOptionPane.showMessageDialog(ventana, "Vuelo reservado","¡Disfrute su viaje!",
						 JOptionPane.YES_NO_CANCEL_OPTION);
				ventana.irASeleccionVuelo();
			}
		});
		botonReservar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panelBotones.add(botonReservar);
		


	}
}
