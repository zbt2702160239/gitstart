package NumberString;

import java.lang.reflect.Method;

public class MathMethod {
    public static void main(String[] args) {
        float f1=5.4f;
        float f2=5.5f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));
        int count=0;
//        for(int i=2;i<=10000;i++){
//            if(primeNumber(i)){
//                count++;
//            }
//        }
//        System.out.println("总共有质数"+count);
        int year=2020;
        System.out.format("%d%n",year);
        System.out.format("%8d%n",year);//右对齐
        System.out.format("%-8d%n",year);//左对齐
        System.out.format("%08d%n",year);//补0
        System.out.format("%0,8d%n",year*10000);//千位分割
        //小数点
        System.out.format("%.2f%n",Math.PI);
    }
    public static boolean primeNumber(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
