/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import Controlador.ControladorCalculadora;
import Vista.VistaCalculadora;
/**
 *
 * @author Windows 11
 */
public class Calculadora {

     public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            VistaCalculadora vista = new VistaCalculadora();
            new ControladorCalculadora(vista);
            vista.setVisible(true);
        });
    }
}