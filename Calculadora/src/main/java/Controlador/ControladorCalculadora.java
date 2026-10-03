/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Binarias.Dividir;
import Modelo.Binarias.Multiplicar;
import Modelo.Binarias.Resta;
import Modelo.Binarias.Suma;
import Modelo.Unitarias.LogaritmoNatural;
import Modelo.Unitarias.RaizCubica;
import Modelo.Unitarias.RaizCuadrada;
import Modelo.modeloCalculadora;
import Vista.VistaCalculadora;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ControladorCalculadora {

    private final VistaCalculadora vista;
    private double primerNumero;
    private String operador;
    private boolean nuevoNumero;

    public ControladorCalculadora(VistaCalculadora vista) {
        this.vista = vista;
        limpiar();
        conectarBotones();
    }

    //  contectamos los botones 

    private void conectarBotones() {
        JButton[] digitos = {
            vista.getBtn0(), vista.getBtn1(), vista.getBtn2(), vista.getBtn3(),
            vista.getBtn4(), vista.getBtn5(), vista.getBtn6(), vista.getBtn7(),
            vista.getBtn8(), vista.getBtn9()
        };
        for (JButton boton : digitos) {
            boton.addActionListener(e -> agregarDigito(boton.getText()));
        }
        vista.getBtnPunto().addActionListener(e -> agregarPunto());

        vista.getBtnSumar().addActionListener(e -> seleccionarOperador("+"));
        vista.getBtnRestar().addActionListener(e -> seleccionarOperador("-"));
        vista.getBtnMultiplicar().addActionListener(e -> seleccionarOperador("*"));
        vista.getBtnDividir().addActionListener(e -> seleccionarOperador("/"));
        vista.getBtnIgual().addActionListener(e -> igual());

        vista.getBtnRaizCuadrada().addActionListener(e -> ejecutar(new RaizCuadrada(leerPantalla(), 0)));
        vista.getBtnRaizCubica().addActionListener(e -> ejecutar(new RaizCubica(leerPantalla(), 0)));
        vista.getBtnLogaritmo().addActionListener(e -> ejecutar(new LogaritmoNatural(leerPantalla(), 0)));

        vista.getBtnLimpiar().addActionListener(e -> limpiar());
    }

    //  escritura de números

    private void agregarDigito(String digito) {
        String actual = vista.getTxtPantalla().getText();
        if (nuevoNumero || actual.equals("0")) {
            vista.getTxtPantalla().setText(digito);
        } else {
            vista.getTxtPantalla().setText(actual + digito);
        }
        nuevoNumero = false;
    }

    private void agregarPunto() {
        String actual = vista.getTxtPantalla().getText();
        if (nuevoNumero) {
            vista.getTxtPantalla().setText("0.");
            nuevoNumero = false;
        } else if (!actual.contains(".")) {
            vista.getTxtPantalla().setText(actual + ".");
        }
    }

    // parte de operaciones binarias 

    private void seleccionarOperador(String simbolo) {
        if (!operador.isEmpty() && !nuevoNumero) {
            if (!calcularBinaria()) {
                return;
            }
        }
        primerNumero = leerPantalla();
        operador = simbolo;
        nuevoNumero = true;
    }

    private void igual() {
        if (operador.isEmpty()) {
            return;
        }
        calcularBinaria();
    }

    private boolean calcularBinaria() {
        double segundoNumero = leerPantalla();
        modeloCalculadora operacion;
        switch (operador) {
            case "+":
                operacion = new Suma(primerNumero, segundoNumero, 0);
                break;
            case "-":
                operacion = new Resta(primerNumero, segundoNumero, 0);
                break;
            case "*":
                operacion = new Multiplicar(primerNumero, segundoNumero, 0);
                break;
            case "/":
                operacion = new Dividir(primerNumero, segundoNumero, 0);
                break;
            default:
                return false;
        }
        boolean exito = ejecutar(operacion);
        operador = "";
        return exito;
    }

    //  ewjecución (binarias y unarias)

    private boolean ejecutar(modeloCalculadora operacion) {
        try {
            operacion.Calcular();
            mostrarResultado(operacion.getResultado());
            return true;
        } catch (ArithmeticException ex) {
            mostrarError(ex.getMessage());
            return false;
        }
    }

    // utilidades

    private double leerPantalla() {
        try {
            return Double.parseDouble(vista.getTxtPantalla().getText());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    private void mostrarResultado(double valor) {
        String texto;
        if (valor == Math.rint(valor) && Math.abs(valor) < 1e15) {
            texto = String.valueOf((long) valor); // 4.0 se muestra como 4
        } else {
            texto = String.valueOf(valor);
        }
        vista.getTxtPantalla().setText(texto);
        nuevoNumero = true;
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(vista, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        limpiar();
    }

    private void limpiar() {
        primerNumero = 0;
        operador = "";
        nuevoNumero = true;
        vista.getTxtPantalla().setText("0");
    }
}
