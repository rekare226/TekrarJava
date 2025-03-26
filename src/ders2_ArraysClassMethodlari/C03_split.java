package ders2_ArraysClassMethodlari;

import ders1_Arrays.C09_EnUzınVeEnKısaKelimeBulma;

public class C03_split {
    public static void main(String[] args) {

      String str="java gun gectikce daha da guzellesiyor";

      String [] kelimeler=str.split(" ");
      String enUzun=kelimeler[0];
      String enKisa=kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length()<enKisa.length()){

                enKisa=kelimeler[i];
            }


            if (kelimeler[i].length()>enUzun.length()){

                enUzun=kelimeler[i];
            }
        }

        System.out.println("en uzun kelime :" +enUzun);//en uzun kelime :guzellesiyor
        System.out.println("en kısa kelime :" +enKisa);//en kısa kelime :da

        C09_EnUzınVeEnKısaKelimeBulma.enKisaEnUzunKelimeYazdir(kelimeler);//en uzun kelime :guzellesiyor
        //en enkısa kelime :da




    }
}
