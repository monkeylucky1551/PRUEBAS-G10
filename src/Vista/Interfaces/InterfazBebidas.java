/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Interfaces;

import Controladores.ControladorBebidas;

/**
 *
 * @author Lenovo
 */
public interface InterfazBebidas {
    
    
    void setControlador(ControladorBebidas c);
    
    void arranca();
    
    
    
    static final String INICIO = "Inicio";
    static final String VerYModificarOrden = "Ver y Modificar Orden";
    static final String PAGARORDEN = "Pagar orden";
    static final String ATRAS = "Atrás";
    static final String MICOMPRA = "Mi Compra";
    static final String CERRARSESION = "Cerrar Sesión";
    
}
