package basic.syntax.classobject;

/*
   shallow clone: use super.clone() ~ Object.clone() for built-in DataType
   deep clone: use for user-defined object : a Address, a Student, a Employee, a ShoppingCart, ...
 */

//deep clone() for user-defined object
class Address implements Cloneable{
    private int zipCode;
    private String state;

    Address(int zipCode, String state){
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return "zipCode: " + zipCode + " , state: " + state;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address myAddress = (Address) super.clone(); //shallow clone
        return myAddress;
    }
}

public class CloneDeep implements Cloneable {
    private String name;
    private Address homeAddress;

    CloneDeep(String name, Address address){
        this.name = name;
        this.homeAddress = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "CloneShallow{" +
                "name='" + name + '\'' +
                ", homeAddress=" + homeAddress +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneDeep myObj = (CloneDeep) super.clone(); //shallow clone
        myObj.homeAddress = (Address)this.homeAddress.clone(); // deep clone
        return myObj;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDeep student1 = new CloneDeep("Adnan",new Address(52556,"Iowa"));
        CloneDeep student2 = (CloneDeep) student1.clone();
        CloneDeep student3 = (CloneDeep) student1.clone();
        student2.setName("Vo");
        student3.setHomeAddress(new Address(32746,"Florida"));
        // print out
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
