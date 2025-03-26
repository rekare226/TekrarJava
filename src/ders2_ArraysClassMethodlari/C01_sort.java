package ders2_ArraysClassMethodlari;

import java.util.Arrays;

public class C01_sort {
    public static void main(String[] args) {

String [] isimler={"Metin","Mete","metehan","Mikail","Nevzat","Yasar"," yakup","Yaman"};

//array'i natural order a göre duzenleyip yazdirin


        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[ yakup, Mete, Metin, Mikail, Nevzat, Yaman, Yasar, metehan]

        /*
        not 1- Biz bu isimler arrayini naturel ordere göre yazdırdığımızda yakup ilk sırada çıktı çünkü
        yakup un önünde sonradan fark ettiğğmiz boşluk var şimdi o boşluğu düzelterek tekrar yazdıralım;

         */

        String [] isimler1={"Metin","Mete","metehan","Mikail","Nevzat","Yasar","yakup","Yaman"};
        Arrays.sort(isimler1);
        System.out.println(Arrays.toString(isimler1)); //[Mete, Metin, Mikail, Nevzat, Yaman, Yasar, metehan, yakup]


        /*
        Burda ise doğru sıralama yaptı ve ascı degerlerine göre sıralama yaptı...ascı tabloya göre
         buyuk harflerin matematiksel değeri kucuk harlarden daha az olduğu için sıralama da
         ilk onlar sıralandı daha sonra kucuk harfleri kendi içerisinde sıralayarak sonlara koydu...


         */

       String str ="java candir";

        System.out.println(str.toUpperCase()); //str ın degeri değişmeden sadece bu satır için  JAVA CANDIR oldu
        System.out.println(str);//java candir yazacaktir...ki bu sadece Strinde ait özelliktir
        // ki bu Stringin ımmutable olması ile ilgilidir
        //array ve arraylistte method ile yapılan değişikilikler kalıcı olur




    }
}
