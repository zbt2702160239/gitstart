package NumberString;

public class UpCaseLastTwo {
    static String str="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";

    public static void main(String[] args) {
        System.out.println(returnSentence(str,"two"));
    }
    static public int SearchLast(String sentence,String word){
        char[] csarray=sentence.toCharArray();
        char[] cwarray=word.toCharArray();
        int index=-1;
        for(int i= csarray.length-1,j= cwarray.length-1;i>=0;){
            int prei=i;
            while(j>0) {
                if (csarray[i] == cwarray[j]) {
                    i--;
                    j--;
                }else{
                    i=prei;
                    i--;
                    j= cwarray.length-1;
                    break;
                }
            }
            if(j==0){
                return i;
            }
        }
        return index;
    }
    static public String returnSentence(String sentence,String word){
        char[] csarray=sentence.toCharArray();
        int index=SearchLast(sentence,word);
        csarray[index]=Character.toUpperCase(csarray[index]);
        return String.copyValueOf(csarray);
    }


}
