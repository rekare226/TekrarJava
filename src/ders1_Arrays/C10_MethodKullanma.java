package ders1_Arrays;

import java.util.Arrays;

public class C10_MethodKullanma {
    public static void main(String[] args) {


   int [] arr={3,6,7,3,5,1};
  arr= C05_TumElementleriArtirma.arrayiVerilenSayiKadarArtir(arr,4);
        System.out.println(Arrays.toString(arr));//[7, 10, 11, 7, 9, 5]

        arr=C05_TumElementleriArtirma.arrayiVerilenSayiKadarArtir(arr,1);

        System.out.println(Arrays.toString(arr));//[8, 11, 12, 8, 10, 6]


        System.out.println(C06_PozitifElementlerinToplami.pozitifSayilariTopla(arr));//55=[8,+ 11,+ 12,+ 8, +10, +6]

        int [] kullaniciArr=C08_KullaniciyaArrayOlusturma.IntarrayOlustur();

        System.out.println(Arrays.toString(kullaniciArr));

    }
}
