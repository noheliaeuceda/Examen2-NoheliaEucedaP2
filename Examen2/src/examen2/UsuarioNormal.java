/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author euced
 */
public class UsuarioNormal extends Usuario implements Serializable{
    private static final long SerialVersionUID=888L;
    ArrayList<Publicacion> listaPublicaciones = new ArrayList();
    ArrayList<UsuarioNormal> listaAmigos = new ArrayList();
    ArrayList<UsuarioNormal> listaSolicitudes = new ArrayList();

    public UsuarioNormal() {
    }

    public UsuarioNormal(String nombre, String email, Date fechaNacimiento, String usuario, String password, Icon fotografia) {
        super(nombre, email, fechaNacimiento, usuario, password, fotografia);
    }
    

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public ArrayList<UsuarioNormal> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(ArrayList<UsuarioNormal> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }
    
    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public ArrayList<UsuarioNormal> getListaAmigos() {
        return listaAmigos;
    }

    public void setListaAmigos(ArrayList<UsuarioNormal> listaAmigos) {
        this.listaAmigos = listaAmigos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
