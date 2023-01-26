package _HomeWorks_;

import java.util.ArrayList;
import java.util.Collections;

public class _08_Odev8_12Aralik {
    public static void main(String[] args) {

        // 1- Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        //Bütün 2'leri 6'yla değiştirin. Array'i yazdırınız.

        int[][] numbers = {
                {2, 3, 2}, {4, 1, 5}, {7, 2, 5}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]==2)
                    numbers[i][j]=6;
                System.out.print(numbers[i][j]+"\t");

            }
        }

        //---------------------------------------------------------------------------------------------------//

        // 2-Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        //2D array'de olan elemanları toplayınız. toplamı yazdırınız. Sonuç 32 olmalıdır.

        int[][] nmr={
                {5,2,1} , {10,2,3,6} , {1,2}
        };
        int toplam=0;
        for (int i = 0; i < nmr.length; i++) {
            for (int j = 0; j < nmr[i].length; j++) {
                System.out.print(nmr[i][j]+"\t");
                toplam=toplam+nmr[i][j];
            }
        }
        System.out.println("toplam = " + toplam);

        //---------------------------------------------------------------------------------------------------//

        // 3-Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"} ,
        //{"Pittsburgh" ,"ohio","new york","ohio"} ,
        //{"ohio","new york"}]
        //Bütün ohio'ları Florida'yla değiştiriniz. Array'i yazdırınız.
        String[][] states={
                {"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"},
        };
        for (int i = 0; i < states.length; i++) {
            for (int j = 0; j < states[i].length; j++) {
                if (states[i][j]=="ohio")
                    states[i][j]="florida";
                System.out.println("changed= " + states[i][j]);
            }
        }

        //---------------------------------------------------------------------------------------------------//

        // 4- Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:** //**Girdi:**
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                list.add(arr[i][j]);
            }
        }
        System.out.println(list);

        //---------------------------------------------------------------------------------------------------//

        // 5- ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı. ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin; ArrayList = Orange , Kiwi , Peach , Banana , Orange
        // String Orange: Count = 2 olmalı. (Orange 2 kez yazılmış)

        String[] meyveler={"Orange","Kiwi","Peach","Banana","Orange"};
        String meyve="Orange";

        System.out.println("Meyve Sayısı"+getCount(meyveler,meyve));
    }
    public static int getCount(String[] meyveler, String meyve) { // dönecek tip
        int counter=0;
        for (int i = 0; i < meyveler.length; i++) {
            if (meyve==meyveler[i])
                counter++;
        }
        return counter;
    }

    //---------------------------------------------------------------------------------------------------//

    // 6- getSum() isminde bir method oluşturun. Parametresi ArrayList olmalı. Return tipi int olmalı.
    //ArrayList teki tüm sayıları birbiri ile toplayın. return olarak toplam sonucu döndürün.
    //Örneğin; Arraylist = 1,2,3,4,5. Return 15 olmalı

    {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);

        System.out.println("list1 = " + list1);

        System.out.println("getSum(list1) = " + getSum(list1));
    }
    public static int getSum(ArrayList<Integer> list1) {
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum = sum + list1.get(i);
        }
        return sum;
    }

    //---------------------------------------------------------------------------------------------------//




    }

