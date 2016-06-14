// Link http://www.hackerrank.com/challenges/extra-long-factorials
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int numberInput = scanner.nextInt();
    BigInteger bigNumber = BigInteger.valueOf(numberInput);
    long auxNumber = numberInput - 1;
    BigInteger bigAuxNumber = BigInteger.valueOf(auxNumber);
    BigInteger bigSubtract = new BigInteger("1");    
    while(auxNumber > 0){

      bigNumber = bigNumber.multiply(bigAuxNumber);



      auxNumber--;
      bigAuxNumber = bigAuxNumber.subtract(bigSubtract);

    }

    System.out.println(bigNumber);

  }

}
