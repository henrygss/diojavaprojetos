

import java.util.Scanner;


public class Contador
{
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        try
        {
            System.out.println("Digite o primeiro número: ");

        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        iteracao(numeroUm, numeroDois);
        }
        catch (ParametrosInvalidosException e)
        {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        finally
        {
            scanner.close();
        }
        

    }

    public static void iteracao(int numero1, int numero2) throws ParametrosInvalidosException
    {

        if (numero1 > numero2)
        {
            throw new ParametrosInvalidosException();
        }

        int quantidadeIteracao = (numero2 - numero1);

        for (int i = 1; i <= quantidadeIteracao; i++)
        {
            System.out.println("Imprimindo o número " + i) ;
        }
    }
}