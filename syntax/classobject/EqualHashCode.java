package basic.syntax.classobject;

class Laptop{
    private String name;
    private String color;

    Laptop(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 57;
        hash = hash + color.hashCode() + name.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Laptop aLaptop = (Laptop)obj;
        if(this.color == aLaptop.color && this.name == aLaptop.name){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class EqualHashCode {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP","black");
        Laptop laptop2 = new Laptop("HP","white");
        Laptop laptop3 = new Laptop("Mac","gray");
        Laptop laptop4 = new Laptop("HP","black");
        Laptop laptop5 = laptop2;

        if(laptop1.equals(laptop4)){
            System.out.println("HP-black == HP-black");
            System.out.println(laptop1.hashCode());
            System.out.println(laptop4.hashCode());
        }else{
            System.out.println("not expected");
        }

        if(laptop1.equals(laptop2)){
            System.out.println("HP-black == HP-white");
        }else{
            System.out.println("HP-black != HP-white");
        }




    }

}
