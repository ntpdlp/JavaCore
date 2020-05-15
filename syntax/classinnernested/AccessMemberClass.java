package basic.syntax.classinnernested;

public class AccessMemberClass {
    private String outerText = "I am outer";
    public class InnerClass{
        public String innerText = "I am inner";
        public void printInner(){
            System.out.println(innerText);
            System.out.println(outerText);
        }
    }

    public void printOuter(){
        InnerClass myInner = new InnerClass();
        myInner.printInner();
    }

    public static void main(String[] args) {
        //access 1
        AccessMemberClass obj = new AccessMemberClass();
        obj.printOuter();

        //access 2
        InnerClass innerClass = new AccessMemberClass().new InnerClass();
        innerClass.printInner();
    }
}
