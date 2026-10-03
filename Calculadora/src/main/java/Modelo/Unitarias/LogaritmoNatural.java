/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Unitarias;

/**
 *
 * @author Titoelgato
 */
public class LogaritmoNatural extends OperacionesUnitarias {

    public LogaritmoNatural(double numero1, double resultado) {
        super(numero1, resultado);
    }

    @Override
    public void Calcular() {
        if (numero1 <= 0) {
            throw new ArithmeticException("El logaritmo natural solo existe para números mayores que cero");
        }
        resultado = Math.log(numero1);
    }
}
