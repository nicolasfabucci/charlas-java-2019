package com.eiv;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Ingresar numero A: ");
            int nroA = scanner.nextInt();
        
            System.out.println("Ingresar numero B: ");
            int nroB = scanner.nextInt();
        
            try {
                
                Suma suma = new Suma(nroA, nroB);
                System.out.println("Resultado: " + suma.resultado());
            
            } catch (SumaException e) {
                if(e.getCodigo() == SumaException.A_MAYOR_B) {
                    //...
                } else if(e.getCodigo() == SumaException.A_MAS_B_MAYOR_10) {
                    System.out.println("EL RESULTADO ES MAYOR A 10");
                }
            
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
