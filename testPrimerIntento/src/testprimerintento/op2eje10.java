/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprimerintento;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class op2eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //int i = 0;
        Scanner leer = new Scanner(System.in);
        for (int j = 0; j < 4; j++) {
            System.out.println("");
            System.out.println("Ingrese un numero del 1 al 20 ");
            int n = leer.nextInt();

            if (n<=20) {
                 System.out.print(n);
                 for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                    }else {
                System.out.print("El numero ingresado en invalido");
                j--;
            }
            
        }  
        }  
        }
        
    


