/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Binarias;

import Modelo.Binarias.OperacionesBinarias;

/**
 *
 * @author Titoelgato
 */
public class Suma extends OperacionesBinarias {

    public Suma(double numero1, double numero2, double resultado) {
        super(numero1, numero2, resultado);
    }

    @Override
    public double getNumero1() {
        return numero1;
    }

    @Override
    public double getNumero2() {
        return numero2;
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
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public void Calcular() {
      
        resultado = numero1 + numero2;
    }
}
