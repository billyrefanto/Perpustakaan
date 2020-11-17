package Perpustakaan;

public class Buku extends DataKoleksi {
    private final String pengarang,issn,isbn,doi,arxivId;
    private final int tahunMasuk;

    public Buku(int noKoleksi, String jenis, String status, String nama, String penerbit, String tanggalTerbit, String pengarang, String issn, String isbn, String doi, String arxivId, int tahunMasuk) {
        super(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit);
        this.pengarang = pengarang;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivId = arxivId;
        this.tahunMasuk = tahunMasuk;
    }


    public void Display(){
        System.out.println("\n[Data Koleksi Buku]" +
                "\nNomer Koleksi    : " + this.noKoleksi +
                "\nJenis            : " + this.jenis +
                "\nStatus           : " + this.status +
                "\nJudul Koleksi    : " + this.nama +
                "\nPenerbit         : " + this.penerbit +
                "\nTanggal Terbit   : " + this.tanggalTerbit +
                "\nPengarang        : " + this.pengarang +
                "\nTahun Masuk      : " + this.tahunMasuk +
                "\nISSN             : " + this.issn +
                "\nISBN             : " + this.isbn +
                "\nDOI              : " + this.doi +
                "\nArxiv Id         : " + this.arxivId
    );
    }
}
