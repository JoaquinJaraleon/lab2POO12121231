/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
        double salario; //Salario anual actual
        double rating; // Calificaciones de desempeño (1=Excelente, 2=bueno y 3=malo).
         // monto en doláres del aumento
        
        Scanner scan = new Scanner(System.in);

        System.out.println (" Ingrese el salario actual ");
        salario = scan.nextDouble();
        System.out.println ("Ingrese la calificacion de desempeño: ");
        rating = scan.nextDouble();
        
        
        if (rating ==1 ){
             System.out.println ( salario + (salario * 0.06));
          
        }else if (rating == 2) {
            System.out.println (salario + (salario * 0.04));
            
        }else if (rating == 3) {
            System.out.println (salario + (salario * 0.015));
        }
        // Imprime resultado
        
        }
    }