package ContaBanco;

import java.util.Scanner;

public class ContaTerminal 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Por favor, insira seu nome:");
        String nome = scanner.next();

        System.out.println("Insira seu sobrenome:");
        String sobrenome = scanner.next();

        String nomeCliente = nome + " " + sobrenome;

        System.out.println("Por favor, informe o número de sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número de sua agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o saldo de sua conta:");
        float saldo = scanner.nextFloat();

        //Imprimindo os valores digitados pelo cliente
        System.out.println("Olá, " + nomeCliente + ", " + 
        "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " +
        "conta " + numero + " " + "e seu saldo " + saldo + " " + "já está disponível para saque." );
        }
        finally
        {
            scanner.close();
        }


    }

}
        
