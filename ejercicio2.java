/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpoo.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ivann
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número:");
        int N = scanner.nextInt();
                
                //Logica 
                if (N%2!=0) {
                    System.out.println("Luna");
                    System.exit(0);
                } else if((N%2==0) && (N >= 2 && N <= 5)) {
                    System.out.println("Sol");
                    System.exit(0);
                } else if ((N%2==0) && (N >= 6 && N <= 20)) {
                    System.out.println("Tierra");
                    System.exit(0);
                } else if ((N%2==0) && (N > 20)); {
                    System.out.println("Galaxia");
                    System.exit(0);
                            }
     scanner.close();
    }
    
}
