public class CyclicRotateArray {
    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5,6,7,8,9};

        int rotations = 2;
        System.out.println("Original Array : ");
        printArray(array);

        rotateArray(array,rotations);

        System.out.println("\n Array after "+rotations+" right cyclic rotations : ");
        printArray(array);


    }

    static void rotateArray(int arr[],int rotations)
    {
        int length = arr.length;
        int temp[] = new int [length];
        
        for(int  i= 0; i <length ; i++)
        {
            int newPosition = (i+rotations) % length;
            temp[newPosition]= arr[i];
        }
        System.arraycopy(temp, 0,arr,0,length);

    }

    static void printArray(int arr[])
    {
        for(int value : arr)
        {
            System.out.print(value +" ");
        }
        System.out.println();
    }
}

