/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan41.massajenis;

/**
 *
 * NAMA  : RIski Dwi Sabariyanto   
 * KELAS : IF 1
 * NIM   : 10118026
 * Deskripsi Program : Program ini untuk membuat proses untuk menghitung 
 *                     massa jenis kubus.
 */
public class Kubus {
    
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume (int parSisi){
        return parSisi*parSisi*parSisi;
    }
    
    public int hitungMassaJenis (int parMassa, int volume){
        return parMassa/volume;
    }
}
