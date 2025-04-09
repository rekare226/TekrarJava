package ders3_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_TumElemanlariniToplama {
    public static void main(String[] args) {

        int [] sayilar=new int [4];

        sayilar[0]=3;
        sayilar[1]=6;
        sayilar[2]=9;
        sayilar[3]=1;

        System.out.println(Arrays.toString(sayilar)); //[3, 6, 9, 6]

        //şimdi bu array in tum elemanlarını topalyalım
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {

            toplam+=sayilar[i];

        }

        System.out.println("sayiların toplami :"+toplam);//sayiların toplami :19

         toplam=0;
        int [][] arr={{2,3,7},{3,5},{4},{1,2,3,6,8}};

        for (int i = 0; i < arr.length; i++) { //outer arrayi kontrol eder

            for (int j = 0; j <arr[i].length ; j++) { //inner arrayi kontrol eder

                toplam+=arr[i][j];

            }

        }

        System.out.println("tum elementlerin toplamı :"+toplam);//44


//



    }



    }

