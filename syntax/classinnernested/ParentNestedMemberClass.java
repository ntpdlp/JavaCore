package basic.syntax.classinnernested;

//this is Parent class
public class ParentNestedMemberClass {
    private String str = "";
    private class MemberClass{
        private int interval = 5;

        @Override
        public String toString(){
            return "I am nested class: member class, my val is " + interval;
        }
    }

    ParentNestedMemberClass(String str){
        this.str = str;
        MemberClass memberClass = new MemberClass();

        System.out.println(str);
        System.out.println(memberClass.toString());
    }

    public static void main(String[] args) {
        ParentNestedMemberClass myTest = new ParentNestedMemberClass("outer1");
    }
}
