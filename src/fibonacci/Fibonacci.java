/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Lopez Avila
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp = 1;
        int temp_2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número N: ");
        int n = sc.nextInt();
        System.out.print(temp + " ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp_2 + " ");
            temp_2 = temp + temp_2;
            temp = temp_2 - temp;
        }
        
    }
    
}
