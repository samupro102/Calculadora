/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Binarias;

import Modelo.modeloCalculadora;

/**
 *
 * @author Titoelgato
 */
public abstract class OperacionesBinarias extends modeloCalculadora {
    protected double numero1;
    protected double numero2;
     
    
    public OperacionesBinarias(double numero1, double numero2, double resultado) {
        super(resultado);
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
}