import java.util.*;
public class MergeSort implements Sort{
  public int[] sort(int[] a){
    return mergesort(a,0,a.length);
  }

  static int[] mergesort(int[] a, int l, int r){
    if(l+1<r){
      int m = (l+r)/2;
      return (merge(mergesort(a, l, m), mergesort(a,m+1,r)));
    }
    return Arrays.copyOfRange(a, l, r);
  }

  static int[] merge(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    int l=0, r=0, i=0;
    System.out.println("MERGING:");
    printArray(a);
    printArray(b);
    while(l<a.length && r<b.length){
      if(a[l]<b[r]){
        c[i] = a[l];
        l++; i++;
      }else{
        c[i] = a[r];
        r++; i++;
      }

    }
    return c;
  }
  static void printArray(int[] a){
    System.out.println();
    for(int i=0; i<a.length;i++){
      System.out.print(a[i]+", ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int[] a = {3,5,8,3,5,7,9,3,5,6,7,3,4,2};
    a = mergesort(a,0,a.length);
    printArray(a);
  }
}
