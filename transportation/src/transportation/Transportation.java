/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportation;

import java.util.Scanner;

/**
 *
 * @author davin
 * @version 1.0.0
 */
class lehugha {

    public void satu() {
        Scanner data = new Scanner(System.in);
        double yangdibayar, jml, totalkeluar;
        System.out.print("+++++++++TOTAL BIAYA+++++++++\n");
        System.out.print("Masukkan jarak rata-rata yang ditempuh: (KM)");
        double jarak;
        jarak = data.nextDouble();
        System.out.print("Masukkan harga bbm per liter: (ribuan)");
        double harga;
        harga = data.nextDouble();
        System.out.print("Masukkan rata-rata jarak yang ditempuh per liter: (KM)");
        double rata;
        rata = data.nextDouble();
        System.out.print("Masukkan biaya parkir per hari: (ribuan)");
        double parkir;
        parkir = data.nextDouble();
        System.out.print("Masukkan biaya pengeluaran jalan tol tiap hari (ribuan)");
        double tol;
        tol = data.nextDouble();
        jml = (jarak / rata);
        yangdibayar = (jml * harga);
        totalkeluar = yangdibayar + parkir + tol;
        System.out.print("+++++++++++++++++\n");
        System.out.printf("Setiap kendaraan melaju sejauh %f KM", jarak);
        System.out.printf("Dibutuhkan biaya sekitar %f \n+++++++++++", yangdibayar);
        System.out.printf("\nTotal pengeluaran yang harus dibayar ketika melewati jalan tol sebesar %f ", tol);
        System.out.printf(" Dan memarkir kendaraan %f \n", parkir);
        System.out.print("DENGAN TOTAL: ");
        System.out.println(totalkeluar);

    }

    public void dua() {
        Scanner w = new Scanner(System.in);
        System.out.print("\tCONVERTER");
        System.out.print("++++++++++++++");
        System.out.print("Masukkan jumlah uang untuk mengisi bahan bakar: ");
        double uangmasuk;
        uangmasuk = w.nextDouble();
        System.out.print("Masukkan harga bahan bakar per liter: ");
        double hargabbm;
        hargabbm = w.nextDouble();
        System.out.print("Masukkan rata-rata jarak pemakaian BBM per liter: ");
        double ratajarak;
        ratajarak = w.nextDouble();
        System.out.print("++++++++++++++++\n");
        double liter;
        liter = uangmasuk / hargabbm;
        double jaraktempuh;
        jaraktempuh = ratajarak * liter;
        System.out.printf("Dengan uang %f ", uangmasuk);
        System.out.printf("Dapat membeli BBM sebanyak %f ", liter);
        System.out.printf("+/- Jarak yang dapat ditempuh sejauh %f ", jaraktempuh);

    }
}

public class Transportation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lehugha kntl = new lehugha();
        Scanner menu = new Scanner(System.in);
        int pil;
        System.out.print("\tAPLIKASI PENGHITUNG BIAYA BAHAN BAKAR\n");
        System.out.print("VERSION 1.0.0 Copyrighted by Davin");
        System.out.print("+++++++++++++++++++++\n");
        System.out.print("1.Total biaya yang dibutuhkan setiap hari\n");
        System.out.print("2.Convert uang ke bentuk BBM dan jarak tempuh\nMasukkan pilihan: ");
        pil = menu.nextInt();
        switch (pil) {

            case 1:
                kntl.satu();
                break;
            case 2:
                kntl.dua();
                break;
        }
    }

}
