package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import clases.Cliente;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PantallaLogin extends JPanel {
	
	private JTextField textFieldUsuario;
	private JPasswordField passwordField;
	private Ventana ventana;


	public PantallaLogin(Ventana v) {
		ventana = v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// Etiquetas
		
		JLabel etiquetaTitulo = new JLabel("Iniciar Sesión");
		etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(etiquetaTitulo, BorderLayout.NORTH);
		
		JLabel etiquetaUsuario = new JLabel("Nombre de usuario:");
		etiquetaUsuario.setBounds(155, 60, 129, 19);
		etiquetaUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(etiquetaUsuario);
		
		JLabel etiquetaContraseña = new JLabel("Contraseña:");
		etiquetaContraseña.setBounds(180, 139, 79, 19);
		etiquetaContraseña.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(etiquetaContraseña);
		
		// Campos
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 163, 200, 20);
		panel.add(passwordField);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(120, 84, 200, 20);
		panel.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		// Botones
		
		JButton botonSalir = new JButton("Atrás");
		botonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantallaPrincipal();
			}
		});
		botonSalir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelBotones.add(botonSalir);
		
		JButton botonIniciar = new JButton("Entrar");
		botonIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if (textFieldUsuario.getText().isBlank()||passwordField.getPassword().toString().isBlank()) {
					 JOptionPane.showMessageDialog(ventana, "Todos los campos deben estar llenos","No se pudo iniciar sesión",
							 JOptionPane.ERROR_MESSAGE);
				 } else {//Se puede iniciar sesión
					 try {
						 
						 
						 Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoprog",
								 "root","ithinkaboutyou");
						 Statement smt = conexion.createStatement();
						 smt.execute("select nombre,apellido1 from Cliente where usuario = '"+textFieldUsuario.getText()+"'"
						 		+ " and contraseña = '"+passwordField.getPassword().toString()+"'");
						 
						 JOptionPane.showMessageDialog(ventana, "Inicio de sesión realizado","¡Hola de nuevo!",
								 JOptionPane.OK_OPTION);
						 
						 ventana.irASeleccionVuelo();
						 smt.close();
						 conexion.close();
						 
					 } catch (SQLException e1) {
						 JOptionPane.showMessageDialog(ventana, e1.getMessage(),"No se pudo iniciar sesión",JOptionPane.ERROR_MESSAGE);
					 }
				 }
			}
		});
		botonIniciar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelBotones.add(botonIniciar);

		

		
		

		

		

		
	}

}
