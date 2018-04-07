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
public class Comentario extends Publicacion implements Serializable{
    private static final long SerialVersionUID=888L;
    private String comentario;

    public Comentario(String comentario, int id, String mensaje, UsuarioNormal autor, String privacidad, Date fechaPub) {
        super(id, mensaje, autor, privacidad, fechaPub);
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
