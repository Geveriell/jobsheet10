package P1Jobsheet10;

import java.util.Scanner;

public class AntrianMain07 {

    static void menu() {
        System.out.println("\n=== MENU ANTRIAN KRS ===");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Panggil Antrian KRS");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan 2 Antrian Terdepan");
        System.out.println("5. Tampilkan Antrian Paling Belakang");
        System.out.println("6. Cek Jumlah Antrian");
        System.out.println("7. Cek Jumlah Sudah Proses KRS");
        System.out.println("8. Cek Jumlah Belum Proses KRS");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AntrianKRS07 antri = new AntrianKRS07(10);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa07 mhs =
                            new Mahasiswa07(nim, nama, prodi, kelas);

                    antri.enqueue(mhs);

                    break;

                case 2:
                    antri.dequeue2();
                    break;

                case 3:
                    antri.print();
                    break;

                case 4:
                    antri.peekFront();
                    break;

                case 5:
                    antri.peekRear();
                    break;

                case 6:
                    antri.jumlahAntrian();
                    break;

                case 7:
                    antri.jumlahSudahProses();
                    break;

                case 8:
                    antri.belumProses();
                    break;

                case 9:
                    antri.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}