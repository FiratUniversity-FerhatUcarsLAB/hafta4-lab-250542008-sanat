* Ad Soyad: [Mustafa Şahingöz]
 * Ogrenci No: [250542008]
 * Tarih: [25.10.2025]
 * Aciklama: Gorev 3 - Maaş Hesaplama
 * 
 * Bu program kullanıcıdan gerekli bilgileri alır ve double ifadesi ile mesai ücretini hesaplar daha sonra kesintileri,toplam geliri,adını soyadını,kesinti oranını,saatlik kazancı ekrana yazdırır.
 */

import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        // --- 1. Bilgi Girişi ---
        System.out.print("Çalışanın Adı Soyadı: ");
        String adSoyad = giris.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = giris.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = giris.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaat = giris.nextInt();

        // --- 2. Hesaplamalar ---

        // Mesai ücreti hesabı
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;

        // Toplam gelir
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgk = toplamGelir * 0.14;
        double gelirVergisi = toplamGelir * 0.15;
        double damgaVergisi = toplamGelir * 0.00759;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // Net maaş
        double netMaas = toplamGelir - toplamKesinti;

        // --- 3. İstatistikler ---
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176; // 22 gün × 8 saat
        double gunlukNetKazanc = netMaas / 22;

        // --- 4. Bordro Gösterimi ---
        System.out.println("\n===========================================");
        System.out.println("             MAAŞ HESAPLAMA RAPORU");
        System.out.println("===========================================");
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("-------------------------------------------");
        System.out.printf("Brüt Maaş:           %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti:        %.2f TL%n", mesaiUcreti);
        System.out.printf("Toplam Gelir:        %.2f TL%n", toplamGelir);
        System.out.println("-------------------------------------------");
        System.out.printf("SGK Kesintisi:       %.2f TL%n", sgk);
        System.out.printf("Gelir Vergisi:       %.2f TL%n", gelirVergisi);
        System.out.printf("Damga Vergisi:       %.2f TL%n", damgaVergisi);
        System.out.printf("Toplam Kesinti:      %.2f TL%n", toplamKesinti);
        System.out.println("-------------------------------------------");
        System.out.printf("Net Maaş:            %.2f TL%n", netMaas);
        System.out.println("-------------------------------------------");
        System.out.printf("Kesinti Oranı:       %.2f %% %n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç:  %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç:   %.2f TL%n", gunlukNetKazanc);
        System.out.println("===========================================");

        giris.close();
    }
}

