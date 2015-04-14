/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.entidades;

import javax.persistence.*;

/**
 *
 * @author 416pc01
 */
@Entity
@Table(name="estudiantes")
public class Estudiante extends Persona{
    
    @Column(name="codigo",nullable=false)
    private int codigo;

    public Estudiante() {
        super();
    }

    public Estudiante(int codigo, long numeroDocumento, String nombre, String apellido, String correo, int telefono, String direccion, String password, TipoDocumento documento) {
        super(numeroDocumento, nombre, apellido, correo, telefono, direccion, password, documento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }   
}
