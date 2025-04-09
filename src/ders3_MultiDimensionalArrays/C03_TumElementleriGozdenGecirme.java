package ders3_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_TumElementleriGozdenGecirme {
    public static void main(String[] args) {


        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};

        //arr deki çift sayiların toplamı

        int ciftSayiToplami = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {

                    ciftSayiToplami += arr[i][j];
                }

            }

        }

        System.out.println("arr deki çift sayialrın toplami :" + ciftSayiToplami); //arr deki çift sayialrın toplami :22

//arr deki tek sayilardan en buyuk olanı yazdırın
        int enbuyuk = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 != 0 && arr[i][j] > enbuyuk) {

                    enbuyuk=arr[i][j];


                }


            }

        }

        System.out.println("arraydeki en buyk tek sayi : " + enbuyuk);//7


    //arr deki tum sayıları bir artırın

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]+=1;

            }

        }

        System.out.println(Arrays.deepToString(arr)); //[[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 9]]

        //arr deki tum tek sayiları ve cift sayiları ayrı ayrı toplayıp
        //ciftSayilarToplamı ve teksayılar Toplamını yazdırın

         int tekSayiToplamı=0;
         int ciftSayiToplamı=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){

                    ciftSayiToplamı+=arr[i][j];
                }

                if (arr[i][j]%2!=0){

                    tekSayiToplamı+=arr[i][j];
                }



            }

        }

        System.out.println("teksayiların toplami : "+tekSayiToplamı);//teksayiların toplami : 27
        System.out.println("çiftsayiların toplami : "+ciftSayiToplamı);//çiftsayiların toplami : 28

    }

    }