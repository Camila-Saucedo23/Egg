/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjeGuiaJava;

import java.util.Scanner;

/**
 *
 * @author camis
 */
public class Eje21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = {{2,4,4,1,5},{6,6,9,5,1},{2,4,4,9,7},{6,6,9,9,7},{8,10,12,9,7}};
        int i,j ;
        
        System.out.println("MATRIZ");
        //imprimir matriz [10][10]
        int n;
        for (i=0; i<4; i++){
            for (j=0; j<4; j++){
                n= matriz[i][j];
                switch (Integer.toString(n).length()){
                case 1:
                    System.out.print("["+ matriz[i][j]+"]");
                    break;
                case 2:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                case 3:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                }
            }
            System.out.println("");
        }
System.out.println("MATRIZ P");
        //Llenado matrizA
        int [][] matrizP = {{2,4,4},{6,6,9},{8,10,12}};
        //imprimir matriz P
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
                n= matriz[i][j];
                switch (Integer.toString(n).length()){
                case 1:
                    System.out.print("["+ matriz[i][j]+"]");
                    break;
                case 2:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                case 3:
                    System.out.print("[ "+ matriz[i][j]+"]");
                    break;
                }
            }
            System.out.println("");
        }
    } 
}
    
