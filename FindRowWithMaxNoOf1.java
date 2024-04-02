public class FindRowWithMaxNoOf1{
    public static void main(String args[]){
        int matrix[][] = {
            {0,1,1,0},
            {1,1,0,1},
            {1,1,1,1},
            {1,0,1,0},
        };

        int rowWithMaxOnes = findMaxOnesRow(matrix);
        System.out.println("Row with maximum number of 1's is : "+rowWithMaxOnes);
    }

    public static int findMaxOnesRow(int [][]matrix){
        int maxOnesRow =0;
        int maxCount = 0;

        for(int i = 0; i < matrix.length ;i++){
            int count = 0;
            for(int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j] == 1){
                    count ++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxOnesRow = i;
            }
        }return maxOnesRow;
    }
}
