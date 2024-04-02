import java.util.Scanner;
public class Palindrome2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the palindrome of given number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
    
        public static boolean isPalindrome(int n){
            int rev = 0;
            int original = n;
            while(n > 0){   
                
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10; 
            }
            return original == rev;


        } 
        
    }

