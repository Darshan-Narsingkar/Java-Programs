// import java.util.Scanner;

// public class Fibonacci2 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to find the terms");
//         int n = sc.nextInt();
//         int first = 0;
//         int second = 1;
        
//         for(int i = 0;i<n;i++)
//         { 
//             System.out.print(first+" ");
//             int next = first + second;
//             first = second;
//             second = next;
        
//         }
//     }
// }


import java.util.Scanner;
public class Fibonacci2{
    public static void main(String args[]){
        int num = 15;
        int a = 0;
        int b = 1;
        int nextTerm;

        System.out.print(a+ " "+b+ " ");
        for(int i = 2;i <num; i++){
            nextTerm = a+ b;
            a = b;
            b = nextTerm;
           
            System.out.print(nextTerm+ " ");
        }
    }
}

