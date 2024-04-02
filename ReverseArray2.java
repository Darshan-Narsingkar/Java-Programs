public class ReverseArray2 {
    public static void main(String args[]){
        int array[] = {12,88,25,69,45,76,36,56,11,33,46};

        System.out.print("Original array is given by : ");
        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println();


        System.out.print("Reversed array is given by : ");
        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
    