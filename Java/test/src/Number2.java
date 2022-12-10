public class Number2 {
    public static void main(String[] args) throws Exception {

    //No. 2
    System.out.println("Number 2:");
    int arr1_2[] = {1,2,9,3,4};
    System.out.println(first4(arr1_2));
    int arr2_2[] = {1,2,3,4,9};
    System.out.println(first4(arr2_2));
    int arr3_2[] = {1,2,3,4,5};
    System.out.println(first4(arr3_2));
    }

    //No 2 Method
    public static boolean first4(int[] numbers1) {
        return (numbers1[0] == 9 || numbers1[1] == 9 || numbers1[2] == 9 || numbers1[3] == 9);
    }

}


