package ders1_Arrays;

public class C07_ElemanArama {
    public static void main(String[] args) {

   //verilen bir String array de istenen bir
        // elemanın olup olmadığını ve varsa kaç kere kullanıldığını yazdırın

        String [] harfler={"a","d","f","e","a","e","d","a","a","e","a"};
        String arananHarf="i";
        int sayac=0;

        for (int i = 0; i < harfler.length; i++) {

            if (harfler[i].equals(arananHarf)){
                sayac++;

            }

        }



            if (sayac==0){

                System.out.println( arananHarf+ " harf bulunmamaktadır");

            }else System.out.println(arananHarf+" harfi arrayde "+sayac+" adet vardır");





    }
}
