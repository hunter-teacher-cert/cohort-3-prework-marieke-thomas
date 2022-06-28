import java.io.*;
import java.util.*;

public class Sieve{
  public static void main(String[] args){
    System.out.println("Hello world");
    sieve(20);
  }
  public static boolean[] sieve(int n){
    int[] isPrime = new int[n];
    for (i=0; i<n; i++){
      isPrime[i] = true;
    }
    isPrime[0] = false;
    isPrime[1] = false;
    int limit = (int)Math.sqrt(n) + 1;
    for (i=2; i<limit; i++){
      System.out.println(i);
    }
  }
}