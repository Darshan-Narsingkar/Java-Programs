import java.util.Scanner;

public class ArmstrongNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        System.out.println("Enter the range to find Armstrong numbers (e.g., 1 1000): ");
        int startRange = sc.nextInt();
        int endRange = sc.nextInt();
        findArmstrongNumbersInRange(startRange, endRange);
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int n = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return sum == originalNumber;
    }

    // Function to find Armstrong numbers in a given range
    private static void findArmstrongNumbersInRange(int start, int end) {
        System.out.println("Armstrong numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}



