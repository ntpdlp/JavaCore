package basic.syntax.recursion;

public class PrintStringReverse {
    public static void main(String[] args) {
        printCharsReverse("toc");
    }

    public static void printCharsReverse(String str){
        if(str.compareTo("")==0 || str == null){
            System.out.println("");;
        }else{
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }
}
