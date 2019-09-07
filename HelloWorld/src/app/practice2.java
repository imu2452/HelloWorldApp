package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practice2 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    String[] param = input.split(" ");

    int num1 = Integer.parseInt(param[0]);
    String calcType = param[1];
    int num2 = Integer.parseInt(param[2]);

    if (calcType.equals("+")) {
      int wa = num1 + num2;
      System.out.println("和 = " + wa);
    } else if (calcType.equals("-")) {
      int sa = num1 - num2;
      System.out.println("差 = " + sa);
    } else if (calcType.equals("*")) {
      int seki = num1 * num2;
      System.out.println("積 = " + seki);
    } else if (calcType.equals("/")) {
      int syou = num1 / num2;
      System.out.println("商 = " + syou + "  余 = " + num1 % num2);
    }
  }
}