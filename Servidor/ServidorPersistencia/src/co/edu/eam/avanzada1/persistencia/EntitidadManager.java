/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author 416pc01
 */
public class EntitidadManager {

    private static EntityManager entity;

    private EntitidadManager() {
        entity = Persistence.createEntityManagerFactory("DBPersistencia").createEntityManager();

    }

    public static EntityManager getInstance() {
        if(entity==null){
            new EntitidadManager();
        }
        return entity;
    }
}
