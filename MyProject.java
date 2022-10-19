import java.util.Scanner;

public class MyProject {
    public static void main(String[] args) {
         //derslerimizi ele alalım
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımlama işlemi
        Scanner input = new Scanner(System.in);

        //kullancıdan dersler için değerlerimizi sorgulayacağız
        System.out.print("Matematik notu : ");
        mat = input.nextInt();

        System.out.print("Fizik notu :");
        fizik = input.nextInt();

        System.out.print("Kimya notu :");
        kimya = input.nextInt();

        System.out.print("Turkce notu :");
        turkce = input.nextInt();

        System.out.print("Tarih notu :");
        tarih = input.nextInt();

        System.out.print("Müzik notu :");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6;
        System.out.println("Ortalamanız :" + ortalama);

        boolean gecti= (ortalama>=50);
        boolean kaldi= (ortalama<50);
        String durumunuz= (gecti)? "Sınıfı geçti":"Sınıfta kaldı";
        System.out.print(durumunuz);




    }
}
