import java.util.Scanner;
public class IOLinhaDeComando{
    public static void main(String... args){
        //declaraçao de variaveis

        int a,b, resultado;
        Scanner leitor = new Scanner(System.in);

        //entrada

        System.out.println("Digite o primeiro valor: ");
        a = leitor.nextInt();
        System.out.println("digite o segundo valor: ");
        b = leitor.nextInt();

        //processamento

        resultado = a + b;

        //saida

        System.out.printf("O resultado de %d + %d sua conta eh: %d", a , b , resultado);

    }
}