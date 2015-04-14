/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 416pc01
 */
@Entity
@Table(name = "tipos_documento")
public class TipoDocumento implements Serializable {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "descripcion", length = 15, nullable = false)
    private String descripcion;

    public TipoDocumento() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
