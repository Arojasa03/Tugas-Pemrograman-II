package latconsole;

import java.util.Scanner;

public class MainMahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("=== Input Data Mahasiswa ===");

        System.out.print("NIM : ");
        mhs.nim = input.nextLine();

        System.out.print("Nama : ");
        mhs.nama = input.nextLine();

        System.out.print("Nilai UTS : ");
        mhs.uts = input.nextDouble();

        System.out.print("Nilai UAS : ");
        mhs.uas = input.nextDouble();

        System.out.println("\n=== Hasil Data Mahasiswa ===");
        System.out.println("NIM : " + mhs.nim);
        System.out.println("Nama : " + mhs.nama);
        System.out.println("UTS : " + mhs.uts);
        System.out.println("UAS : " + mhs.uas);

        double rata = mhs.hitungRata();
        System.out.println("Rata : " + rata);

        System.out.println("Grade : " + mhs.hitungGrade());
    }
}