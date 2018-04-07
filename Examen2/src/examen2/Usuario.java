/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author euced
 */
public class Usuario implements Serializable{
    private static final long SerialVersionUID=888L;
    private String nombre;
    private String email;
    private Date fechaNacimiento;
    private String usuario;
    private String password;
    private Icon fotografia;

    public Usuario(String nombre, String email, Date fechaNacimiento, String usuario, String password, Icon fotografia) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.password = password;
        this.fotografia = fotografia;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografia) {
        this.fotografia = fotografia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
