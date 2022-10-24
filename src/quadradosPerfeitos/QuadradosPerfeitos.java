package quadradosPerfeitos;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadradosPerfeitos {
    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        ArrayList<Double> quadradoPerf = new ArrayList<Double>();

        int a = 0; // menor numero de quadrados perfeitos.

        Boolean divPor2 = false;
        Boolean divPor3 = false;

        for (int i = 0; i <= n; i++) {
            if (i * i >= n) {
                break;
            }
            quadradoPerf.add((double) (i * i));
        }

        for (int i = 0; i < (quadradoPerf.size()); i++) {

            if (n / 2d == quadradoPerf.get(i)) {
                divPor2 = true;
                break;
            } else if (n / 3d == quadradoPerf.get(i)) {
                divPor3 = true;
                break;
            }
        }
        if (divPor2) {
            System.out.println("2");
        } else if (divPor3) {
            System.out.println("3");
        } else {
            for (int j = quadradoPerf.size() - 1; j > 0; j--) {
                if (n == 0) {
                    break;
                }
                
                
                while (n >= quadradoPerf.get(j)) {
                    n = (int) (n - quadradoPerf.get(j));            
                    a++;
                }
            }


            System.out.println(a);
        }
    
    }
}
