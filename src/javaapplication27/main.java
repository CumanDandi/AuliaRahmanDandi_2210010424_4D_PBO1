
package javaapplication27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner (System.in)
        ){
            perhitunganNilai[] daftarNilai = new perhitunganNilai[2]; //array
            
            for (int i = 0; i < 2; i++){
                System.out.println("Masukan Data Mahasiswa ke-" + (i + 1) + ":");
                System.out.print("Npm           : ");
                String npm = scanner.nextLine();
                System.out.print("Nama          : ");
                String nama = scanner.nextLine();
            
            double tugas = 0, uts = 0, uas = 0, absen = 0;
            boolean validInput = false;
            while(!validInput){
                try {
                    System.out.print("Nilai Tugas   : ");
                    tugas = scanner.nextDouble();
                    System.out.print("Nilai UTS     : ");
                    uts = scanner.nextDouble();
                    System.out.print("Nilai UAS     : ");
                    uas = scanner.nextDouble();
                    System.out.print("Nilai Absen   : ");
                    absen = scanner.nextDouble();
                    System.out.println("");
                    validInput = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Nilai Input Tidak Valid, Silahkan Masukan Nilai Kembali");
                    System.out.println("");
                    scanner.nextLine();
                }
            }
            scanner.nextLine();
            
            projectUas2 ProjectUas2 = new projectUas2 (npm, nama);
            daftarNilai[i] = new perhitunganNilai(ProjectUas2, tugas, uts, uas, absen);
            }
        
            for (perhitunganNilai nilai : daftarNilai) {
                nilai.info();
                System.out.println();
            }
        }
    }
}
