/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan44_hukumohm;

/**
 *
 * @author  
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Menghitung besar tegangan menggunakan hukum Ohm
 */
public class PBO3_10117098_Latihan44_HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai = new Baterai(3,12);
        Baterai baterai2 = new Baterai();

        System.out.println("Kuat Arus : "+baterai.getKuatArus()+" ampere");
        System.out.println("Hambatan  : "+baterai.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+baterai.hitungTegangan()+" volt");
    }
    
}
