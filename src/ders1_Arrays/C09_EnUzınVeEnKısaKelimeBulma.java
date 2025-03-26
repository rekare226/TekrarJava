package ders1_Arrays;

public class C09_EnUzınVeEnKısaKelimeBulma {
    public static void main(String[] args) {

        //Verilen String bir array'deki
        //en uzun ve en kısa kelimeleri yazdirin

        String [] isimler={"hamza","esra","serat","ali","cansu","ramazan","ibrahim","can","yasemin"};






    }

    public static void enKisaEnUzunKelimeYazdir(String [] isimler){



        String enUzun=isimler[0];
        String enKısa=isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length()<enKısa.length()){

                enKısa=isimler[i];
            }

            if (isimler[i].length()>enUzun.length()){

                enUzun=isimler[i];
            }
        }

        System.out.println("en uzun kelime :"+enUzun);
        System.out.println("en enkısa kelime :"+enKısa);




    }
}
