package NumberString;
import java.util.Arrays;
public class UpperCaseFirst {
    static String str="let there be light";
    public static String toUpCaseFirst(String str){
        char[] carray=str.toCharArray();
        carray[0]=isUpCase(carray[0]);
        for(int i=1;i< carray.length;i++){
            if(carray[i-1]==' '){
                carray[i]=isUpCase(carray[i]);
            }
        }
        return String.copyValueOf(carray);
    }
    public static char isUpCase(char c){
       return Character.toUpperCase(c);
    }

    public static void main(String[] args) {
        System.out.println(toUpCaseFirst(str));
    }
}
