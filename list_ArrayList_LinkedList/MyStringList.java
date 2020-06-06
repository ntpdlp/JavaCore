package basic.list_ArrayList_LinkedList;

import java.util.Arrays;

public class MyStringList {
    private static final int INIT_SIZE = 2;
    private String[] myStrs;
    private int mySize;

    MyStringList(){
        myStrs = new String[INIT_SIZE];
        mySize=0;
    }

    public void add(String s){
        if(myStrs.length == mySize) resize();
        myStrs[mySize] = s;
        mySize = mySize + 1;
    }

    public String[] resize(){
        int newSize = mySize*2;
        String[] temp = new String[newSize];
        temp = Arrays.copyOf(myStrs,newSize);
        myStrs = temp;
        return myStrs;
    }

    public void printMyList (){
        for(int i = 0; i<myStrs.length; i++){
            System.out.println(myStrs[i] + " ");
        }
    }

    public static void main(String[] args) {
        MyStringList strs = new MyStringList();
        strs.add("hello");
        strs.add("welcome");
        strs.add("selenide");
        strs.add("selenium");

        strs.printMyList();
    }
}
