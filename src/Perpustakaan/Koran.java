package Perpustakaan;

public class Koran extends DataKoleksi {
    private final String jenisTerbit;

    public Koran(int noKoleksi, String jenis, String status, String nama, String penerbit, String tanggalTerbit, String jenisTerbit) {
        super(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit);
        this.jenisTerbit = jenisTerbit;
    }
    public void Display(){
        System.out.println(
                "\n[Data Koleksi Koran]" +
                        "\nNomer Koleksi    : " + this.noKoleksi +
                        "\nJenis            : " + this.jenis +
                        "\nStatus           : " + this.status +
                        "\nJudul Koleksi    : " + this.nama +
                        "\nPenerbit         : " + this.penerbit +
                        "\nTanggal Terbit   : " + this.tanggalTerbit +
                        "\nJenis Terbit     : " + this.jenisTerbit
        );
    }
}
