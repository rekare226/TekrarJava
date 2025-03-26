package ders2_ArraysClassMethodlari;

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

        System.out.println("en uzun kelime :" +enUzun);
        System.out.println("en kısa kelime :" +enKisa);




    }
}
