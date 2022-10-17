import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        
    }
    public static void printArray(ArrayList<Integer> a){
        System.out.println(a);
    }
    public static ArrayList<Integer> printReverseArray(ArrayList<Integer> a){
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i ++){
            b.add(a.get(a.size() - i - 1));
        }
        return b;
    }
    public static int sumArrayList(ArrayList<Integer> a){
        int b = 0;
        for (int i = 0; i < a.size(); i ++){
            b += a.get(i);
        }
        return b;
    }
    public static int avgArrayList(ArrayList<Integer> a){
        int b = 0;
        int avg = 0;
        for (int i = 0; i < a.size(); i ++){
            b += a.get(i);
        }
        avg = b/a.size();
        return avg;
    }
    public static int largest (ArrayList<Integer> a){
        int max = 0;
        Collections.sort(a, Collections.reverseOrder());
        max = a.get(0);
        return max;
    }
    public static int secondLargest (ArrayList<Integer> a){
        int secondLargest = 0;
        Collections.sort(a, Collections.reverseOrder());
        secondLargest = a.get(1);
        return secondLargest;
    }
    public static int smallest (ArrayList<Integer> a){
        int min = 0;
        Collections.sort(a);
        min = a.get(0);
        return min;
    }
    public static ArrayList<Integer> addNumber (ArrayList<Integer> a, int b){
        a.add(b);
        return a;
    }
}
