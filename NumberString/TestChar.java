package NumberString;
import java.util.Scanner;
import java.util.Arrays;

public class TestChar {
    public static void main(String[] args) {
        char c1='a';
        char c2='1';
        char c3='中';
        Character c=c1;//自动装箱
        c1=c;//自动拆箱
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isDigit('z'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('z'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('z'));
        System.out.println("使用空格无法达到对齐效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");
        System.out.println("使用\\t可以达到对齐效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");
        System.out.println("一个\\t制表符长度8");
        String a= "ASBCad";
        char[] carray=a.toCharArray();
        System.out.println("转换以后"+Arrays.toString(carray));
        for(int i=0;i< carray.length;i++){
            if(carray[i]>='a'&&carray[i]<='z');
            else System.out.print(carray[i]);

        }
        System.out.println();
        int x=0;
        String s="";
        for(int i=1;i<=5;i++){
            int z=0;
            while(true){
                x=(int)(Math.random()*52)+65;
                if(x<91||x>96){
                    break;
                }
            }
            System.out.println(x);
            s=s+(char)x;
        }
        System.out.println(s);
    }
}
