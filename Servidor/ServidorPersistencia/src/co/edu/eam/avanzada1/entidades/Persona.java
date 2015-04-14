/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author 416pc01
 */
@Entity
@Table(name = "personas")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(value = {
    @NamedQuery(name = Persona.CONSULTAR_USUARIOS_REGISTRADOS,
            query = "SELECT p FROM Persona p"),
    @NamedQuery(name = Persona.CONSULTAR_USUARIOS_NO_REGISTRADOS,
            query = "SELECT p FROM Persona p WHERE p.numeroDocumento LIKE ?1 AND p.password is null"),})
public class Persona implements Serializable {

    public static final String CONSULTAR_USUARIOS_REGISTRADOS = "registrados.PersonaConsulta";
    public static final String CONSULTAR_USUARIOS_NO_REGISTRADOS = "noRegistrados.PersonaConsulta";
    @Id
    @Column(name = "no_documento")
    private long numeroDocumento;
    @Column(name = "nombre", length = 15, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 15, nullable = false)
    private String apellido;
    @Column(name = "correo_elec", length = 100, nullable = true)
    private String correo;
    @Column(name = "telefono", nullable = true)
    private long telefono;
    @Column(name = "direccion", length = 30, nullable = false)
    private String direccion;
    @Column(name = "password", length = 10, nullable = true)
    private String password;
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private TipoDocumento documento;

    public Persona() {
        super();
    }

    public Persona(long numeroDocumento, String nombre, String apellido, String correo, int telefono, String direccion, String password, TipoDocumento documento) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.password = password;
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoDocumento getDocumento() {
        return documento;
    }

    public void setDocumento(TipoDocumento documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
