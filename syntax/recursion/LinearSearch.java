package basic.syntax.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        Object[] objs1 = {2,5,9,10,30,55,100};
        Object[] objs2 = {"Java", "Javascript","TestNG","Selenium"};

        System.out.println("found: " + linearSearch(objs1,10));
        System.out.println("found: " + linearSearch(objs1,600));
        System.out.println("found: " + linearSearch(objs2,"TestNG"));

    }

    public static int linearSearch(Object[] objs, Object target){
        return search(objs,target,0);
    }

    public static int search(Object[] objs, Object target, int pos){
        if(pos == objs.length){
            return -1; // ko tim thay
        }else if(objs[pos].equals(target)){
            return pos;
        }else{
            return search(objs,target,pos+1);
        }
    }
}
