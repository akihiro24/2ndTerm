public class Number3 {
    
    //No. 3 Given Array
    static int arr1_3[] = {1,2,9,3,4};
    static int arr2_3[] = {1,2,3,4,-9};
    static int arr3_3[] = {-1,0,3,-4,-5};
    
    public static void main(String[] args) throws Exception {

    //No. 3
    System.out.println("Number 3:");
    System.out.println("The sum of this array is: " + sum(arr1_3));
    System.out.println("The sum of this array is: " + sum1(arr2_3));
    System.out.println("The sum of this array is: " + sum2(arr3_3));
    }

    //No 3 Method
    static int sum(int[] sums1){
        int sum = 0;
        int i;

        for (i = 0; i < sums1.length; i++)
        sum += arr1_3[i];

        return sum;
        }

        static int sum1(int[] sums1){
            int sum = 0;
            int i;

            for (i = 0; i < sums1.length; i++)
            sum += arr2_3[i];

            return sum;
        }

        static int sum2(int[] sums1){
            int sum = 0;
            int i;

            for (i = 0; i < sums1.length; i++)
            sum += arr3_3[i];

            return sum;
        }
}
