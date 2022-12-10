public class Number1 {
    
    public static void main(String[] args) throws Exception {

        //No. 1
        System.out.println("Number 1:");
        int arr1[] = {1,1,2,3,1};
        System.out.println(arraySeq123(arr1));
        int arr2[] = {1,1,2,4,1};
        System.out.println(arraySeq123(arr2));
        int arr3[] = {1,1,2,1,2,3};
        System.out.println(arraySeq123(arr3));
    }

    //No 1 Method
    public static boolean arraySeq123(int[] numbers) {
        for(int i = 0; i < numbers.length - 2; i++) {
           if(numbers[i] == 1 && numbers[i + 1] == 2 && numbers[i + 2] == 3){
               return true;
           }
        }
        return false;
    }
    
}
