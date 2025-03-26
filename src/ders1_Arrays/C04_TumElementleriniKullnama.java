package ders1_Arrays;

public class C04_TumElementleriniKullnama {
    public static void main(String[] args) {

    int [] sayilar={4,7,1,3,4,8,0,1};

    //sayilar arrayinin tum elementlerini yan yana yazdırın

        for (int i = 0; i < sayilar.length; i++) {

            System.out.print(sayilar[i]+" ");//4 7 1 3 4 8 0 1 burdaki yazımda sonuçlar artık arrey değil

        }

//sayılar arryindeki tüm elementlerin toplamını yazdırın
        System.out.println("");
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar[i];

        }

        System.out.println("sayilar arrayindeki sayıların toplamı : "+ toplam); //28

        //sayilar arryindeki çift sayıların carpımını yazdırın

        int sayilarCarpimi=1;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]%2==0){

                sayilarCarpimi*=sayilar[i];
            }

        }
        // int [] sayilar={4,7,1,3,4,8,0,1};
        System.out.println("sayilar arrayindeki sayıların carpimi : "+ sayilarCarpimi);//0

    }
}
