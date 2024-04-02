// import java.util.Arrays;

// public class MissingNoInArray {
//     public static void main(String[] args) {
//         int[] numbers = {1,2,3,5,6,7};

//         int missingNumber = findMissingNumber(numbers);
//         System.out.println("The missing number is: " + missingNumber);
//     }

//     public static int findMissingNumber(int[] nums) {
        
//         Arrays.sort(nums);

        
//         if (nums[0] != 1) {
//             return 1;
//         }


//         if (nums[nums.length - 1] != nums.length + 1) {
//             return nums.length + 1;
//         }

//         for (int i = 1; i < nums.length; i++) {
//             int expectedNum = nums[i - 1] + 1;
//             if (nums[i] != expectedNum) {
//                 return expectedNum;
//             }
//         }
//         return -1;
//     }
// }


public class MissingNoInArray{
    public static void main(String args[]){
        int array[] = {1,2,4,5,6,7,8};
        int missingNo = FindMissingNo(array);
        System.out.print("The missing number is : "+missingNo);
    }

    public static int FindMissingNo(int nums[]){
        int actualSum = 0;
        int n = nums.length +1;
        int totalSum = n*(n+1)/2;
        for(int num : nums){
            actualSum = actualSum + num;
        }
        return totalSum - actualSum;
    }

}
