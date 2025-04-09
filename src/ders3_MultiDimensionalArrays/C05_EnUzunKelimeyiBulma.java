package ders3_MultiDimensionalArrays;

public class C05_EnUzunKelimeyiBulma {
    public static void main(String[] args) {

        String [][] arr={{"Ali","okula","git"},{"Merhabalar","arkadaslar"},{"Bu","is","olacak"}};
  //iki katlı arraydeki en uzun kelimeyi bulun

//tum elementleri gozden gecirecek miyiz

        String enUzunKelime=""; //yada arr yin ilk kelime de secilebilirdi

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].length()>enUzunKelime.length())

                    enUzunKelime=arr[i][j];


            }

        }


        System.out.println("arraydeki en uzun kelime :"+enUzunKelime);//arraydeki en uzun kelime :Merhabalar



    }

}
