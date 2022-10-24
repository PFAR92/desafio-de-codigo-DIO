package classificandoMatrizes;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ClassificandoMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contador = 0;

        int n = input.nextInt();
    	int[] nums = new int[n];

        for (int i = 0; i < n; i++)
        {
            nums[i] = input.nextInt();
        }
        
        for (int i = 0; i < n; i++){
            if(nums[i] % 2 == 0) {
                int troca = nums[contador];
                nums[contador] = nums[i];
                nums[i] = troca;
                contador ++;
            }
        }
        input.close();
        
        List<Integer> lista = Arrays
            .stream(nums)
            .boxed()
            .collect(Collectors.toList());
        Set<Integer> f = new LinkedHashSet<>();
        f.addAll(lista);
         

        for (Integer integer : f) {
            System.out.println(integer);
        }
        
        
    }
}
