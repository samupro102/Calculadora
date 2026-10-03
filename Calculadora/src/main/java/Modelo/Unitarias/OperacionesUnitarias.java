/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Unitarias;

import Modelo.modeloCalculadora;

/**
 *
 * @author Titoelgato
 */
public class OperacionesUnitarias extends modeloCalculadora{
    
    protected double numero1;

    public OperacionesUnitarias(double numero1, double resultado) {
        super(resultado);
        this.numero1 = numero1;
    }

    public double getNumero1() {
        return numero1;
    }

    @Override
    public double getResultado() {
        return resultado;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    @Override
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    @Override
    public void Calcular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

