package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.Font;

public class PantallaPrincipal extends JPanel {
	private Ventana ventana;
	private final JButton botonSalir = new JButton("Salir");
	/**
	 * Create the panel.
	 */
	public PantallaPrincipal(Ventana v) {
		ventana = v;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		botonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		botonSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonSalir);
		
		JButton botonLogin = new JButton("Iniciar Sesión");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irALogin();
			}
		});
		botonLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonLogin);
		
		JButton botonRegistro = new JButton("Registrarse");
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irARegistro();
			}
		});
		botonRegistro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(botonRegistro);
		

	}

}
