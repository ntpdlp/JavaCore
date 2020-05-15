package basic.syntax.classinnernested;

public class MemberClassAccess {
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
        MemberClassAccess obj = new MemberClassAccess();
        obj.printOuter();

        //access 2
        InnerClass innerClass = new MemberClassAccess().new InnerClass();
        innerClass.printInner();
    }
}
