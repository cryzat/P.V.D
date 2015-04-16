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
public class ControladorCrearUsuarios {
    
    private UsuarioBO usuarioBo;

    public ControladorCrearUsuarios() {
        this.usuarioBo=new UsuarioBO();
    }
    
    public void crearUsuario(long identificacion,String clave)throws Exception{
        usuarioBo.crearUsuarios(identificacion, clave);
    }
    
    public List<Persona> listarUsuarioNoRegistrados(String parametro)throws Exception{
        return usuarioBo.listarUsuariosNoRegistrados(parametro);
    }
    
}
