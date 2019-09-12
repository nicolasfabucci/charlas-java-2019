package com.eiv;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar un numero: ");
        String in = scanner.next();
        
        try {
            Integer numero = Integer.valueOf(in);
            Integer numero2 = numero / 0;
            System.out.println("Numero: " + numero);
            System.out.println("Numero 2: " + numero2);
//        } catch (RuntimeException e) {
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
