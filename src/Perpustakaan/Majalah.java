package Perpustakaan;

public class Majalah extends DataKoleksi{
    private final int noEdisi;
    private final String jenisTerbit;

    public Majalah(int noKoleksi, String jenis, String status, String nama, String penerbit, String tanggalTerbit, int noEdisi, String jenisTerbit) {
        super(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit);
        this.noEdisi = noEdisi;
        this.jenisTerbit = jenisTerbit;
    }
    public void Display(){
        System.out.println(
                "\n[Data Koleksi Majalah]" +
                        "\nNomer Koleksi    : " + this.noKoleksi +
                        "\nJenis            : " + this.jenis +
                        "\nStatus           : " + this.status +
                        "\nJudul Koleksi    : " + this.nama +
                        "\nPenerbit         : " + this.penerbit +
                        "\nTanggal Terbit   : " + this.tanggalTerbit +
                        "\nNomer Edisi      : " + this.noEdisi +
                        "\nJenis Terbit     : "+ this.jenisTerbit
        );
    }
}
