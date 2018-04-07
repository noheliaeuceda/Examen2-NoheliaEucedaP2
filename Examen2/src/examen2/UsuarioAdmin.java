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
public class UsuarioAdmin extends Usuario implements Serializable{
    private static final long SerialVersionUID=888L;
    ArrayList<Publicacion> listaPublicacionesB = new ArrayList();
    ArrayList<UsuarioNormal> listaBloqueados = new ArrayList();

    public UsuarioAdmin() {
    }

    public UsuarioAdmin(String nombre, String email, Date fechaNacimiento, String usuario, String password, Icon fotografia) {
        super(nombre, email, fechaNacimiento, usuario, password, fotografia);
    }
    

    public ArrayList<Publicacion> getListaPublicacionesB() {
        return listaPublicacionesB;
    }

    public void setListaPublicacionesB(ArrayList<Publicacion> listaPublicacionesB) {
        this.listaPublicacionesB = listaPublicacionesB;
    }

    public ArrayList<UsuarioNormal> getListaBloqueados() {
        return listaBloqueados;
    }

    public void setListaBloqueados(ArrayList<UsuarioNormal> listaBloqueados) {
        this.listaBloqueados = listaBloqueados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
