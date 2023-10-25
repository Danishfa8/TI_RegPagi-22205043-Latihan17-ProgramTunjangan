/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan17.programtunjangan;

import java.util.Scanner;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : Program ini berisi tentang menghitung tunjangan karyawan yang sudah menikah/belum dan total gaji.
 */
public class TI_RegPagi22205043Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Program Tunjangan =====");

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();

        // Input status pernikahan
        System.out.print("Masukkan status pernikahan (menikah/belum): ");
        String statusPernikahan = input.next().toUpperCase();

        // Hitung tunjangan
        double tunjangan = 0;
        if (statusPernikahan.equals("MENIKAH")) {
            tunjangan = gajiPokok * 0.35;
        }

        // Tampilkan tunjangan
        System.out.println("\n==== Hasil Perhitungan ====");
        System.out.println("Gaji pokok anda = " + gajiPokok);
        System.out.println("Tunjangan karyawan adalah Rp" + tunjangan);
        System.out.println("Total Gaji = " + (gajiPokok + tunjangan));
        System.out.println("(Developed by Danish Fadlan)");
    }
}
