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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PantallaListadoVuelos extends JPanel {

	private Ventana ventana;
	private JTable table;
	
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
		
		table = new JTable();
		//select count(*) nv from vuelo where .....
		Object [][] vuelos=new Object[nv][4];
		//select * from vuelo where...
		for(int i=0;i<nv;i++) {
			//Sacar del resultset los datos del vuelo, y meter el de cada uno de ellos en una de las filas de vuelos.
		}
		table.setModel(new DefaultTableModel(
			vuelos,
			new String[] {
				"Aerolínea", "Ciudad Origen", "Ciudad Destino", "Salida"
			}
		));
		table.setBounds(39, 40, 367, 210);
		panelCentral.add(table);
		
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
