/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Titoelgato
 */
public class OperacionesBinarias extends modeloCalculadora {
    protected double numero1;
    protected double numero2;

    public OperacionesBinarias(double numero1, double numero2, double resultado) {
        super(resultado);
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    @Override
    public double getResultado() {
        return resultado;
    }
    
    @Override
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double getNumero1() {
        return numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }    
}