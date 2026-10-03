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
    public void Calcular(){
       resultado = Math.log(numero1);
    }
}
