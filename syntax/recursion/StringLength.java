package basic.syntax.recursion;

public class StringLength {
    public static void main(String[] args) {
        int out = countStringLength("JavaCore");
        System.out.println(out);
    }

    public static int countStringLength(String str){
        if(str.compareTo("")==1 || str == null){
            return 0;
        }else{
            String subStr = str.substring(1);
            return 1 + subStr.length();
        }
    }
}
