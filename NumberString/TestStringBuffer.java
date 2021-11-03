package NumberString;

public class TestStringBuffer {
    public static void main(String[] args) {
        String str1="let there";
        StringBuffer sb=new StringBuffer(str1);
        sb.append("be light");
        System.out.println(sb);
        sb.delete(4,10);
        System.out.println(sb);
        sb.insert(4,"there");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuffer sb1=new StringBuffer("wwwwwww");
        long timeStart=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            sb1.append((char)(Math.random()*52+65));
        }
        long timeEnd=System.currentTimeMillis();
        float excTime=(float)(timeEnd-timeStart)/1000;
        System.out.println(sb1.toString());
        System.out.println(timeStart);
        System.out.println("执行时长"+excTime);
        String newstr="wwwwwww";
        long stimeStart=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            newstr+=(char)(Math.random()*52+65);
        }
        long stimeEnd=System.currentTimeMillis();
        float sexcTime=(float)(stimeEnd-stimeStart)/1000;
        System.out.println(newstr);
        System.out.println(stimeStart);
        System.out.println("执行时长"+excTime);
    }
}
