/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.java.back;

import java.util.Scanner;

/**
 *
 * @author bposadac
 */
public class PruebaJavaBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        Long resultado = Long.parseLong("1");
        if (N <= 0) {
            System.out.println("El numero debe ser mayor a 0");
        }else{
            for (int i = 1; i <= N; i++) {
                resultado = resultado * i;
            }
            System.out.println("El fectorial para " + N + " es " + resultado);
        }
    }
    
}
