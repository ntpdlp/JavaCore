package basic.syntax.classinnernested;

class Out{
    int y = 20;
    public void display(){
        class InnerLocal{
            int x = 5;
            public void show(){
                System.out.println("x + y: " + (x+y));
            }
        }
        InnerLocal innerLocal = new InnerLocal();
        innerLocal.show();
    }
}


//class in a block or method
public class ParentNestedLocalClass {
    public static void main(String[] args) {
        Out a = new Out();
        a.display();
    }
}
