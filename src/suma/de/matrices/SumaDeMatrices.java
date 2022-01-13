/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.de.matrices;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class SumaDeMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner m1= new Scanner (System.in); 
        int nfi, nco, nfi2, nco2,a,b;
        int matriz[][];
        int matriz2[][];
        int matrizres[][];
        
        System.out.println("Ingrese el numero de columnas");
        nco= m1.nextInt();
        System.out.println("Ingrese el numero de filas");
        nfi= m1.nextInt();
        System.out.println("Ingrese los numeros");
        matriz= new int[nco][nfi];
        for (int i = 0; i < nco; i++) {
            
            for (int j = 0; j < nfi; j++) {
                matriz[i][j]=m1.nextInt();   
            }      
        }
        System.out.println("Ingrese el numero de columnas de la segunda matriz");
        nco2= m1.nextInt();
        System.out.println("Ingrese el numero de filas de la segunda matriz");
        nfi2= m1.nextInt();
        System.out.println("Ingrese los numeros");
        matriz2= new int[nco2][nfi2];
        matrizres= new int[nco][nfi];
        for (int i = 0; i < nco2; i++) {
            
            for (int j = 0; j < nfi2; j++) {
                matriz2[i][j]=m1.nextInt();
                
            }
        } 
                
        for (int i = 0; i < nco; i++) {
            for (int j = 0; j < nfi; j++) {
                matrizres[i][j]=matriz[i][j]+matriz2[i][j];
                
            }           
        }
       
         System.out.println("Valores introducidos en la matriz A:");
                for ( a = 0; a < matriz.length; a++) {
                    System.out.print("│");
                    for ( b = 0; b < matriz[a].length; b++) {
                        
                        System.out.print(matriz[a][b]+" ");
                        
                    }
                    System.out.println("│");  
            }
          System.out.println("+");
          
          System.out.println("Valores introducidos en la matriz B:");
                for ( a = 0; a < matriz2.length; a++) {
                    System.out.print("│");
                    for ( b = 0; b < matriz2[a].length; b++) {
                        
                        System.out.print(matriz2[a][b]+" ");
                        
                    }
                    System.out.println("│");  
            }
         System.out.println("Respuesta:");
        
        for (int i = 0; i < nco; i++) {
            System.out.print("│");
            for (int j = 0; j < nfi; j++) {
                System.out.print(matrizres[i][j]+"\t");
                
            }System.out.println("│");  
            
        }System.out.print("│");
        
        System.out.println( );
        
        System.out.println("Vamos a hacer la matriz inversa");
        Scanner mainv = new Scanner(System.in);
        int matrizin[][]=new int[3][3];
        int aux;
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz["+i+"]["+j+"]");
                matrizin[i][j]= mainv.nextInt();
            }
        }
        System.out.println("Matriz Original:");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("│");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizin[i][j]);
            }
            System.out.println("│");
        }
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < i; j++) {
                aux = matrizin[i][j];
                matrizin[i][j]=matrizin[j][i];
                matrizin[j][i]=aux;
            }
        }
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < 3; i++) {
             
            for (int j = 0; j < 3; j++) {
                
                System.out.print(matrizin[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
}
