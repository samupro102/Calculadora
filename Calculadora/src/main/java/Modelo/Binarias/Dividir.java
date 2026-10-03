/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Binarias;

/**
 *
 * @author Titoelgato
 */
public class Dividir extends OperacionesBinarias {

    public Dividir(double numero1, double numero2, double resultado) {
        super(numero1, numero2, resultado);
    }
    
    
    @Override
    public void Calcular() {
    if (numero2 == 0) {
        throw new ArithmeticException("No se puede dividir entre cero");
    }
    resultado = numero1 / numero2;
}
    
}
