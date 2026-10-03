/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Binarias;



/**
 *
 * @author Titoelgato
 */
public class Suma extends OperacionesBinarias {

    public Suma(double numero1, double numero2, double resultado) {
        super(numero1, numero2, resultado);
    }

    @Override
    public void Calcular() {
      
        resultado = numero1 + numero2;
    }
}
