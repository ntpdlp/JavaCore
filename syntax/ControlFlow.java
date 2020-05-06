package basic.syntax;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please give a int number: ");
        int val = in.nextInt();
        switch (val){
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("Even");
                break;
            default:
                System.out.println("Odd");
        }
    }
}
