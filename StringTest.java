
public class StringTest {
    public static void main(String[] args) {
        
    }
    public static String addString(String a, String b){
        return a + b;
    }
    public static boolean checkRevere(String a, String b){
        char ch;
        String reverse = "";
        for (int i = 0; i < a.length(); i++){
            ch = a.charAt(a.length()-i-1);
            reverse += ch;
        }
        return b.equals(reverse);
    }
    public static boolean checkNumberInString(String a){
        char [] ch = a.toCharArray();
        boolean check = true;
        for (int i = 0; i < ch.length; i++){
            if (Character.isDigit(i)){
                check = true;
            }
            else
            {
                check = false;
            }
        }
        return check;    
    }
    public static int countDigit(String a){
        int count = 0;
        char [] ch = a.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (ch[i] == 'u' || ch[i] == 'e' || ch[i] == 'o' || ch[i] == 'a' || ch[i] == 'i'){
                count++;
            }

        }
        return count;
    }
    
}
