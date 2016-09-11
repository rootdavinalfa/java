/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author davin
 */
public class Test {
    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        int jml;
        System.out.println("Masukkan nilai A");
        Scanner inputdata=new Scanner(System.in);
        int a= inputdata.nextInt();
        System.out.println("Masukkan nilai B");
        int b= inputdata.nextInt();
        System.out.print("Hasil dari A+B adalah");
        jml=a+b;
        System.out.print(jml);
        System.out.println(" END OPERATION");
        // TODO code application logic here
    }    
}
