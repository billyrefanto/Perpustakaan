package Perpustakaan;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Perpustakaan perpustakaan = new Perpustakaan();

    public static void main(String[] args) {

        int menu, noKoleksi, tahunMasuk, noEdisi, jenisKoleksi;
        String nama, penerbit, pengarang, issn, isbn, doi, arxivId, jenisTerbit, jenisMedia, tanggalTerbit, jenis, status;

        do {
            


            System.out.println(
                    "==============[Pilih Menu]=================\n" +
                            "Perpustakaan \n" +
                            "1. Input Koleksi \n" +
                            "2. Menampilkan Semua koleksi \n" +
                            "3. Menampikan Berdasarkan jenis\n" +
                            "4. Menampilkan Berdasarkan Urutan Nama\n" +
                            "5. Hapus Data Berdasarkan No Koleksi\n" +
                            "6. Hapus Semua Data Koleksi\n" +
                            "7. Keluar\n" +
                            "===========================================\n"
            );
            System.out.print("Menu Ke - ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Nomer Koleksi : ");
                    noKoleksi = scanner.nextInt();
                    System.out.println("Judul Koleksi : ");
                    nama = scanner.next();
                    System.out.println("Penerbit      : ");
                    penerbit = scanner.next();
                    System.out.println("Tanggal Terbit :");
                    tanggalTerbit = scanner.next();
                    System.out.print("Status Koleksi.\n" +
                            "1. Ada\n" +
                            "2. Rusak\n" +
                            "3. Hilang\n" +
                            "Masukan Status : ");
                    status = scanner.next();
                    System.out.println(
                            "Pilih Jenis Koleksi\n" +
                                    "1. Buku\n" +
                                    "2. Majalah\n" +
                                    "3. Koran\n" +
                                    "4. Cakram Digital"
                    );
                    System.out.print("Angka ke - ");
                    jenisKoleksi = scanner.nextInt();
                    if (jenisKoleksi == 1) {
                        System.out.println("Jenis Koleksi Buku\n" +
                                "Pengarang                :  ");
                        pengarang = scanner.next();
                        System.out.println("Tahun Masuk   : ");
                        tahunMasuk = scanner.nextInt();
                        System.out.println("ISSN          : ");
                        issn = scanner.next();
                        System.out.println("ISBN          : ");
                        isbn = scanner.next();
                        System.out.println("DOI           : ");
                        doi = scanner.next();
                        System.out.println("Arxiv ID      : ");
                        arxivId = scanner.next();
                        jenis = "Buku";
                        perpustakaan.addKoleksi(new Buku(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit, pengarang, issn, isbn, doi, arxivId, tahunMasuk));
                        System.out.println("Data buku berhasil ditambah!");
                    } else if (jenisKoleksi == 2) {
                        System.out.println("Jenis Koleksi Majalah");
                        System.out.println("Nomer Edisi      : ");
                        noEdisi = scanner.nextInt();
                        System.out.print("Jenis terbit.\n" +
                                "1 Mingguan\n" +
                                "2. Bulanan\n" +
                                "Masukan Jenis Terbit : ");
                        jenisTerbit = scanner.next();
                        jenis = "Majalah";
                        perpustakaan.addKoleksi(new Majalah(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit, noEdisi, jenisTerbit));
                        System.out.println("Data majalah berhasil ditambah!");
                    } else if (jenisKoleksi == 3) {
                        System.out.println("Jenis Koleksi Koran");
                        System.out.print("Jenis terbit koran.\n" +
                                "1. Harian \n" +
                                "2. Mingguan\n" +
                                "Masukan Jenis Terbit : ");
                        jenisTerbit = scanner.next();
                        jenis = "Koran";
                        perpustakaan.addKoleksi(new Koran(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit, jenisTerbit));
                        System.out.println("Data koran berhasil ditambah!");
                    } else if (jenisKoleksi == 4) {
                        System.out.println("Jenis Koleksi Cakram Digital");
                        System.out.print("Masukan Jenis Media.\n" +
                                "1. Biasa \n" +
                                "2. Bluray \n" +
                                "3. Lainnya\n" +
                                "Jenis Media : ");
                        jenisMedia = scanner.next();
                        jenis = "Cakram Digital";
                        perpustakaan.addKoleksi(new CakramDigital(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit, jenisMedia));
                        System.out.println("Data cakram digital berhasil ditambah!");
                    } else {
                        System.out.println();
                        System.out.println("Angka - " + jenisKoleksi + " tidak tersedia.\n" +
                                "Silahkan pilih angka 1-4");
                    }
                case 2:
                    perpustakaan.showAllDataKoleksi();
                    break;
                case 3:
                    System.out.println(
                            "Pilih Jenis Koleksi\n" +
                                    "1. Buku\n" +
                                    "2. Majalah\n" +
                                    "3. Koran\n" +
                                    "4. Cakram Digital"
                    );
                    System.out.print("Angka ke - ");
                    jenisKoleksi = scanner.nextInt();
                    if (jenisKoleksi == 1) {
                        perpustakaan.showBuku();
                    } else if (jenisKoleksi == 2){
                        perpustakaan.showMajalah();
                    }else if (jenisKoleksi == 3){
                        perpustakaan.showKoran();
                    }else if (jenisKoleksi == 4){
                        perpustakaan.showCakramDigital();
                    }else{
                        System.out.println();
                        System.out.println("Angka - " + jenisKoleksi + " tidak tersedia.\n" +
                                "Silahkan pilih angka 1-4");
                    }
                break;
                case 4:
                    perpustakaan.showByName();
                    break;
                case 5:
                    System.out.println("Masukan Nomer Koleksi : ");
                    noKoleksi = scanner.nextInt();
                    perpustakaan.removeByNomerKoleksi(noKoleksi);
                    break;
                case 6:
                    perpustakaan.removeAll();
                    break;
                default:
                    System.out.println("Keluar!");
                    System.exit(0);
            }
        } while (true);
    }

}

