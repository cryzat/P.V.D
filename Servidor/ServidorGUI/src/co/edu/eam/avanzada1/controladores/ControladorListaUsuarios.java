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
public class ControladorListaUsuarios {
    
    private UsuarioBO usuarioBo;

    public ControladorListaUsuarios() {
        this.usuarioBo=new UsuarioBO();
    }
       
    public List<Persona> listarUsuarioRegistrados(String parametro)throws Exception{
        return usuarioBo.listarUsuariosRegistrados(parametro);
    }
}
