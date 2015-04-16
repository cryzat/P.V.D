/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.logica.BO;

import co.edu.eam.avanzada1.entidades.Persona;
import co.edu.eam.avanzada1.interfaces.IUsuarioDAO;
import java.util.List;

/**
 *
 * @author Se quiere Se puede
 */
public class UsuarioBO extends BOGenerico {

    public List<Persona> listarUsuariosRegistrados(String parametro) throws Exception {
        IUsuarioDAO usuario = fabrica.crearDAOUsuario();
        return usuario.consultarUsuarioRegistrados(parametro);
    }

    public List<Persona> listarUsuariosNoRegistrados(String parametro) throws Exception {
        IUsuarioDAO usuario = fabrica.crearDAOUsuario();
        return usuario.consultarUsuarioNoRegistrados(parametro);
    }

    public Persona buscarUsuario(long identificacion) throws Exception {
        IUsuarioDAO usuario = fabrica.crearDAOUsuario();
        return usuario.buscar(identificacion);
    }

    public void crearUsuarios(long identificacion, String clave) throws Exception {
        IUsuarioDAO usuario = fabrica.crearDAOUsuario();
        Persona entidad = buscarUsuario(identificacion);
        if (entidad != null) {
            entidad.setPassword(clave);
            usuario.editar(entidad);
        } else {
            throw new Exception();
        }
    }

    public void eliminarUsuario(long identificacion) throws Exception {
        IUsuarioDAO usuario = fabrica.crearDAOUsuario();
        Persona entidad = buscarUsuario(identificacion);
        if (entidad != null) {
            entidad.setEliminado(true);
            usuario.editar(entidad);
        } else {
            throw new Exception();
        }
    }

    public void cambiarEstadoBloqueo(long identificacion, boolean valor) throws Exception {
        IUsuarioDAO usuario = fabrica.crearDAOUsuario();
        Persona entidad = buscarUsuario(identificacion);
        if (entidad != null) {
            entidad.setBloqueado(valor);
            usuario.editar(entidad);
        } else {
            throw new Exception();
        }
    }
}
