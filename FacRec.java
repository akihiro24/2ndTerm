//Factorial Recursive Function

public class RecFac {
    public static void main(String[]args){
        int num = 5;
        int Fac;
        
        Fac = Fac(num);
        System.out.println("The Factorial of: " + num + " is " + Fac);
    }
    public static int Fac(int num){
        if (num==1)
        return 1;
        return num*Fac(num-1);
    }q
    
}
