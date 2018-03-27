/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas01;

/**
 *
 * @author Yoga
 */
public class gunungaksi {
    public static void main(String[] args) {
        gunung semeru = new gunung();
        semeru.nama = "Semeru";
        semeru.ketinggian = "3.676 MDPL";
        semeru.jumlahpos="4 Pos";
        semeru.suhu="14 Celsius";
        semeru.hrgtiketmasuk="17.500";
        semeru.jumlahpendaki="1000 Orang";
        
        semeru.infogunung();
    }
}
