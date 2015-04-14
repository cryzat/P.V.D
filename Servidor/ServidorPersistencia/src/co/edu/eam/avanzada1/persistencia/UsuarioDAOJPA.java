/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.persistencia;

import co.edu.eam.avanzada1.entidades.Persona;
import co.edu.eam.avanzada1.interfaces.IUsuarioDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author 416pc01
 */
public class UsuarioDAOJPA implements IUsuarioDAO {

    private EntityManager entity;

    public UsuarioDAOJPA(EntityManager entity) {
        this.entity = entity;
    }

    @Override
    public void editar(Persona usuario) throws Exception {
        entity.getTransaction().begin();
        entity.merge(usuario);
        entity.getTransaction().commit();
    }

    @Override
    public List<Persona> consultarUsuarioRegistrados(Object valor) throws Exception {
        Query consulta = entity.createNamedQuery(Persona.CONSULTAR_USUARIOS_REGISTRADOS);
        consulta.setParameter(1, valor+"%");
        List<Persona> personas = consulta.getResultList();
        return personas;
    }

    @Override
    public List<Persona> consultarUsuarioNoRegistrados(String valor) throws Exception {
        Query consulta = entity.createNamedQuery(Persona.CONSULTAR_USUARIOS_NO_REGISTRADOS);
        
        List<Persona> personas = consulta.getResultList();
        return personas;
    }
}
