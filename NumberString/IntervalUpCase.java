package NumberString;

public class IntervalUpCase {
    static String str="lengendary";
    static public String toIntervalUpCase(String str){
        char[] carray=str.toCharArray();
        for(int i=0;i< carray.length;i++){
            if(i%2==0){
                carray[i]=Character.toUpperCase(carray[i]);
            }
        }
        return String.copyValueOf(carray);
    }

    public static void main(String[] args) {
        System.out.println(toIntervalUpCase(str));
    }
}
