package Perpustakaan;

public abstract class DataKoleksi {
    protected int noKoleksi;
    protected String nama, penerbit,tanggalTerbit,jenis,status;


    public DataKoleksi(int noKoleksi, String jenis, String status, String nama, String penerbit, String tanggalTerbit) {
        this.noKoleksi = noKoleksi;
        this.jenis = jenis;
        this.status = status;
        this.nama = nama;
        this.penerbit = penerbit;
        this.tanggalTerbit = tanggalTerbit;
    }

    public String getNama() {
        return nama;
    }


    protected abstract void Display();


}
