/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.interfaces;

import co.edu.eam.avanzada1.persistencia.FabricaDAOJPA;



/**
 * @author IOCARI SOFT<iocarisoft@gmail.com>
 */
public class SingletonFabrica {
    
   private static IFabricaDAO fabrica;

    public SingletonFabrica() {
        
    }
    
    public static IFabricaDAO getInstance(){
    
        if(fabrica==null){
            fabrica=new FabricaDAOJPA();
        }
        return fabrica;
    }
    
    
}
