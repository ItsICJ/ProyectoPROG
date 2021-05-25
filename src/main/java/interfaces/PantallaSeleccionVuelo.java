package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class PantallaSeleccionVuelo extends JPanel {
	
	private Ventana ventana;
	private JTextField textFieldAerolinea;
	private JTextField textFieldFecha;
	private JTextField textFieldOrigen;
	private JTextField textFieldDestino;


	public PantallaSeleccionVuelo(Ventana v) {
		ventana = v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		
		// Botones
		
		JButton botonAtras = new JButton("Atrás");
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irALogin();
			}
		});
		botonAtras.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonAtras);
		
		JButton botonSeleccion = new JButton("Seleccionar");
		botonSeleccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonSeleccion);
		
		// Etiquetas
		
		JLabel eiquetaTitulo = new JLabel("Selección de vuelo");
		eiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		eiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(eiquetaTitulo, BorderLayout.NORTH);
		panel_1.setLayout(null);
		
		JLabel etiquetaAerolinea = new JLabel("Aerolínea:");
		etiquetaAerolinea.setBounds(139, 59, 76, 21);
		etiquetaAerolinea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(etiquetaAerolinea);
		
		textFieldAerolinea = new JTextField();
		textFieldAerolinea.setBounds(225, 59, 149, 20);
		panel_1.add(textFieldAerolinea);
		textFieldAerolinea.setColumns(10);
		
		JLabel etiquetaOrigen = new JLabel("Ciudad de origen:");
		etiquetaOrigen.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiquetaOrigen.setBounds(76, 91, 139, 14);
		panel_1.add(etiquetaOrigen);
		
		textFieldOrigen = new JTextField();
		textFieldOrigen.setBounds(225, 91, 149, 20);
		panel_1.add(textFieldOrigen);
		textFieldOrigen.setColumns(10);
		
		JLabel etiquetaDestino = new JLabel("Ciudad de destino:");
		etiquetaDestino.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiquetaDestino.setBounds(76, 127, 139, 14);
		panel_1.add(etiquetaDestino);
		
		// Campos
		
		textFieldDestino = new JTextField();
		textFieldDestino.setBounds(225, 127, 149, 20);
		panel_1.add(textFieldDestino);
		textFieldDestino.setColumns(10);
		
		JLabel etiquetaFecha = new JLabel("Fecha:");
		etiquetaFecha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiquetaFecha.setBounds(165, 163, 50, 14);
		panel_1.add(etiquetaFecha);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setBounds(225, 163, 149, 20);
		panel_1.add(textFieldFecha);
		textFieldFecha.setColumns(10);

	}

}
