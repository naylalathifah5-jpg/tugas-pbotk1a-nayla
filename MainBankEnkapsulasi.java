/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum06042026;
import java.util.Scanner;
/**
 *
 * @author Nayla latifah hasna
 */
public class MainBankEnkapsulasi {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        // Input data awal
    System.out.println("=== INPUT DATA AKUN ===");
    System.out.print("Masukkan No Rekening : ");
    String noRek = in.nextLine();

    System.out.print("Masukkan Nama        : ");
    String nama = in.nextLine();

    System.out.print("Masukkan Saldo Awal  : ");
    double saldoAwal = in.nextDouble();

        // Buat objek
    BankEnkapsulasi akun = new BankEnkapsulasi(noRek, nama, saldoAwal);

        // Tampilkan saldo awal
    System.out.println("\n=== SALDO AWAL ===");
    akun.tampilData();

        // Input deposit
    System.out.print("\nMasukkan jumlah deposit : ");
    double deposit = in.nextDouble();
    akun.deposit(deposit);
    System.out.println("Saldo setelah deposit: " + akun.getSaldo());

        // Input withdraw
    System.out.print("\nMasukkan jumlah withdraw : ");
    double withdraw = in.nextDouble();
    akun.withdraw(withdraw);
    System.out.println("Saldo setelah withdraw: " + akun.getSaldo());

    in.close();
    }
}
