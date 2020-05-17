package basic.syntax.stringarray;

import java.util.StringJoiner;

public class StringEqualOperator {

    public static void main(String[] args) {
//        //* 1. == or equals() *//
//        //this is String-Literal: stored in String pool (to improve JAVA performance)
//        //String-Pool is a part of Heap Memory to minimize memory usage
//        String str1 = "abc";
//        String str2 = "abc";
//        //this is String-Object: stored into Heap Memory
//        String str3 = new String("abc");
//        String str4 = new String("abc");
//
//        System.out.println("1." + str1==str2); //true
//        System.out.println("2." + str1.equals(str2)); //true
//
//        System.out.println("3." + str3==str4); //false
//        System.out.println("4." + str3.equals(str4)); //true
//
//        System.out.println("5." + str1 == str3); //false
//        System.out.println("6." + str1.equals(str3)); //true


//        //* 2. sort Strings *//
//        System.out.println("negative return because a<b: " + "a".compareTo("b"));
//        System.out.println("positive return because c>b: " + "c".compareTo("b"));
//        System.out.println("zero return because a=a: " + "a".compareTo("a"));

//        //* 3. split by delimiter , using | operator *//
//        String t = "Hello,strings can be fun.They have many uses.";
//        String[] subs = t.split(",| |\\.");
//
//        for(String x:subs) {
//            System.out.println(x);
//        }

        //* 4. StringBuilder is single-threaded *//

        //* StringJoiner *//
        StringJoiner stringJoiners = new StringJoiner(",","[","]");
        stringJoiners.add("Java");
        stringJoiners.add("Javascript");
        stringJoiners.add("Selenium");
        System.out.println(stringJoiners.toString());
    }

}
