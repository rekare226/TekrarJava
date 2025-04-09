package ders1_Arrays;

public class C09_EnUzınVeEnKısaKelimeBulma {
    public static void main(String[] args) {

        //Verilen String bir array'deki
        //en uzun ve en kısa kelimeleri yazdirin

        String [] isimler={"essevler","hamza","esra","serat","ali","cansu","ramazan","ibrahim","can","yasemin","kudema","meridyen"};

        enKisaEnUzunKelimeyiBulYazdir(isimler);

    }

    public static void enKisaEnUzunKelimeyiBulYazdir(String [] isimler){

        String enUzun=isimler[0];
        String enKisa=isimler[0];

        for (int i = 0; i < isimler.length; i++) {

         if (   isimler[i].length()<enKisa.length()){

             enKisa=isimler[i];
         }

            if (   isimler[i].length()>enUzun.length()){

                enUzun=isimler[i];
            }


        }

        System.out.println("en kısa kelime :"+enKisa);
        System.out.println("en uzun kelime :"+enUzun);

    }


    }

