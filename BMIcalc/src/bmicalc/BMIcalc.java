/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalc;

/**
 *
 * @author davin
 */
import java.util.Scanner;

class process {
    public process(){
        //
    }
    public void satu(){
       double bmiing;
       System.out.print("BMI Massa Dengan Aturan Inggris\n");
       Scanner input= new Scanner (System.in);
       System.out.print("Masukkan berat (pound):");
       double beratpound = input.nextDouble();
       System.out.print("Masukkan tinggi (inch)");
       double tinggiinch;
        tinggiinch = input.nextDouble();
       System.out.print("++++++++++++++++++++++\n");
       bmiing = (beratpound*703)/(tinggiinch*tinggiinch);
       if (bmiing < 18.5){
           System.out.println("BMI anda: ");
           System.out.println(bmiing);
           System.out.println("KURANG");
       }
       if (bmiing>18.5 && bmiing<24.9){
           System.out.println("BMI anda: ");
           System.out.println(bmiing);
           System.out.println("NORMAL");
       }
       if(bmiing>25 && bmiing<29.9){
           System.out.print("BMI anda: ");
           System.out.println(bmiing);
           System.out.println("GEMUK dalam ambang batas");
       }
       if(bmiing>=30){
           System.out.println("BMI anda: ");
           System.out.println(bmiing);
           System.out.println("KEGEMUKAN SANGAT BERLEBIHAN.KURANGI KALORI");
       }
    }
    public void dua(){
        double bmimetrik;
        System.out.print("BMI berdasarkan aturan metrik\n");
        Scanner data = new Scanner (System.in);
        System.out.print("Masukkan berat badan (kg)");
        double beratkg;
        beratkg = data.nextDouble();
        System.out.print("Masukkan tinggi badan (m)");
        double tinggim;
        tinggim = data.nextDouble();
        System.out.print("++++++++++++++\n");
        bmimetrik = beratkg / (tinggim*tinggim);
        if (bmimetrik < 18.5){
           System.out.println("BMI anda: ");
           System.out.println(bmimetrik);
           System.out.println("KURANG");
       }
       if (bmimetrik>18.5 && bmimetrik<24.9){
           System.out.println("BMI anda: ");
           System.out.println(bmimetrik);
           System.out.println("NORMAL");
       }
       if(bmimetrik>25 && bmimetrik<29.9){
           System.out.print("BMI anda: ");
           System.out.println(bmimetrik);
           System.out.println("GEMUK dalam ambang batas");
       }
       if(bmimetrik>=30){
           System.out.println("BMI anda: ");
           System.out.println(bmimetrik);
           System.out.println("KEGEMUKAN SANGAT BERLEBIHAN.KURANGI KALORI");
       }
    }
    public void tiga(){
        
    }
}

public class BMIcalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        process sys = new process();
        Scanner inputmenu=new Scanner (System.in);
        System.out.println("\tSELAMAT DATANG\nDi Body Massa Indeks Versi 1.0.0");
        System.out.println("======================");
        System.out.print("MAIN MENU PILIH SALAH SATU\n");
        System.out.print("1.BMI dengan satuan Inggris\n");
        System.out.print("2.BMI dengan satuan metrik\n");
        System.out.print("3.Help\n");
        System.out.println("Masukkan Pilihan");
        int inputm;
        inputm = inputmenu.nextInt();
        switch (inputm)
        {
            case 1:
                sys.satu();
            case 2:
                sys.dua();
            case 3:
                sys.tiga();
        }
        }
    }
