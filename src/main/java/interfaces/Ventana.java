package interfaces;

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
		this.setContentPane(this.principal);
		this.setTitle("Sistema de Reserva de Vuelos");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
