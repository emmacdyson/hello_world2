import java.util.Arrays;
public class BenfordsLaw2{
    public static void main(String[] args) { 
        
        // //System.out.println(Arrays.toString(generateRandomNums(1000)));
        // int[] arr = {100,100,100,100,222,245,356,343,444,406,405,500,500,600};
        
        // System.out.println(Arrays.toString(getCounts(arr)));


        // int[] counts = {0,4,2,2,3,2,1,0,0,0};
        // //0, .285, .148, .142....
        // System.out.println(Arrays.toString(getPercentages(counts)));

        // System.out.println(getLeadingDigit(42));
        // System.out.println(getLeadingDigit(1.5));
        // System.out.println(getLeadingDigit(100003.6));

        // double[] array = generateExpNums(1.1,1000);
        // int[] intArr = getLeadingDigits(array);
        // int[] count = getCounts(intArr);
        // double[] percentages = getPercentages(count);
        // System.out.println(Arrays.toString(percentages));

        //first part
        int[] randomNums = generateRandomNums(1000); //generates 1000 random ints [100-999] and stores in randomNums array
        int[] counts = getCounts(randomNums); //gets the counts of the amount of each leading digit
        System.out.println(Arrays.toString(counts));
        double[] percentages = getPercentages(counts); //gets the percentages of each leading digit
        System.out.println(Arrays.toString(percentages));
        printStars(percentages); //prints proportions with stars

        //second part
        double[] array = generateExpNums(1.1, 1000); //generates 1000 numbers that start at 1 and each get multiplied by 1.1
        int[] intArr = getLeadingDigits(array); //gets the leading digit and puts into array
        int[] count = getCounts(intArr); //gets the count of each leading digit
        System.out.println(Arrays.toString(count));
        double[] percentage = getPercentages(count); //gets the percentages
        System.out.println(Arrays.toString(percentage)); 
        printStars(percentage); //prints proportions w stars

        //how proportions change if you increase the number you are generating: 
        //when you decrease the numbers you are generating, the 






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

    public static int[] getCounts(int[] arr){
        int[] counts = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = getLeadingDigit(arr[i]);
            counts[num]++;
        }
        return counts;
    }

    public static double[] getPercentages(int[] counts){
        int total = 0;
        for (int i = 0; i < counts.length; i++) {
            total+= counts[i];
        }
        double[] percentages = new double[10];
        for (int j = 0; j < counts.length; j++) {
            //outputting as a decimal 
            percentages[j] = counts[j]/ (double) total * 100;
        }
        return percentages;
    }

    public static int getLeadingDigit(double num) {
        String number = "" + num;
        return Integer.parseInt(number.substring(0,1));
    }

    public static double[] generateExpNums(double factor, int length) {
        double[] randomNums = new double[length];
        randomNums[0] = 1;
        for (int i = 1; i < length; i++) {
            randomNums[i] = randomNums[i-1] * factor;
        }
        return randomNums;
    }

    public static int[] getLeadingDigits(double[] arr) {
        int[] toRet = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            toRet[i] = getLeadingDigit(arr[i]);
        }
        return toRet;
    }

    public static void printStars(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (int) arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}