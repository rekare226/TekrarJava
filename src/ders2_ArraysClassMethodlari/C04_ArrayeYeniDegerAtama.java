package ders2_ArraysClassMethodlari;

import java.util.Arrays;

public class C04_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

int [] sayilar={3,5,10};

String [] isimler={"Ali","Hasan"};

 // sayilar arrayine 4. deger olarak 8 ekleyin
// sayilar[3]=8;//IndexOutOfBoundException


//sayilar arrayine {3,5,6,8}

int [] sayilarYeni={3,5,6,8};

sayilar=sayilarYeni;

System.out.println(Arrays.toString(sayilar));//[3, 5, 6, 8]

//isimler array'ine {"Ali", "Veli", "Can"} arrayini atayın

String [] isimlerYeni=new String[isimler.length+1];//[null,null,null]
isimlerYeni[0]=isimler[0];
isimlerYeni[1]=isimler[1];
isimlerYeni[2]="Can";

isimler=isimlerYeni;

        System.out.println("isimler arrayinin yenihali "+ Arrays.toString(isimlerYeni)); //BURDA YAPTIKLARIMIZ ARRAYE YENİ DEĞER ATAMADIR......












    }
}
