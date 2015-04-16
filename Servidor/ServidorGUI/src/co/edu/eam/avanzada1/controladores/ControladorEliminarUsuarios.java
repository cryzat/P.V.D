/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.controladores;

import co.edu.eam.avanzada1.entidades.Persona;
import co.edu.eam.avanzada1.logica.BO.UsuarioBO;
import java.util.List;

/**
 *
 * @author Se quiere Se puede
 */
public class ControladorEliminarUsuarios {
    
    private UsuarioBO usuarioBo;

    public ControladorEliminarUsuarios() {
        this.usuarioBo=new UsuarioBO();
    }
    
    public void elimnarUsuario(long identificacion)throws Exception{
        usuarioBo.eliminarUsuario(identificacion);
    }
    
    public List<Persona> listarUsuarioRegistrados(String parametro)throws Exception{
        return usuarioBo.listarUsuariosRegistrados(parametro);
    }
    
    
}
