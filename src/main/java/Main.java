
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
          Scanner leia = new Scanner(System.in);
        int num, resultado;
        num = leia.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }
    }
}
