Ad Soyad:Mustafa Şahingöz
Öğrenci No:250542008



import  java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Daire yaricapini girin cm");
        double yaricap = input.nextDouble();

        //pi değişkenini tanımlama
        float p = 3.14f;1


        //matimatiksel işlemler

        System.out.println("SONUÇLAR");
        System.out.println("-------------");


        double alan = p * Math.pow(yaricap,2);
        System.out.printf("Daire Alanı: %.2f cm^2%n" ,alan);

        double cevre =2 * p * yaricap;
        System.out.printf("Daire Çevresi: %.2f cm%n",cevre);

        double cap = 2 * yaricap;
        System.out.printf("Daire Çapı: %.2f cm%n",cap);

        double kure_hacmi = 4.0 / 3.0 * p * Math.pow(yaricap,3);
        System.out.printf("Küre Hacmi: %.2f cm^3%n",kure_hacmi);

        double kure_yuzey_alanı = 4 * p * Math.pow(yaricap,2);
        System.out.printf("Küre Yüzey Alanı: %2f cm^2%n",kure_yuzey_alanı );
    }
}

