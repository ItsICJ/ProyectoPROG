package interfaces;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class Ventana extends JFrame {

	private PantallaLogin login;
	private PantallaRegistro registro;
	private PantallaSeleccionVuelo seleccionVuelo;
	private PantallaPrincipal principal;
	/**
	 * Create the frame.
	 */
	public Ventana() {
		this.principal = new PantallaPrincipal(this);
		this.setSize(450,400);
		this.setLocation(600,300);
		try {
			Image img = ImageIO.read(new File("rose.png"));
			this.setIconImage(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setContentPane(this.principal);
		this.setTitle("Sistema de Reserva de Vuelos");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void irASeleccionVuelo() {
		if (this.seleccionVuelo == null) {
			this.seleccionVuelo = new PantallaSeleccionVuelo(this);
		}
		if (login != null) {this.registro.setVisible(false);}
		if (login != null) {this.login.setVisible(false);}
		this.setContentPane(seleccionVuelo);
		this.seleccionVuelo.setVisible(true);
	}
	public void irARegistro() {
		if (this.registro == null) {
			this.registro = new PantallaRegistro(this);
		}
		this.principal.setVisible(false);
		this.setContentPane(registro);
		this.registro.setVisible(true);
	}
	public void irALogin() {
		if (this.login == null) {
			this.login = new PantallaLogin(this);
		}
		this.principal.setVisible(false);
		this.setContentPane(login);
		this.login.setVisible(true);
		this.login = null;
	}
	public void irAPantallaPrincipal( ) {
		if(this.principal == null) {
			this.principal = new PantallaPrincipal(this);
		}
		if (login != null) {this.login.setVisible(false);}
		if (login != null) {this.registro.setVisible(false);}
		this.setContentPane(principal);
		this.principal.setVisible(true);
	}

}
