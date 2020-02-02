import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum=findSum(arr,i,j);
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static int findSum(int[][] arr,int row,int col){
        //Array sum logic
        int sum=arr[row+0][col+0]+arr[row+0][col+1]+arr[row+0][col+2]+
                            arr[row+1][col+1]+
                arr[row+2][col+0]+arr[row+2][col+1]+arr[row+2][col+2];
            return sum;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
