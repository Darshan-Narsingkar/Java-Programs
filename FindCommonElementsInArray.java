public class FindCommonElementsInArray {
    public static void main(String args[]){
        int arr1[] = {1 ,5 ,8 ,4 ,6 ,78,45};
        int arr2[] = {2,8,5,78,69,35,25,4};

        for(int i =0; i < arr1.length ; i++){
            for(int j =0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+ " ");
                }
            }
        }
    }
}
