/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2percabangan;

/**
 *
 * @author ASUS
 */
   import java.util.Scanner;
public class Soal2percabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        System.out.print("Masukkan operator aritmatika (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        int hasil = 0;
        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                System.out.println("Hasil penjumlahan " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                System.out.println("Hasil pengurangan " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                    System.out.println("Hasil pembagian " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan.");
                }
                break;
            case '%':
                if (bilangan2 != 0) {
                    hasil = bilangan1 % bilangan2;
                    System.out.println("Hasil modulus " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
                } else {
                    System.out.println("Error: Modulus dengan nol tidak dapat dilakukan.");
                }
                break;
            default:
                System.out.println("Error: Operator aritmatika tidak valid.");
        }

        scanner.close();
    }
}