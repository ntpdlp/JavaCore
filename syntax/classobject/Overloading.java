package basic.syntax.classobject;

public class Overloading {

    private int x;
    private int y;

    Overloading(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Overloading: FunctionName || Parameters
    public int add(){
        return x+y;
    }
    public int add(int z){
        return x + y + z;
    }

    public double add(double z){
        return x + y + z;
    }

    public static void main(String[] args) {
        Overloading ol = new Overloading(1,2);
        System.out.println(ol.add());
        System.out.println(ol.add(3));
        System.out.println(ol.add(5.0));
    }

}
