/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author euced
 */
public class Publicacion implements Serializable{
    private static final long SerialVersionUID=888L;
    private int id;
    private String mensaje;
    private UsuarioNormal autor;
    private String privacidad;
    private Date fechaPub;

    public Publicacion(int id, String mensaje, UsuarioNormal autor, String privacidad, Date fechaPub) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
        this.privacidad = privacidad;
        this.fechaPub = fechaPub;
    }

    public Publicacion() {
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public UsuarioNormal getAutor() {
        return autor;
    }

    public void setAutor(UsuarioNormal autor) {
        this.autor = autor;
    }

    public String getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(String privacidad) {
        this.privacidad = privacidad;
    }

    public Date getFechaPub() {
        return fechaPub;
    }

    public void setFechaPub(Date fechaPub) {
        this.fechaPub = fechaPub;
    }

    @Override
    public String toString() {
        return mensaje +" "+ autor;
    }
    
    
    
}
