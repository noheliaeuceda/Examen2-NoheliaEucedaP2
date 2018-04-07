/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author euced
 */
public class Respuesta extends Publicacion implements Serializable{
    private static final long SerialVersionUID=888L;
    private ArrayList<Integer> calificaciones = new ArrayList();
    private double calificacioGnrl;
    private ArrayList<Comentario> listaComments = new ArrayList();

    public Respuesta(double calificacioGnrl, int id, String mensaje, UsuarioNormal autor, String privacidad, Date fechaPub) {
        super(id, mensaje, autor, privacidad, fechaPub);
        this.calificacioGnrl = calificacioGnrl;
    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getCalificacioGnrl() {
        return calificacioGnrl;
    }

    public void setCalificacioGnrl(double calificacioGnrl) {
        this.calificacioGnrl = calificacioGnrl;
    }

    public ArrayList<Comentario> getListaComments() {
        return listaComments;
    }

    public void setListaComments(ArrayList<Comentario> listaComments) {
        this.listaComments = listaComments;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
