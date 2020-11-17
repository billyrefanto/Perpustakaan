package Perpustakaan;

public class CakramDigital extends DataKoleksi {
    private final String jenisMedia;

    public CakramDigital(int noKoleksi, String jenis, String status, String nama, String penerbit, String tanggalTerbit, String jenisMedia) {
        super(noKoleksi, jenis, status, nama, penerbit, tanggalTerbit);
        this.jenisMedia = jenisMedia;
    }

    public void Display() {
        System.out.println(
                "\n[Data Koleksi Cakram Digital]" +
                        "\nNomer Koleksi    : " + this.noKoleksi +
                        "\nJenis            : " + this.jenis +
                        "\nStatus           : " + this.status +
                        "\nJudul Koleksi    : " + this.nama +
                        "\nPenerbit         : " + this.penerbit +
                        "\nTanggal Terbit   : " + this.tanggalTerbit +
                        "\nJenis Media      : " + this.jenisMedia
        );
    }
}
