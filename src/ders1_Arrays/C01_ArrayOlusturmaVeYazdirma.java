package ders1_Arrays;

import java.util.Arrays;

public class C01_ArrayOlusturmaVeYazdirma {

    public static void main(String[] args) {
        //şimdiye kadar yani 5. haftaya kadar öğrendiğimiz
        // data türleri 1 variableye 1 deger ataması yapılabiliyordu....
        //ancak java gibi kompleks uygulamalar geliştirmeye uygun bir programlama dilinde
        // birden fazla eleman barındırabilen yapılara  da ihtiyac vardır..

        //işte burda aynı data türünden birden fazla değişken ile işlem yapıldığında array ler kullanılır..
        //arrayler elementlerden olusur
        //

        int [] arr=new int [5];
        //burdaki int array data türündeki arr nin içine konulacak elementlerin data türüdür....
        //arrayle de lenght sabittir değiştirilemez...5 rakamı arrayde kaç  adet eleman olacağını belirler ve belirlemek zorundayız...

        //bir arraye 2 sekilde deger atanabilir
        //A- int [] arr ={1,3,8,23,99} ; bu direk değer atamadır...her nekadar baştan length demesek
        // de koyduğumuz eleman sayısı lengt kabul edilir
        //B-Uzunluğu belirtilerek olusturulur ama elemanlara deger ataması yapılmaz..örneğin bir sınıf oluşturuldu ve
        //20 ogrencinin hepsi hazır olmaz  ogrenci geldikçe ekleme yapılır...
        //diyelim ki biz int 5 adet element olacak bir array oluşturualım ama deger atamayalım
        //burda default olarak int 5 element olacağı için java bunlara 0,0,0,0,0 atar...
        //arraydeki lenght bir method degil uzunluğu tutan bir variabledir bu nedenle yanında parantez () yoktur


        //  ====================== PRATIK BASLIYOR==============================

        // 4 int deger koyabileceğimiz sayilar arrayini olusturun
        int [] sayilar=new int [4]; //[0,0,0,0]

        // 5 isim deger koyabileceğimiz isimler arrayini olusturun

        String [] isimler=new String[5];//[null,null,null,null,null]

        //2 boolean deger koyabileceğimiz bir array oluşturun

        Boolean [] dogruYanlis=new Boolean[2]; //[false,false]

       // icinde 56,67,23,97 degerlerinin oldugu notlar arry i olusturun

        int [] notlar={56,67,23,97};

        // icinde mevsim isimlerinin olduğu mevsimler  arrayı oluşturun

        String [] mevsimler={"ilkbahar","yaz","sonbahar","kıs"};

        // icinde mevsim isimlerinin olduğu mevsimler Atama  arrayı oluşturun

        String [] mevsimAtama=new String[4];
        mevsimAtama[0]="İlkbahar";
        mevsimAtama[1]="Yaz";
        mevsimAtama[2]="Sonbahar";
        mevsimAtama[3]="Kıs";
        System.out.println(Arrays.toString(mevsimAtama));//[İlkbahar, Yaz, Sonbahar, Kıs]

        //notlar arrayindeki 23 u yazdırın
        System.out.println(notlar[2]);//23
       //mevsimlerdek kışı yazdır
        System.out.println(mevsimler[3]);//kıs

        //sayılar arrayindeki ilk elementi yazdırın
        System.out.println(sayilar[0]);//0
        //isimler arrayindeki 2. elementi yazdırın
        System.out.println(isimler[1]);

        //int [] notlar={56,67,23,97};
        //notlar arrayindeki ilk elementi yazdırın
        System.out.println(notlar[0]);//56
        //isimler arrayindeki 2. elementi yazdırın
        System.out.println(isimler[1]);//null

        //notlar arrayindeki  2. sayiyı 45 yapın
        notlar[1]=45;
        //isimler arrayinin ilk ismi olarak Mahmut atayın
        isimler[0]="Mahmut";

        //mevsimler arrayine 5.mevsim olarak tatil mevsimini ekleyelim

        String [] mevsimler2=new String[5];

        for (int i = 0; i < mevsimler.length; i++) {

            mevsimler2[i]=mevsimler[i];

        }

       mevsimler2[4]="tatil";

        System.out.println(Arrays.toString(mevsimler2)); //[ilkbahar, yaz, sonbahar, kıs, tatil]


        //isimler arrayini yazdıralım

        System.out.println(Arrays.toString(isimler));//[Mahmut, null, null, null, null]

        //sayilar arrayini yazdırın

        System.out.println(Arrays.toString(sayilar));


    }
}

