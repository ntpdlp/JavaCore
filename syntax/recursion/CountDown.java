package basic.syntax.recursion;

public class CountDown {
    public static void main(String[] args) {
        countDownNewYear(5);
    }

    public static void countDownNewYear(int num){
        if(num==0){
            System.out.println("Happy New Year !");
        }else{
            System.out.println(num);
            countDownNewYear(num-1);
        }
    }
}
