package validacaoDeParenteses;

import java.util.Scanner;          

public class ValidacaoDeParenteses {
    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);

        scanner.close();
    }

    public static boolean ehValido(String s) {
        if (s.equals("()") || s.equals("{}") || s.equals("[]")) return true;
        else return false;
    }
    
}
