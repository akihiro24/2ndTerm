// public class App {  

//     static int arr1_3[] = {1,2,9,3,4};
//     static int arr2_3[] = {1,2,3,4,-9};
//     static int arr3_3[] = {-1,0,3,-4,-5};

//     public static void main(String[] args) throws Exception {

//         //No. 1
//         System.out.println("Number 1:");
//         int arr1[] = {1,1,2,3,1};
//         System.out.println(arraySeq123(arr1));
//         int arr2[] = {1,1,2,4,1};
//         System.out.println(arraySeq123(arr2));
//         int arr3[] = {1,1,2,1,2,3};
//         System.out.println(arraySeq123(arr3));

//         //No. 2
//         System.out.println("");

//         System.out.println("Number 2:");
//         int arr1_2[] = {1,2,9,3,4};
//         System.out.println(first4(arr1_2));
//         int arr2_2[] = {1,2,3,4,9};
//         System.out.println(first4(arr2_2));
//         int arr3_2[] = {1,2,3,4,5};
//         System.out.println(first4(arr3_2));

//         //No. 3
//         System.out.println("");

//         System.out.println("Number 3:");
//         System.out.println("The sum of this array is: " + sum(arr1_3));
//         System.out.println("The sum of this array is: " + sum1(arr2_3));
//         System.out.println("The sum of this array is: " + sum2(arr3_3));
        
//     }
    
//         //No 1 Method
//         public static boolean arraySeq123(int[] numbers) {
//             for(int i = 0; i < numbers.length - 2; i++) {
//                if(numbers[i] == 1 && numbers[i + 1] == 2 && numbers[i + 2] == 3){
//                    return true;
//                }
//             }
//             return false;
//         }

//         //No 2 Method
//         public static boolean first4(int[] numbers1) {
//             return (numbers1[0] == 9 || numbers1[1] == 9 || numbers1[2] == 9 || numbers1[3] == 9);
//         }

//         //No 3 Method
//         static int sum(int[] sums1){
//         int sum = 0;
//         int i;

//         for (i = 0; i < sums1.length; i++)
//         sum += arr1_3[i];

//         return sum;
//         }

//         static int sum1(int[] sums1){
//             int sum = 0;
//             int i;

//             for (i = 0; i < sums1.length; i++)
//             sum += arr2_3[i];

//             return sum;
//         }

//         static int sum2(int[] sums1){
//             int sum = 0;
//             int i;

//             for (i = 0; i < sums1.length; i++)
//             sum += arr3_3[i];

//             return sum;
//         }

// }

        



