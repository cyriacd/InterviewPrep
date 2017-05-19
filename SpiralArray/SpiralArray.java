import java.util.*;

public class SpiralArray{
  

  public static void print(int[][] matrix){
    for(int r = 0; r < matrix[0].length; r++){
      for(int c = 0; c < matrix.length; c++){
        System.out.print(matrix[c][r]);
      }
      System.out.println("");
    } 
  }

  private static void spiralPrint(int[][] matrix){
  
  }

  public static void main(String[] args){
    int[][] matrix = new int[5][7];
    int i = 0;
    for(int r = 0; r < matrix[0].length; r++){
      for(int c = 0; c < matrix.length; c++){
        matrix[c][r] = i;
        i++;
      }
    }
    print(matrix);
  }
}
