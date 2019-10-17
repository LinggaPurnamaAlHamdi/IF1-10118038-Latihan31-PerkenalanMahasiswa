/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Perkenalan Mahasiswa
 */
public class IF110118038Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        Mahasiswa mahasiswa4 = new Mahasiswa();
        
        mahasiswa1.nim = "10110269";
        mahasiswa1.nama = "Rizki Adam Kurniawan";
        mahasiswa1.perkenalkanDiri();
        System.out.println("");
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama = "Indra Tiola";
        mahasiswa2.perkenalkanDiri();
        System.out.println("");
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama = "Robi Tanzil Ganefi";
        mahasiswa3.perkenalkanDiri();
        System.out.println("");
        mahasiswa4.nim = "101180269";
        mahasiswa4.nama = "Muhammad Nur Awaludin";
        mahasiswa4.perkenalkanDiri();
        System.out.println("");
    }   
}
