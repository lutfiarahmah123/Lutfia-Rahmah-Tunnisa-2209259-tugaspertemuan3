/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1percabangan;

/**
 *
 * @author ASUS
 */
   import java.util.Scanner;
public class Soal1percabangan {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        double bilangan = scanner.nextDouble();

        String bilanganString = Double.toString(bilangan);

        String[] pecahan = bilanganString.split("\\.");

        int angkaDepan = Integer.parseInt(pecahan[0]);
        if (angkaDepan % 3 == 0) {
            // Mengecek apakah angka di belakang koma merupakan kelipatan 3
            int angkaBelakang = Integer.parseInt(pecahan[1]);
            if (angkaBelakang % 3 == 0) {
                System.out.println("Angka di depan dan di belakang koma kelipatan 3.");
            } else {
                System.out.println("Angka di depan koma kelipatan 3, tetapi angka di belakang koma tidak.");
            }
        } else {
            System.out.println("Angka di depan koma bukan kelipatan 3.");
        }

    }
}

    
    

