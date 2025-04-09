package ders3_MultiDimensionalArrays;

           public class C04_SonElementlerinToplami {
           public static void main(String[] args) {

               //verilen 2 katlı bir array de
               // her bir inner array'in son elementlerinin toplamını yazdiran
               //method olusturun


          int [][] arr={{2,3,7,1,2},{3,5,1,2},{4,1,2},{1,2,3,6,8,1,2},{2}};


           sonElementleriTopla(arr);//son elementlerin toplamı : 10





    }

    public static void sonElementleriTopla(int [][] arr){

       int toplam=0;

        for (int i = 0; i < arr.length; i++) {

          toplam+=arr[i][arr[i].length-1];

        }

        System.out.println("son elementlerin toplamı : "+ toplam);



    }
}
