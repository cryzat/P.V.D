/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author Cristian Camilo Zapata<yingyangzt99@gmail.com>
 */
@Entity
@Table(name = "directores")
public class Director extends Persona {

    public Director() {
        super();
    }

    public Director(long numeroDocumento, String nombre, String apellido, String correo, int telefono, String direccion, String password, TipoDocumento documento) {
        super(numeroDocumento, nombre, apellido, correo, telefono, direccion, password, documento);
    }
}