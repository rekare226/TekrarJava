package ders4_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayListOlusturma {
    public static void main(String[] args) {

        //içine String elementler koyabileceğimiz bir ArrayList olusturun

        String [] arr=new String[2];

        arr[0]="Ali";
        arr[1]="Veli";

        System.out.println(Arrays.toString(arr)); //[Ali, Veli]

        String [] arr1={"Ali","Veli"}; //buda array oluşturmada ikinci yöntemdir


        //ŞİMDİ LİST E GECELİM

       // List<String> isimler=new List<>() //List' is abstract; cannot be instantiated


        List<String> isimler=new ArrayList<>();
        List<String> isimler1=new ArrayList<String>(); //Stringin gri olmasının seebebi bunu yapmana gerek yok deniyor...

        // içine integer elementler  koyabileceğimiz sayilar isminde bir ArrayList yapalım

       //List<int> sayilar=new ArrayList<>();//Type argument cannot be of primitive type

        List<Integer> sayilar=new ArrayList<>();

        //Listeye 3,6,8 ve 9 ekleyin

        sayilar.add(3);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(9);

        System.out.println(sayilar); //[3, 6, 8, 9]

        // listenin 3. indeksine element olarak 2 ekleyin
        sayilar.add(3,2);//[3,6,8,2,9]
        sayilar.add(1,5);//[3,5,6,8,2,9]

        //element olarak 3,4,5,6,2,3,4,2,3,4,5,4,7,8,9 bulunduran bir ArrayList olusturun

        List<Integer> sayilarYeni=new ArrayList<>(Arrays.asList(3,4,5,6,2,3,4,2,3,4,5,4,7,8,9));
        //ekleyeceklerimiz başta belli ise bu yöntemi kullanırız...Arrays.asList kullanılır..















    }
}
