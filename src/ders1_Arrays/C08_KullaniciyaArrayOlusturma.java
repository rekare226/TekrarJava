package ders1_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {

    //kullanicidan arrayîn boyutunu ve Integer elementlerini alip
    //array i olusturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen arrayin boyutunu yazınız :");
        int VerilenLength=scanner.nextInt();

        int [] sayilar=new int [VerilenLength];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Arraye eklemek için bir tamsayı giriniz");
            sayilar[i]=scanner.nextInt();

        }

        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5]



    }
    //kullanicidan arrayîn boyutunu ve Integer elementlerini alip
    //array i olusturun ve bize dunduren method olusturun

    public static int [] IntarrayOlustur(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen arrayin boyutunu yazınız :");
        int VerilenLength=scanner.nextInt();

        int [] sayilar=new int [VerilenLength];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Arraye eklemek için bir tamsayı giriniz");
            sayilar[i]=scanner.nextInt();

        }

       return sayilar;
    }


}
