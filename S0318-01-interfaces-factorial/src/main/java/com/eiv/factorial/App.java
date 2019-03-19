package com.eiv.factorial;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	    
	    System.out.println("Ingrese un numero:");
        Scanner s = new Scanner(System.in);
        String sNumero = s.nextLine();
        int numero = Integer.valueOf(sNumero);
        
        CalculoFactorial factorial = new CalculoFactorialAlt2Impl();
        long resultado = factorial.calcular(numero);
        System.out.println("Factorial de " + numero + " es " + resultado);
        
        s.close();
	}
}
