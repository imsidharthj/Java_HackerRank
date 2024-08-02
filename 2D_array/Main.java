import java.util.*;
import java.math.*;
public class Main {

    public static void main(String[] args){
        // String[][] alphabet = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

        // for (int i = 0; i<alphabet.length; i++){
        //     for (int j = 0; j<alphabet[i].length; j++){
        //         System.out.print(alphabet[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int[][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };
        int result = hourglass(arr);
        System.out.println(result);
    }
    public static int hourglass(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < columns - 2; j++) {
                int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                              + arr[i+1][j+1]
                              + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum; // Return the maximum sum found
    }
}