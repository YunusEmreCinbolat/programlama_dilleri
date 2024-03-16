package gramer;
import java.util.Scanner;

public class Gramer {

    public static void main(String[] args) {
        // Özne, Nesne ve Yüklem küme elemanları
        String[] ozneKumesi = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
        String[] nesneKumesi = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe",
                "Cuma", "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
        String[] yuklemKumesi = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümleyi giriniz: ");
        String cumle = scanner.nextLine();

        // Cümleyi boşluklardan ayır ve kelimeleri diziye at
        String[] kelimeler = cumle.trim().split("\\s+");

        // Cümlede en az üç kelime olmalı (Özne, Nesne, Yüklem)
        if (kelimeler.length >= 3) {
            String ozne = kelimeler[0];
            String nesne = kelimeler[1];
            String yuklem = kelimeler[2];

            // Girilen kelimeler küme elemanlarına ait mi kontrol et
            if (elemanVarmi(ozne, ozneKumesi) && elemanVarmi(nesne, nesneKumesi) && elemanVarmi(yuklem, yuklemKumesi)) {
                System.out.println("EVET");
            } else {
                System.out.println("HAYIR");
            }
        } else {
            System.out.println("Cümle en az üç kelime içermelidir: " + cumle);
        }
    }

    // Verilen kelimenin, belirtilen kümeye ait olup olmadığını kontrol eden metod
    private static boolean elemanVarmi(String kelime, String[] kume) {
        for (String eleman : kume) {
            if (eleman.equals(kelime)) {
                return true;
            }
        }
        return false;
    }
}
