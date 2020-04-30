package basic.syntax;

import java.util.Scanner;

public class OperatorTerary {

    public static void main(String[] args) {
        //2|3 arguments
        boolean wantToStop = false;
        Scanner in = new Scanner(System.in);
        while(!wantToStop){
            System.out.println("Do you want 2|3 parameters or 0 to exit: ");
            int parameters = in.nextInt();
            if(parameters==2){
                System.out.println("Enter first number: ");
                int first = in.nextInt();
                System.out.println("Enter second number: ");
                int second = in.nextInt();
                System.out.println("max is: " + (first>second?first:second));
            }else if(parameters ==3){
                System.out.println("Enter first number: ");
                int first = in.nextInt();
                System.out.println("Enter second number: ");
                int second = in.nextInt();
                System.out.println("Enter third number: ");
                int third = in.nextInt();
                System.out.println("max is: " + (first>second?(first>third?first:third):(second>third?second:third)));
            }else{
                wantToStop = true;
            }
        }
    }
}
