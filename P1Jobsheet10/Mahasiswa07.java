package P1Jobsheet10;

public class Mahasiswa07 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa07( String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Kelas : " + kelas);
    }
}