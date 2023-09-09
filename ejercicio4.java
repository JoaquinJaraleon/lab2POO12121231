/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class ZodiacSign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Año;
        int DeterAñoC;
        
        System.out.print("Ingrese el año a evaluar : ");
        Año =  in.nextInt();
        
        DeterAñoC = Año%12;
        
        System.out.println(DeterAñoC);
        
        switch(DeterAñoC){
            case 0:
                System.out.println("Es el año del Mono");
                break;
            case 1:
                System.out.println("Es el año del Gallo");
                break;
            case 2:
                System.out.println("Es el año del Perro");
                break;
            case 3:
                System.out.println("Es el año del Cerdo");
                break;
            case 4:
                System.out.println("Es el año del Rata");
                break;
            case 5:
                System.out.println("Es el año del Buey");
                break;
            case 6:
                System.out.println("Es el año del Tigre");  
                break;
            case 7:
                System.out.println("Es el año del Conejo");   
                break;
            case 8:
                System.out.println("Es el año del Dragon");    
                break;
            case 9:
                System.out.println("Es el año del Serpiente");
                break;
            case 10:
                System.out.println("Es el año del Caballo");   
                break;
            default:
                System.out.println("No existe");
                
                
                
        }
        
        
        
        
        
    }
}   
