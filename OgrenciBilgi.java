/*
 * Ad Soyad: [Mustafa Şahingöz]
 * Ogrenci No: [250542008]
 * Tarih: [25.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

public class ÖğrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Adinizi girin");
        String ad = input.nextLine();


        System.out.print("Soyadi girin");
        String soyad = input.nextLine();

        System.out.print("Öğrenci numaraznızı girin");
        String numarazn = input.nextLine();

        System.out.print("Yaşınızı girin");
        String yas = input.nextLine();

        System.out.println("GPA (0.00-4.00); ");
        float gpa = input.nextFloat();

        System.out.println("*-*ÖĞRENCİ BİLGİLERİ*-*");
        System.out.printf("Ad Soyad: %s %s",ad,soyad);
        System.out.printf("\nÖğrenci No: %d",numarazn );
        System.out.printf("\nYas: %d",yas);
        System.out.printf("\nGPA: % .2f",gpa);




    }
}
