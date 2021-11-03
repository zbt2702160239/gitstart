package NumberString;
import java.util.Arrays;
public class CompareString {
    public static void main(String[] args) {
        String str1="legend";
        String str4="legend";//从内存角度是同一个
        String str5="Legend";
        String str2=str1;//只改变了引用
        String str3=new String(str1);//全新的对象
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1.equalsIgnoreCase(str5));//忽略大小写
        String str6="the light";
        String start="the";
        String end="lght";
        System.out.println(str6.startsWith(start));
        System.out.println(str6.endsWith(end));
        String[] strs=new String[100];
        for(int i=0;i< strs.length;i++){
            String s="";
            for(int c=0;c<2;c++) {
                int x;
                while(true){
                    x=(int)(Math.random()*52)+65;
                    if(x<91||x>96){
                        break;
                    }
                }
                s+=(char)x;
            }
            strs[i]=s;
        }
        for(int i=1;i<= strs.length;i++){
            System.out.print(strs[i-1]);
            System.out.print(" ");
            if(i%20==0){
                System.out.println();
            }
        }
        String recordString="";
        for(int i=1;i<=strs.length;i++){
            for(int j=1;j<i;j++) {
                if(compareRedundent(strs[j-1], strs[i-1])){
                    recordString+=" "+strs[i-1];
                }
            }
        }
        System.out.println(recordString);
    }

    public static boolean compareRedundent(String word1,String word2) {
        if(word1.equalsIgnoreCase(word2)) {
                return true;
        }
        return false;
    }
}
