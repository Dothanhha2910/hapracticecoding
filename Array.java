import java.util.Arrays;
import java.lang.String;

public class Array {
    public static void main(String[] args) {
        
    }
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void printReverseArray(int[] array){
        int[] newArray = new int [array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[j - i];
        }
        System.out.println(Arrays.toString(newArray));

    }
    public static int sumOfElement(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }    
        return sum;
    }
    public static int averageOfElement(int[] array){
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }    
        avg = sum/array.length;
        return avg;
    }
    public static int largest(int[] array){
        Arrays.sort(array);
        return array[array.length - 1];
    }
    public static int secondlargest(int[] array){
        Arrays.sort(array);
        return array[array.length - 2];
    }
    public static int smallest(int[] array){
        Arrays.sort(array);
        return array[0];
    }


    public static void checkMagicSquare1(int[][] array){
      
        // int row [] = new int[array[0].length]; 
        int rowSums[] = new int[array.length];
        for(int row=0; row<array[0].length; row++){
            int rowSum = 0;
            for(int col=0; col<array.length; col++){
            rowSum += array[row][col];
          }
          rowSums[row] = rowSum;
        } 
        //TODO: follow this for loop using the example above to see where it goes wrong
        int colSums[] = new int[array.length];
        for(int row=0; row<array[0].length; row++){
          int colSum = 0;
          for(int col=0; col<array.length; col++){
            colSum += array[col][row];
          }
          colSums[row] = colSum;
        }
        // let me quy hoach
        // create array column where each element is the sum of a column. Do a for loop here
        // ok start
        // create array column where each element is the sum of a column
        int diagonal1 = 0;
        int diagonal2 = 0;
        for(int row = 0; row < array.length; row++){
            if (array.length - row - 1 < 0){
              break;
            } else {
              diagonal1 += array[row][row];
              diagonal2 += array[array.length - row - 1][array.length - row -1];
            }   
          }
        // compare all elements in array colSums to the first element
        String checkInvalidCol = " ";
        for(int q=0; q<colSums.length; q++){
          if(colSums[q] != colSums[0]){
            checkInvalidCol += "Invalid magic square";
          }
        }
        String checkInvalidRow = " ";
        for(int q=0; q<rowSums.length; q++){
          if(rowSums[q] != rowSums[0]){
            checkInvalidRow += "Invalid magic square";
          }
        }
        if (checkInvalidCol.equals("Invalid magic square") || checkInvalidRow.equals("Invalid magic square")){
          System.out.println("Invalid magic square");        
        }
        else if (diagonal1!=diagonal2){
          System.out.println("Invalid magic square");
        }
        else if (colSums[0]!=rowSums[0] || colSums[0]!=diagonal1){
          System.out.println("Invalid magic square");
        }
        else {
          System.out.println("Valid magic square");
        }
    }
    public static int sum2Array2D(int[][] array1, int[][] array2){
        int sum1 = 0;
        int sum2= 0;
        for (int row = 0; row < array1.length; row++){
            for (int col = 0; col < array1[row].length; col++){
                sum1 += array1[row][col];
            }
        }
        for (int row = 0; row < array2.length; row++){
            for (int col = 0; col < array2[row].length; col++){
                sum2 += array2[row][col];
            }
        }
        return sum1 + sum2;
    }
    public static int sumArray2D(int[][] array){
        int sum = 0;
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                sum += array[row][col];
            }
        }
        return sum;
    }
    public static void diagonal(int[][] array){
        int [] diagonal1 = new int[array.length];
        int [] diagonal2= new int[array.length];

        for (int row = 0; row < array.length; row++){
            if (array.length - row - 1 < 0){
                break;
            } else {
                diagonal1[row] = array[row][row];
            }
        }
        for (int row = array.length - 1; row > 0; row--){
            diagonal2[row] = array[row][row];
        }
        System.out.println(Arrays.toString(diagonal1));
        System.out.println(Arrays.toString(diagonal2));
    }
    public static int [][] transpose(int[][] array){
        int [][] transpose = new int[array[0].length][array.length];
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                transpose[col][row] = array[row][col];
            }
        }
        return transpose; 
    }
    public static int [][] reverse(int[][] array){
        int [][] reverse = new int[array.length][array[0].length];
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                reverse[array.length - 1 - col][array.length - 1 - row] = array[col][row];
            }
        }
        return reverse; 
    }
    public static long multiply2Array2D(int[][] array1, int[][] array2){
        long multiply1 = 1;
        long multiply2= 1;
        for (int row = 0; row < array1.length; row++){
            for (int col = 0; col < array1[row].length; col++){
                multiply1 *= array1[row][col];
            }
        }
        for (int row = 0; row < array2.length; row++){
            for (int col = 0; col < array2[row].length; col++){
                multiply2 *= array2[row][col];
            }
        }
        return multiply1*multiply2;
    }

}

    

    

