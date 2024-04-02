// import java.util.*;
// public class FindUniquenoInArray {
//     public static void main(String args[])
//     {
//         int array[] = {1,2,3,4,5,6,2,3,4,6,1,2};
//         Set<Integer> uniqueNumbers = new HashSet<>();

//         for(int num :array){
//             uniqueNumbers.add(num);
//         }

//         System.out.println("Unique Numbers in the array : ");
//         for(int uniqueNo : uniqueNumbers){
//             System.out.println(uniqueNo);
//         }
//     }
// }

import java.util.Scanner;
import java.util.Arrays;
public class FindUniquenoInArray{
    public static void main(String args[]){
        int  array[] = { 1,2,3,4,5,3,4,6,5,2,0,1,2,9,8,10};
        Arrays.sort(array);

        System.out.println("Unique numbers in array : ");
        for(int i = 0;i<array.length;i++){
            if(i==0 || array[i] != array[i-1]){
                System.out.print(array[i] + " ");
            }
        }
    }
}


