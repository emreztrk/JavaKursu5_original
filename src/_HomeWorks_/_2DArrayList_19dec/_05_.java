package _HomeWorks_._2DArrayList_19dec;

import java.util.ArrayList;

public class _05_ {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                numbers.add(arr[i][j]);
            }
        }
        System.out.println(numbers);


    }
}
