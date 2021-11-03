package NumberString;

public class MyStringBuffer implements IStringBuffer{
    int capacity=16;
    int length=0;
    char[] value;
    public MyStringBuffer(){
        value=new char[capacity];
    }
    public MyStringBuffer(String str){
        char[] carray=str.toCharArray();
        this.length=carray.length;
        if(capacity< carray.length)
            capacity=carray.length*2;
        value=new char[capacity];
        System.arraycopy(carray,0,value,0,length);
    }
    @Override
    public void append(String str) {

    }

    @Override
    public void append(char c) {

    }

    @Override
    public void insert(int pos, char c) {

    }

    @Override
    public void insert(int pos, String s) {
        if(pos>0||pos>=length)
            return;
        if(s==null)
            return;
        if(length+s.length()>capacity){
            capacity=(int)(length+s.length()*1.5f);
            char[] newValue=new char[capacity];
            System.arraycopy(value,0,newValue,0,length);
            value=newValue;
        }
        char[] carray=s.toCharArray();
        System.arraycopy(value,pos,value,carray.length,length-pos);
        System.arraycopy(carray,0,value,pos,carray.length);
        length=length+carray.length;
    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {
        if(start<0||start>length)
            return;
        if(end<0||end>length)
            return;
        if(start>=end)
            return;
        System.arraycopy(value,end,value,start,length-end);
        length=length-(end-start);
    }
    public String toString(){
        char[] carray=new char[length];
        System.arraycopy(value,0,carray,0,length);
        return new String(carray);
    }

    @Override
    public void reverse() {
        for(int i=0;i<length/2;i++){
            char temp=value[i];
            value[i]=value[length-i-1];
            value[length-i-1]=temp;
        }
    }

    @Override
    public int length() {
        return this.length;
    }

    public static void main(String[] args) {
        MyStringBuffer msb=new MyStringBuffer("12312132132132123333333333333333333333333");
        System.out.println(String.copyValueOf(msb.value));
        msb.reverse();
        System.out.println(String.copyValueOf(msb.value));
        MyStringBuffer sb=new MyStringBuffer("there light");
        sb.insert(0,"let");
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
    }
}
