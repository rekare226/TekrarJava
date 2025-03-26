package ders2_ArraysClassMethodlari;

import java.util.Arrays;

public class C02_BinarySearcIleIstenenElemanıAra {

    public static void main(String[] args) {

      String [] harfler={"d","t","p","k","z"};

      //verilen arr'de a harfinin varlığını kontrol edelim sort yapılmadan bakıldığında yeri sort a göre değişmeyecek
        // olanları doğru bilirken diğerlerini yanlış bulur

        System.out.println(Arrays.binarySearch(harfler,"d"));//0
        System.out.println(Arrays.binarySearch(harfler,"t"));//-5
        System.out.println(Arrays.binarySearch(harfler,"p"));//2
        System.out.println(Arrays.binarySearch(harfler,"k"));//-2
        System.out.println(Arrays.binarySearch(harfler,"z"));//4
        System.out.println(Arrays.binarySearch(harfler,"a"));//-1
        System.out.println(Arrays.binarySearch(harfler,"x"));//-5




      /*
      Arrays.binarySearch () bir array de aranan elementin hangi index'de oldugunu verir
        Ancak..bu methoddan once sort methodu calıştırılmalıdır....

       */

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); //yeni sıralama [d, k, p, t, z]

        System.out.println(Arrays.binarySearch(harfler,"d"));//0
        System.out.println(Arrays.binarySearch(harfler,"t"));//3
        System.out.println(Arrays.binarySearch(harfler,"p"));//2
        System.out.println(Arrays.binarySearch(harfler,"k"));//1
        System.out.println(Arrays.binarySearch(harfler,"z"));//4
        System.out.println(Arrays.binarySearch(harfler,"a"));//-1 olmayanlar içinde olsaydı nerde olurduyu söyler ve olmadığını belirtmek içinde başına eksi koyar ve sıralamayı verir
        System.out.println(Arrays.binarySearch(harfler,"x"));//-5

//bir stringi arraye dönüştürme

      String str="Ali topu at, at Ali at";
      String [] arrVirgül=str.split(",");
      System.out.println(Arrays.toString(arrVirgül));//[Ali topu at,  at Ali at]

      String [] arrSpace=str.split(" ");
      System.out.println(Arrays.toString(arrSpace));//[Ali, topu, at,, at, Ali, at]

      String [] arrHiclik=str.split("");
      System.out.println(Arrays.toString(arrHiclik));//[A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]



    }
}
