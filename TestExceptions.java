public class TestExceptions{
    public static void main(String[] args){
        try{
            for( int arr=3; true; arr++ ){
            System.out.println("args["+arr+"]="+args[arr]);
                } 
        }
            catch(ArrayIndexOutOfBoundsException e1){
                System.out.println("Exception");
                System.out.println("caught: " + e1);
            }
                System.out.println("Quitting...");
            

    
    }
}
