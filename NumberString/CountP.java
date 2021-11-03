package NumberString;

public class CountP {
    static String str="peter piper picked a peck of pickled peppers";

    public static void main(String[] args) {
        System.out.println(countP(str));
    }
    public static int countP(String str){
        char[] carray=str.toCharArray();
        int count=0;
        for(int i=0;i< carray.length;i++){
            if(carray[i]=='p'&&(i==0||carray[i-1]==' ')){
                count++;
            }
        }
        return count;
    }
}
