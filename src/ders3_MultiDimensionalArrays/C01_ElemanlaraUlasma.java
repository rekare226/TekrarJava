package ders3_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_ElemanlaraUlasma {
    public static void main(String[] args) {


        int [][] arr={{2,3,7},{3,5},{4},{1,2,3,6,8}};

        System.out.println(arr[0][2]);//7
        System.out.println(arr[3][3]);//6
        System.out.println(arr[1][0]);//3

        //2 katli bir arrayde inner arrayi yazdirmak istersek

        System.out.println(Arrays.toString(arr[0]));//[2, 3, 7]
        System.out.println(Arrays.toString(arr[2]));//[4]

        //arr[3][1] ini yazdirin
        //önce bunun bir integer mı yoksa array mi olduguna bakmalıyız

        System.out.println(arr[3][1]);//2

        //arr[1] array oldugu için dogrudan yazdılamaz toString gerekir
        System.out.println(Arrays.toString(arr[1]));


        //{{2,3,7},{3,5},{4},{1,2,3,6,8}};

        System.out.println(Arrays.toString(arr));//[[I@5f184fc6, [I@3feba861, [I@5b480cf9, [I@6f496d9f]
        System.out.println(Arrays.deepToString(arr));//[[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]


        /*


         */


    }
}
