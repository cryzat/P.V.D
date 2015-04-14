/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.interfaces;

import co.edu.eam.avanzada1.entidades.Persona;
import java.util.List;

/**
 *
 * @author 416pc01
 */
public interface IUsuarioDAO {

    public List<Persona> consultarUsuarioRegistrados(Object valor) throws Exception;

    public List<Persona> consultarUsuarioNoRegistrados(String valor) throws Exception;

    public void editar(Persona usuario) throws Exception;
}
