package basic.syntax.classinnernested;

public class ParentNestedStaticMemberClass {
    static public String x = "outer";

    static class StaticInnerClass{
        static String y = "inner";

        public static void staticFunc(){
            System.out.println("i am static function " + x);
        }

        public void nonstaticFunc(){
            System.out.println("i am non-static func " + y);
        }
    }

    public void outerFunc(){
        System.out.println("i am outer function ");
    }

    public static void main(String[] args) {
        new ParentNestedStaticMemberClass().outerFunc();

        StaticInnerClass.staticFunc();
        new StaticInnerClass().nonstaticFunc();

    }
}
