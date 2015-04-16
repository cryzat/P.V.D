/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.avanzada1.logica.BO;

import co.edu.eam.avanzada1.interfaces.IFabricaDAO;
import co.edu.eam.avanzada1.interfaces.SingletonFabrica;

/**
 *
 * @author Se quiere Se puede
 */
public class BOGenerico {
    /**
     * referencia con la persistencia
     */
    protected IFabricaDAO fabrica;

    /**
     * Contructor que inicia el enlace con la persistencia.
     */
    public BOGenerico() {
        fabrica=SingletonFabrica.getInstance();
    }
}
