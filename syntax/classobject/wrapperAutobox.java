package basic.syntax.classobject;

public class wrapperAutobox {
    public static void main(String[] args) {
        String num1 = "15";
        String num2 = "5";

        Integer n1 = Integer.parseInt(num1);
        Integer n2 = Integer.parseInt(num2);

        System.out.println("Add is: " + (n1.intValue()+n2.intValue()));
        System.out.println("Sub is: " + (n1.intValue()-n2.intValue()));
        System.out.println("Mul is: " + (n1.intValue()*n2.intValue()));
        System.out.println("Div is: " + (n1.intValue()/n2.intValue()));
    }
}
