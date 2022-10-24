package veirficarPalindromo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String palavra = input.nextLine();

        System.out.println(verificarPalindromo(palavra));

        input.close();
        
    }

    public static String verificarPalindromo(String palavra){

        StringBuilder inverter = new StringBuilder(palavra.toLowerCase()).reverse();
        String palavraInvertida = inverter.toString();

        System.out.println(palavraInvertida);

        if(palavra.equalsIgnoreCase(palavraInvertida)) return "TRUE";
        else return "FALSE";
    }
}
