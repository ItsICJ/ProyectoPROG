package interfaces;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class PantallaPrincipal extends JPanel {
	
	private Ventana ventana;
	private final JButton botonSalir = new JButton("Salir");

	/**
	 * 
	 * @param v
	 */
	public PantallaPrincipal(Ventana v) {
		ventana = v;
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.DARK_GRAY);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setBackground(Color.DARK_GRAY);
		
		// Botones
		
		botonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		botonSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonSalir);
		botonSalir.setBackground(Color.red);
		
		JButton botonLogin = new JButton("Iniciar Sesión");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irALogin();
			}
		});
		botonLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonLogin);
		botonLogin.setBackground(Color.cyan);
		
		JButton botonRegistro = new JButton("Registrarse");
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irARegistro();
			}
		});
		botonRegistro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonRegistro);
		botonRegistro.setBackground(Color.yellow);
		
		
	}

	private void setContentPane(JLabel jLabel) {
		// TODO Auto-generated method stub
		
	}

}
