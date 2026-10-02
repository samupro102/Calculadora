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
    
    public OperacionesBinarias(double resultado) {
        super(resultado);
    }
    
    @Override
    public double getResultado() {
        return resultado;
    }
    
    @Override
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}