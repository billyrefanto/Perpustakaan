package Perpustakaan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Perpustakaan {
    private final ArrayList<DataKoleksi> dataKoleksis = new ArrayList<>();
    public void addKoleksi(DataKoleksi koleksi){
        dataKoleksis.add(koleksi);
    }

    public void showAllDataKoleksi(){
        if (dataKoleksis.isEmpty()) {
            System.out.println("Tidak ada data koleksi!");
        } else {
            for (DataKoleksi listKoleksi : dataKoleksis) {
                listKoleksi.Display();
            }
        }
    }
    public void showBuku(){
        if (dataKoleksis.isEmpty()) {
            System.out.println("Tidak ada data koleksi!");
        } else {
            for (DataKoleksi listKoleksi : dataKoleksis) {
                if (listKoleksi.jenis.equals("Buku"))listKoleksi.Display();
            }
        }
    }
    public void showMajalah(){
        if (dataKoleksis.isEmpty()) {
            System.out.println("Tidak ada data koleksi!");
        } else {
            for (DataKoleksi listKoleksi : dataKoleksis) {
                if (listKoleksi.jenis.equals("Majalah"))listKoleksi.Display();
            }
        }
    }
    public void showKoran(){
        if (dataKoleksis.isEmpty()) {
            System.out.println("Tidak ada data koleksi!");
        } else {
            for (DataKoleksi listKoleksi : dataKoleksis) {
                if (listKoleksi.jenis.equals("Koran"))listKoleksi.Display();
            }
        }
    }
    public void showCakramDigital(){
        if (dataKoleksis.isEmpty()) {
            System.out.println("Tidak ada data koleksi!");
        } else {
            for (DataKoleksi listKoleksi : dataKoleksis) {
                if (listKoleksi.jenis.equals("Buku"))listKoleksi.Display();
            }
        }
    }
    public void showByName(){
        SortJudul sortJudul = new SortJudul();
        if (dataKoleksis.isEmpty()){
            System.out.println("Tidak ada data koleksi!");
        }else{
            Collections.sort(dataKoleksis,sortJudul);
            for (DataKoleksi listKoleksi : dataKoleksis) {
                listKoleksi.Display();
            }
        }

    }

    static class SortJudul implements Comparator<DataKoleksi> {
        @Override
        public int compare(DataKoleksi nama1, DataKoleksi nama2) {
            return nama1.getNama().compareTo(nama2.getNama());
        }

    }

}

