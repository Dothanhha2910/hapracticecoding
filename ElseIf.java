import java.lang.String;
public class ElseIf {
    public static void main(String[] args) {
        
    }

    public static int compare2(int a, int b){
        int max = 0;
        if (a > b){
            max = a;
        }
        else if (a < b){
            max = b;
        }
        return max;
    }
    public static int compare3(int a, int b, int c){
        int max = 0;
        if (a > b && a > c){
            max = a;
        }
        else if (b > a && b > c){
            max = b;
        }
        else if (c > b && c > a){
            max = c;
        }
        return max;
    }
    public static String oddEven(int a){
        String result = " ";
        if (a%2 == 0){
            result = a + "is even number";
        }
        else if (a%2 != 0){
            result = a + "is odd number";
        }
        return result;
    }
    public static String namNhuan(int year){
        String result = " ";
        if (year%4 == 0){
            result = year + "là năm nhuận";
        }
        else if (year%4 != 0){
            result = year + "không là năm nhuận";
        }
        return result;
    }
    public static int swapWithVariable(int a, int b){
        int c = b;
        b = a;
        a = c;
        return a & b;
    }
    public static int swapWithoutVariable(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        return a & b;
    }
    public static String phuongTrinh(int a, int b, int c){
        if(a == 0){
            throw new IllegalStateException("a cannot be 0");
        }
        String result = " ";
        int x1 = 0;
        int x2 = 0;
        int d = b*b - 4*a*c;
        if (d < 0){
            result = "Phương trình vô nghiệm";
        }
        else if (d == 0){
            x1 = -b/(2*a);
            result = "Nghiệm kép x1 = x2 = " + x1;
        }
        else if (d > 0){
            x1 = (int) ((-b + Math.sqrt(d))/ (2*a));
            x2 = (int) ((-b - Math.sqrt(d))/ (2*a));
            result = "Phương trình có nghiệm là x1 =" + x1 + " x2 = " + x2;
        }
        return result;
    }
}
