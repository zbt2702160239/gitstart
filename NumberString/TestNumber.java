package NumberString;

public class TestNumber {
    public static void main(String[] args) {
        int i=5;
        Integer it=new Integer(i);
        int i2=it.intValue();
        System.out.println(it instanceof Number);
        Integer it2=i;//直接把基本类型转换为封装类型
        int i3=it;//直接把封装类型转换为基本类型
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Double d1=new Double(2.111);
        byte b1=0x1;
        Byte b2=new Byte(b1);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        String str=String.valueOf(i);
        Integer it3=i;
        System.out.println(str instanceof String);
        String str1=it.toString();
        System.out.println(str1 instanceof String);
        String str2="999";
        int it4=Integer.parseInt(str2);
        System.out.println(it4);
        double d2=3.14;
        Double d3=d2;
        String str3=d3.toString();
        System.out.println("转换为字符串"+str3);
        double d4=Double.parseDouble(str3);
        System.out.println("转换为浮点"+d4);
    }
}
