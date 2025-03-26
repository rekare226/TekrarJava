package ders1_Arrays;

public class C02_Length {

    public static void main(String[] args) {

    String str= "Calismak ne güzel";
    int [] arr={3,5,7,9,1,2};

    //str'deki karakter sayisini yazdirin
        System.out.println(str.length());
    // arr deki element sayisini yazdirin
        System.out.println(arr.length);
    //str nin son karakteriniz yazdırın
        System.out.println(str.charAt(str.length() - 1));//l
        System.out.println(str.substring(str.length() - 1));//l
        //arr nin son elementini yazdırın
        System.out.println(arr[arr.length - 1]);//2
        //str nin sondan 3. karakterini yazdirin
        System.out.println(str.charAt(str.length() - 3));//z
        System.out.println(str.substring(str.length() - 3));//zel
        System.out.println(str.substring(str.length() - 3,str.length() - 2));//z

        //arr nin sondan 3. elementini yazdırın

        System.out.println(arr[arr.length - 3]);//9





    }
}
