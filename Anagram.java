//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Anagram {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first string: ");
//        String str1 = scanner.nextLine();
//
//        System.out.print("Enter the second string: ");
//        String str2 = scanner.nextLine();
//
//        if (areAnagrams(str1, str2)) {
//            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
//        } else {
//            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
//        }
//
//        scanner.close();
//    }
//
//    // Function to check if two strings are anagrams
//    public static boolean areAnagrams(String str1, String str2) {
//        // Remove spaces and convert to lowercase for case-insensitive comparison
//        str1 = str1.replaceAll("\\s", "").toLowerCase();
//        str2 = str2.replaceAll("\\s", "").toLowerCase();
//
//        // Check if the lengths are the same
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        // Convert strings to character arrays and sort them
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray2);
//
//        // Compare the sorted character arrays
//        return Arrays.equals(charArray1, charArray2);
//    }
//}


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter second String : ");
        String str2 = sc.nextLine();

        if (areAnagram(str1,str2)){
            System.out.println("Given strings are Anagrams.");
        }
        else{
            System.out.println("Given strings are not Anagrams.");
        }

        sc.close();
    }
    public static boolean areAnagram(String s1 , String s2)
    {

         s1 = s1.toLowerCase().replaceAll("","");
         s2 = s2.toLowerCase().replaceAll("","");

        if(s1.length() != s2.length())
        {
            return false;
        }

        char[] charArrays1 = s1.toCharArray();
        char[] charArrays2 = s2.toCharArray();

        Arrays.sort(charArrays1);
        Arrays.sort(charArrays2);

        return Arrays.equals(charArrays1,charArrays2);

    }

    }
