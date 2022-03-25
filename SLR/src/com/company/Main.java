package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //DataSet data = new DataSet();
        SLR operacion = new SLR();

        Scanner in = new Scanner(System.in);
        int valorIngresado=0;
        int respuesta;
        //valorIngresado= Integer.parseInt(JOptionPane.showInputDialog("Ingresa Valor X: "));

        System.out.println("\nIngresa el valor:  ");
        valorIngresado=in.nextInt();
        SLR AgregarValor = new SLR();
        operacion.setValor(valorIngresado);

        System.out.println("\n");
        System.out.println("Valor Ingresado:  "+operacion.getValor());
        System.out.println("Resultado de Beta 0 "+operacion.getBeta0());
        System.out.println("Resultado de Beta 1 "+operacion.getBeta1()+"\n");

        //respuesta= Integer.parseInt(JOptionPane.showInputDialog(operacion.getResultado));
        //JOptionPane.showMessageDialog(null, "\nResultado de B0 ="+operacion.getBeta0()+" + B1= "+operacion.getBeta1()+" * "+operacion.getValor()+" = "+operacion.getResultado());
        //JOptionPane.showMessageDialog(null, "\nY de hat es: "+operacion.getResultado());
        System.out.printf("\nResultado de Beta 0 + Beta 1* ValorIngresado =  %.4f", operacion.getResultado());
    }
}


