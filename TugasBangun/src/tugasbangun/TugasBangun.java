/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbangun;
import bangundatar.*;
/**
 *
 * @author siswa
 */
public class TugasBangun {
    public static void main(String[] args) {
        System.out.println("Lingkaran");
        Lingkaran l = new Lingkaran();
        l.jejari = 28;
        l.tampilHasil();
        
        System.out.println("");
        System.out.println("Persegi");
        Persegi p = new Persegi();
        p.sisi = 4;
        p.tampilHasil();
        
        System.out.println("");
        System.out.println("Persegi Panjang");
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 2;
        pp.lebar = 3;
        pp.tampilHasil();
        
        System.out.println("");
        System.out.println("Segitiga");
        Segitiga s = new Segitiga();
        s.alas = 20;
        s.tinggi = 3;
        s.tampilHasil();
    }
    
}
