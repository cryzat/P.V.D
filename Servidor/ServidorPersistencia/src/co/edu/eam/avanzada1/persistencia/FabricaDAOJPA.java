/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.persistencia;

import co.edu.eam.avanzada1.interfaces.IFabricaDAO;
import co.edu.eam.avanzada1.interfaces.IUsuarioDAO;
import javax.persistence.EntityManager;

/**
 *
 * @author 416pc01
 */
public class FabricaDAOJPA implements IFabricaDAO {

    @Override
    public IUsuarioDAO crearDAOUsuario() {
        EntityManager entity = EntitidadManager.getInstance();
        return new UsuarioDAOJPA(entity);
    }
}
