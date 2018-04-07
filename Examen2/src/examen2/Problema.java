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
public class Problema extends Publicacion implements Serializable{
    private static final long SerialVersionUID=888L;
    private ArrayList<Respuesta> respuestas = new ArrayList();
    private String estado;
    private int categoria;

    public Problema(String estado, int categoria, int id, String mensaje, UsuarioNormal autor, String privacidad, Date fechaPub) {
        super(id, mensaje, autor, privacidad, fechaPub);
        this.estado = estado;
        this.categoria = categoria;
    }

    

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
