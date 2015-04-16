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
@Table(name = "docentes")
public class Docente extends Persona {

    public Docente() {
        super();
    }
}
