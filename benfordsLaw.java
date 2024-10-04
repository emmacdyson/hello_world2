
import java.util.Arrays;

public class benfordsLaw{
    public static void main(String[] args) {

        System.out.println(Arrays.toString(generateRandomNums(1000)));
    //     double[] arr = new double[9];
    //     int num = 0;
    //     //generates 1000 random ints [100-999]
    //     //gets the hundreds digit and stores in array
    //     for (int i = 0; i < 1000; i++) {
    //         num = (int) (Math.random() * (999-100+1) + 100);
    //         int hundredDigit = num/100;
    //         arr[hundredDigit-1] += 1;
    //     }

        
    //     for (int i = 0; i < arr.length; i++) {
    //         //find percentages of each digit
    //         arr[i]  = Math.round((double) arr[i] * 100 / 1000); //should be a percentage 
    //     }
    //     //visualizing proportions - one * per percent
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i]; j++) {
    //             System.out.print(i+1 + ";*");
    //         }
    //         System.out.println();
    //     }
    // } 
    
    // //second part
    // public static void proportion(){
    //     int[] arr = new int[9];
    //     int num = 1;
    //     for(int i = 0; i < 1000; i++) {
    //         num = (int) (num * 1.1);
    //         if (num >= 10) {
    //             num = num/10;
    //         }
    //         arr[num-1] += 1;
    //     }

    }

    public static int[] generateRandomNums(int num){
        //generates 1000 random ints [100-999]
        //gets the hundreds digit and stores in array
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * (999-100+1) + 100); 
        }
        return arr;
    }

    // public static void printPercentages(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         //find percentages of each digit
    //         arr[i]  = Math.round((double) arr[i] * 100 / 1000); //should be a percentage 
    //     }
        
    //     System.out.println(Arrays.toString(arr));
    // }

    
    


    
}