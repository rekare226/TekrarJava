package ders1_Arrays;

import java.util.Arrays;

public class C05_TumElementleriArtirma {

    public static void main(String[] args) {

      //verilen bir int arrayin
      //tum elementlerini 2 artirin

      int [] arr={3,7,0,2,4,6};

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=2;

        }

        System.out.println(Arrays.toString(arr)); //[5, 9, 2, 4, 6, 8]

        //verilen bir int array'in
        //tum elemanlarını verilen sayi kadar artırıp bize donduren bir method olusturun




    }


    public static int [] arrayiVerilenSayiKadarArtir(int [] aray,int artisSayi){

        for (int i = 0; i < aray.length; i++) {

            aray[i]+=artisSayi;

        }



return aray;


    }



}
