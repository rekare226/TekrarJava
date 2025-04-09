package ders3_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_AyniIndekstekiSayilarıTopla {
    public static void main(String[] args) {

        //verilen iki katlı ve 2 inner array e sahip bir int array de
        //ayni index'e sahip elementleri toplayıp,
        //yeni olusturacagimiz tek katli bir arraye bu toplamları atayın

        //input : int [][] arr ={3,4,5}, {2,3,6,7};
        //output : [5,7,11]

        int [][] arr = {{3,4,5},{2,3,6,7}};

        int ortakIndexSayisi=arr[0].length<arr[1].length ?arr[0].length:arr[1].length;

        int [] ortakToplam=new int[ortakIndexSayisi]; //[0,0,0]

        for (int i = 0; i < ortakToplam.length; i++) {

            ortakToplam[i]=arr[0][i]+arr[1][i];

        }

        System.out.println("ortak indexdeki sayıların toplamı :"+ Arrays.toString(ortakToplam));
        //ortak indexdeki sayıların toplamı :[5, 7, 11]








    }
}
