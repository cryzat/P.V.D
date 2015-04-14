/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorpersistencia;

import co.edu.eam.avanzada1.entidades.Persona;
import co.edu.eam.avanzada1.interfaces.IUsuarioDAO;
import co.edu.eam.avanzada1.persistencia.EntitidadManager;
import co.edu.eam.avanzada1.persistencia.FabricaDAOJPA;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author 416pc01
 */
public class ServidorPersistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IUsuarioDAO usuario=FabricaDAOJPA.crearUsuarioDAO();
        try {
            List<Persona> personas;
            personas = usuario.consultarUsuarioRegistrados("J");
            for (Persona persona : personas) {
                System.out.println(persona.getNombre());
            }
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        
//        EntityManager m=EntitidadManager.getInstance();
//        if(m!=null){
//         System.out.println("asas");   
//        }
    }
}
