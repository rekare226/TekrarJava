package ders2_ArraysClassMethodlari;

import java.util.Arrays;

public class C05_ArrayeYeniElemanEkleme {
    public static void main(String[] args) {

        int [] sayilar={3,5,6};
        //sayilar arrayine 4. eleman olarak 8 i ekleyin

        int [] sayilar1=new int [4];
        sayilar1 [0]=sayilar [0];
        sayilar1 [1]=sayilar [1];
        sayilar1 [2]=sayilar [2];
        sayilar1 [3]=8;

        sayilar=sayilar1;

        System.out.println("isimler arrayinin yenihali "+ Arrays.toString(sayilar)); //[3, 5, 6, 8]
//sayilar arrayine 8 ekle

        arrayeElemanEkle(sayilar,8);
        System.out.println(Arrays.toString(sayilar)); //[3, 5, 6, 8]




    }

    public static int []  arrayeElemanEkle(int [] Liste,int eklenecekSayi){


        int [] sayilar1=new int [Liste.length+1];

        for (int i = 0; i <Liste.length ; i++) {

            sayilar1[i]=Liste[i];

        //[3,5,6,2,1,0]
        }

        sayilar1[sayilar1.length-1]=eklenecekSayi;


       return Liste;
    }
}
