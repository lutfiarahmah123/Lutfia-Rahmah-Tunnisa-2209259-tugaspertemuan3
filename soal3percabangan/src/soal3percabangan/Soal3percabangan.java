/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3percabangan;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Soal3percabangan {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam mulai : ");
        int jamMulai = scanner.nextInt();
        int menitMulai = scanner.nextInt();

      
        System.out.print("Masukkan jam selesai : ");
        int jamSelesai = scanner.nextInt();
        int menitSelesai = scanner.nextInt();

      
        int selisihMenit = ((jamSelesai - jamMulai) * 60) + (menitSelesai - menitMulai);
        
        int lamaJam = selisihMenit / 60;
        int lamaMenit = selisihMenit % 60;

        
        
        System.out.println("Lama waktu: " + lamaJam + " jam " + lamaMenit + " menit.");
        System.out.println("Lama waktu dalam menit: " + selisihMenit + " menit.");

        scanner.close();
    }
}
