package basic.syntax.recursion;

public class temp {
    public static void main(String[] args) {
        xMethod(12345);
    }
    public static void xMethod(int n){
        if(n>0){
            System.out.println(n%10);
            xMethod(n/10);
        }
    }
}
