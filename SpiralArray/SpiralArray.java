import java.util.*;

public class SpiralArray{
  

  public static void print(int[][] matrix){
    for(int r = 0; r < matrix.length; r++){
      for(int c = 0; c < matrix[0].length; c++){
        System.out.print(java.lang.String.format("%02d", matrix[r][c]));
        System.out.print(" ");
      }
      System.out.println("");
    } 
  }
  private static void printRowr(int[][] matrix, int row, int start, int end){
   for(int i = start; i >= end; i--){
     System.out.print(matrix[row][i] + " ");
   }
  } 
  private static void printColr(int[][] matrix, int col, int start, int end){
   for(int i = start; i >= end; i--){
     System.out.print(matrix[i][col] + " ");
   }
  }
  private static void printRow(int[][] matrix, int row, int start, int end){
   for(int i = start; i <= end; i++){
     System.out.print(matrix[row][i] + " ");
   }
  } 
  private static void printCol(int[][] matrix, int col, int start, int end){
   for(int i = start; i <= end; i++){
     System.out.print(matrix[i][col] + " ");
   }
  }

  private static void spiralPrint(int[][] matrix){
    int rHead = 0, cHead = 0, rTail = matrix.length-1, cTail = matrix[0].length-1, r = 0, c = 0; 
    printRow(matrix,rHead,cHead,cTail); 
    rHead++;
    printCol(matrix,cTail,rHead,rTail);
    cTail--;
    printRowr(matrix,rTail, cTail, cHead);
    rTail--;
    printColr(matrix,cHead, rTail, rHead);
    cHead++;
    printRow(matrix,rHead,cHead,cTail); 
    rHead++;
    printCol(matrix,cTail,rHead,rTail);
    cTail--;
    printRowr(matrix,rTail, cTail, cHead);
    rTail--;
    printColr(matrix,cHead, rTail, rHead);
    cHead++;
    printRow(matrix,rHead,cHead,cTail); 
    rHead++;
    printCol(matrix,cTail,rHead,rTail);
    cTail--;
    printRowr(matrix,rTail, cTail, cHead);
    rTail--;
    printColr(matrix,cHead, rTail, rHead);
    cHead++;
    printRow(matrix,rHead,cHead,cTail); 
    rHead++;
    printCol(matrix,cTail,rHead,rTail);
    cTail--;
    printRowr(matrix,rTail, cTail, cHead);
    rTail--;
    printColr(matrix,cHead, rTail, rHead);
    cHead++;
 

        
  }
  public static void main(String[] args){
    int[][] matrix = new int[5][7];
    int i = 0;
    for(int r = 0; r < matrix.length; r++){
      for(int c = 0; c < matrix[0].length; c++){
        matrix[r][c] = i;
        i++;
      }
    }
    print(matrix);

    spiralPrint(matrix);
  }
}
