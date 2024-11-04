/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class Cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
        String jawaban = scanner.nextLine().toUpperCase();

        if (jawaban.equals("YOI")) {
            System.out.println("Cakep Bener. Good Job");
            System.out.println("GELOOOOOOO!!!!!!!!");
            System.out.println("KON HEBAT PERTAHANKAN");
        } else {
            System.out.println("Tetep cakep sih.");
            System.out.println("Ada Perkembangan Nich.");
            System.out.println("Orapp Kon Bisa KOK Semangat");
        }
    }
}