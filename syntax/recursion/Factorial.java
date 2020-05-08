package basic.syntax.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of 3: " + factorial(3));
    }

    public static int factorial(int n){
        if(n==1 | n ==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
