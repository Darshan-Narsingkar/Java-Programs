import java.util.Scanner;
public class CountOddEvenNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i =0; i < size ; i++){
            System.out.print("Enter element"+(i +1)+ " : ");
            array[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int num : array){
            if(num % 2 == 0){
                evenCount ++;
            }
            else{
                oddCount ++;
            }
        }

        System.out.print("Number of even numbers : "+evenCount);
        System.out.println();
        System.out.print("Number of odd numbers  : "+oddCount);
    }
}