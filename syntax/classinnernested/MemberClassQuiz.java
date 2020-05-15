package basic.syntax.classinnernested;

public class MemberClassQuiz {
    private int x = 0;

    class innerClass{
        public int x = 1;

        public void printValue(int val){
            System.out.println(val);
            System.out.println("this.x: " + this.x);
            System.out.println("parent.x: " + MemberClassQuiz.this.x);
        }
    }

    public static void main(String[] args) {
        MemberClassQuiz outer = new MemberClassQuiz();
        MemberClassQuiz.innerClass inner = outer.new innerClass();
        inner.printValue(57);
    }
}
