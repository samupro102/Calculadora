/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Unitarias;

import Modelo.Unitarias.OperacionesUnitarias;

/**
 *
 * @author Titoelgato
 */
public class RaizCubica extends OperacionesUnitarias {

    public RaizCubica(double numero1, double resultado) {
        super(numero1, resultado);
    }

    @Override
    public double getNumero1() {
        return numero1;
    }

    @Override
    public double getResultado() {
        return resultado;
    }

    @Override
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    @Override
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public void Calcular(){
    resultado = Math.cbrt(numero1);
}
    
}
