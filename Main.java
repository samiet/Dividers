import java.util.*;
import java.io.*;

public class Main {


    private  static void findDividers(int inputNumber) {
        ArrayList<Integer> list = new ArrayList<>();
        double  sqrt;
        sqrt = Math.sqrt(inputNumber);
        for (int i = 1; i <= sqrt; i++) {
            if (inputNumber % i == 0) {
                list.add(i);
                if (i != inputNumber / i)
                    list.add(inputNumber/i);
            }
        }
        for (int i: list
             ) {
            System.out.println(i);
            
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        findDividers(n);
    }
}

