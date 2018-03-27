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
        
        gunung rinjani = new gunung();
        rinjani.nama = "Rinjani ";
        rinjani.ketinggian = "3.805 MDPL";
        rinjani.jumlahpos = "6 Pos";
        rinjani.suhu = "10 Celsius";
        rinjani.hrgtiketmasuk = "76.000";
        rinjani.jumlahpendaki = "700";
        
        rinjani.infogunung();
        
        gunung kerinci = new gunung();
        kerinci.nama = "kerinci";
        kerinci.ketinggian = "3.805 MDPL";
        kerinci.jumlahpos = "5 Pos";
        kerinci.suhu = "12 Celcius";
        kerinci.hrgtiketmasuk = "40.000";
        kerinci.jumlahpendaki= "400 ";
        
        kerinci.infogunung();
        
    }
}
