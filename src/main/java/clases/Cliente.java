/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Ivan
 */
public class Cliente extends EntidadConNombre {
    
    private String alias;
    private String contraseña;
    private String apellido1;
    private String apellido2;
    private String email;
    private String direccion;
    private String dni;

    public Cliente(String alias, String contraseña, String apellido1, String apellido2, String email, String direccion, String dni, String nombre) {
        super(nombre);
        this.alias = alias;
        this.contraseña = contraseña;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.direccion = direccion;
        this.dni = dni;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "alias=" + alias + ", contrase\u00f1a=" + contraseña + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", direccion=" + direccion + ", dni=" + dni + '}';
    }
    
    
}
