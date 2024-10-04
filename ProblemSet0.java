import java.util.ArrayList;
import java.util.Arrays;
public class ProblemSet0{
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        System.out.println(count(a, 3, 4));

        ArrayList<String> b = new ArrayList<>(Arrays.asList("hi", "bye", "sigh", "cry", "lie"));
        clump(b);
        System.out.println(b);

        int[][] mat = {{4, 7, 6},{9, 5, 1},{4, 3, 8}};
        System.out.println(isMagicSquare(mat));

        int[] c = {2,3,10,1,5,7,8};
        System.out.println(median(c));


    }
    //count in range: Accepts an array of integers, a minimum value, and a maximum value as parameters. Returns the count of how many elements from that array fall between the minimum and maximum (inclusive)
    public static int count(int[] arr, int min, int max) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //checks if current element is in specified range
            if (arr[i] >= min && arr[i] <= max) {
                count++; //increment if within range
            }
        }
        return count;
    }
    
    //clump: Accepts ArrayList of strings as a parameter and replaces each pair of strings with a single string that consists of the two original strings in parentheses separated by a space. If the list has odd length (e.g. there are 3 elements), the final element should remain unchanged.
    public static void clump(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            //combines current and next element into single string and replace current element w that string
            list.set(i, "(" + list.get(i) + " " + list.get(i+1) + ")");
            //removes the second part of the string
            list.remove(i+1);
        }
    }

    public static boolean isMagicSquare(int[][] mat) {
        int sum = 0;
        //calculates sum of first row as a reference
        for (int i = 0; i < mat.length; i++) {
            sum += mat[0][i];
        }
        //check sum of all rows and cols
        for (int r = 0; r < mat.length; r++) {
            int rowSum = 0;
            int colSum = 0;
            //calculate sum of each row and col
            for (int c = 0; c < mat[0].length; c++) {
                rowSum+= mat[r][c];
                colSum += mat[c][r];
            }
            //if don't match reference return false
            if (rowSum != sum) {
                return false;
            }
            if (colSum != sum) {
                return false;
            }
        }
        int diagSum1 = 0;
        int diagSum2 = 0;
        //checks sum of diagonals
        for (int i = 0; i < mat.length; i++) {
                diagSum1+= mat[i][i];
                diagSum2 += mat[i][mat.length-1-i];
        }

        if (diagSum1 != sum || diagSum2 != sum) {
            return false;
        }
        return true;
    }

    // //is magic square: Accepts 2D array of ints and returns true if it is a magic square. A square matrix is a magic square if all of its row, column, and diagonal sums are equal
    // public static boolean isMagicSquare(int[][] mat) {
    //     int row = mat.length;
    //     int col = mat[0].length;
    //     int sum1 = 0;
    //     int sum2 = 0;
    //     int sum = 0;

    //     //first row
    //     for (int c = 0; c < col; c++) {
    //         sum1+= mat[0][c];
    //     }
    //     //last row
    //     for (int c = 0; c < col; c++) {
    //         sum2 += mat[row-1][c];
    //     }
    //     if (sum1!=sum2) {
    //         return false;
    //     }
    //     else{
    //         sum = sum1;
    //         sum1 = 0;
    //         sum2 = 0;
    //     }

    //     //first col
    //     for (int r = 0; r < row; r++) {
    //         sum1+= mat[r][0];
    //     }
    //     //last col
    //     for (int r = 0; r < row; r++) {
    //         sum2+=mat[r][col-1];
    //     }

    //     if(sum2!=sum1 || sum1 != sum) {
    //         return false;
    //     }
    //     else {
    //         sum1 = 0;
    //         sum2 = 0;
    //     }

    //     //diagonal 1
    //     for (int i = 0; i < mat.length; i++) {
    //         sum1 += mat[i][i];                                                                              
    //     }
    //     //diagonal 2
    //     for (int i = 0; i < mat.length; i++) {
    //         sum2 += mat[i][mat.length - 1 - i];
    //     }

    //     if(sum2!=sum1 || sum1 != sum) {
    //         return false;
    //     }
    //     return true;
    // }

    //median: Accepts an unsorted array of integers as its parameter and returns the median of the numbers in the array. You are guaranteed that the input array is of odd size (so that one sole element constitutes the median) and that the numbers in the array are between 0 and 99 inclusive
    public static int median(int[] arr) {
        //sort array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length-1; j++) {
                //swap if in wrong order
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //now get median
        return arr[arr.length/2];
    }
}