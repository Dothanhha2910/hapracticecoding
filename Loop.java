import java.util.Arrays;
import java.lang.String;

public class Loop {
    public static void main(String[] args) {
        
    }
    public static void ascending(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void descending(int[] array){
        int [] newArray = new int [array.length];
        int j = array.length - 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[j - i];
        }
    }

}
