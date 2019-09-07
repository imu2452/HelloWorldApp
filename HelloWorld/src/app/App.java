package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("半の場合は[1]、丁の場合は[２]を入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String param = input;
        int img = Integer.parseInt(param);

        int dice1 = dice();
        int dice2 = dice();

        int judge = dice1 + dice2;

        if (judge % 2 == 0) {
            System.out.println("予想 : 丁");
            System.out.println("結果 : " + dice1 + "," + dice2 + "の丁");
        } else {
            System.out.println("予想 : 半");
            System.out.println("結果 : " + dice1 + "," + dice2 + "の半");
        }
    }

    static int dice() {
        Random rnd = new Random();
        int d = rnd.nextInt(6) + 1;
        return d;

    }

}