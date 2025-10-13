package App;


import Model.Conta;
import Service.RegrasNegocio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class CaixaEletronico{
    public static void main(String[] args) {

        ArrayList<Conta> listaContas = new ArrayList<>();
        int contadorContas = 3;

        Conta conta01 = new Conta();
        conta01.setNome("Henry");
        conta01.setSobrenome("Silva");
        conta01.setTipoConta("Conta Corrente");
        conta01.setNumeroConta("004570");
        conta01.setNumeroAgencia("0723");
        conta01.setSaldo(600.758);

        listaContas.add(conta01);

        Conta conta02 = new Conta();
        conta02.setNome("Gabriel");
        conta02.setSobrenome("Henry");
        conta02.setTipoConta("Conta Poupança");
        conta02.setNumeroConta("543210");
        conta02.setNumeroAgencia("1234");
        conta02.setSaldo(459200.5234);

        listaContas.add(conta02);

        Conta conta03 = new Conta();
        conta03.setNome("Silva");
        conta03.setSobrenome("Gabriel");
        conta03.setTipoConta("Conta Pagamento");
        conta03.setNumeroConta("987600");
        conta03.setNumeroAgencia("6789");
        conta03.setSaldo(340.271);

        listaContas.add(conta03);

        System.out.println(listaContas);


        String entradaMenu;
        int escolha;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        do{


            System.out.println("--- SIMULADOR DE CAIXA ELETRÔNICO ---");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1. Acessar conta");
            System.out.println("2. Criar conta");
            System.out.println("3. Sair");

            entradaMenu = scanner.next();

            while(!RegrasNegocio.validarEntrada(entradaMenu)){
                System.out.println("Entrada inválida. Digite apenas números");
                entradaMenu = scanner.next();
            }

            escolha = Integer.parseInt(entradaMenu);


            switch (escolha){
                case 1:

                Conta contaSelecionada = null;

                do{
                
                    System.out.println("Acessar conta");
                    System.out.println("Informe o número da conta:");
                    String numeroConta = scanner.next();

                    while (!RegrasNegocio.validarConta(numeroConta)){
                        System.out.println("Número de conta inválido! Deve ter 6 dígitos. Tente novamente.");
                        numeroConta = scanner.next();
                    }

                    System.out.println("Informe o número da agência:");
                    String numeroAgencia = scanner.next();

                    while (!RegrasNegocio.validarAgencia(numeroAgencia)){
                        System.out.println("Número de agência inválido! Deve ter 4 dígitos. Tente novamente.");
                        numeroAgencia = scanner.next();
                    }

                    for (Conta conta : listaContas){
                        if (conta.getNumeroConta().equals(numeroConta) && conta.getNumeroAgencia().equals(numeroAgencia)){
                            contaSelecionada = conta;
                            break;
                        }
                    }

                    if (contaSelecionada == null){
                        System.out.println("Conta não encontrada. Tente novamente.");
                    }
                
                }while(contaSelecionada == null);
  

                //Conta encontrada, prossegue com operações                
                System.out.println("olá, " + RegrasNegocio.formatarNome(contaSelecionada.getNome())  + " " + RegrasNegocio.formatarSobrenome(contaSelecionada.getSobrenome()));
                System.out.println("Tipo de conta: " + contaSelecionada.getTipoConta());
                System.out.println("Número da conta: " + contaSelecionada.getNumeroConta());
                System.out.println("Número da agência: " + contaSelecionada.getNumeroAgencia());
                System.out.println("Saldo atual: " + RegrasNegocio.formatarCasasDecimais(contaSelecionada.getSaldo()));

                String entradaMenuSecundario;
                boolean sair = false;

                do{
                    System.out.println("Escolha uma das opções:");
                    System.out.println("1. Depositar");
                    System.out.println("2. Sacar");
                    System.out.println("3. Sair");
                    entradaMenuSecundario = scanner.next();

                    while (!RegrasNegocio.validarEntrada(entradaMenuSecundario)){
                        System.out.println("Entrada inválida! Digite apenas números");
                        entradaMenuSecundario = scanner.next();
                    }

                    int opcao = Integer.parseInt(entradaMenuSecundario);

                    switch(opcao){

                        case 1: 
                            System.out.println("Informe o valor para depósito: ");
                            String entradadeposito = scanner.next();

                            while(!RegrasNegocio.validarEntrada(entradadeposito)){
                                System.out.println("Entrada inválida. Use o formato americano (ex: 30,000.50)");
                                entradadeposito = scanner.next();   
                            }

                            contaSelecionada.depositar(RegrasNegocio.converterEntrada(entradadeposito));  
                            break;
                        
                        case 2:
                            System.out.println("Informe o valor para saque: ");
                            String entradasaque = scanner.next();

                            while(!RegrasNegocio.validarEntrada(entradasaque)){
                                System.out.println("Entrada inválida. Use o formato americano (ex: 30,000.50)");
                                entradasaque = scanner.next();   
                            }

                            contaSelecionada.sacar(RegrasNegocio.converterEntrada(entradasaque));
                            break;
                        
                        case 3:
                            sair = true;
                            break;
                        
                        default:
                        System.out.println("Opção inválida. Digite 1 para depositar, 2 para sacar ou 3 para sair.");
                        break;
                    }
                }while (sair == false);
                break;

                case 2:

                boolean contaExiste;

                do{
                    System.out.println("Criar conta");

                    System.out.println("Digite o número da conta (6 dígitos): ");
                    String novoNumeroConta = scanner.next();

                    while (!RegrasNegocio.validarConta(novoNumeroConta)){
                        System.out.println("Número de conta inválido! Deve ter 6 dígitos. Tente novamente.");
                        novoNumeroConta = scanner.next();
                    }

                    System.out.println("Digite o número da agência (4 dígitos) :");
                    String novoNumeroAgencia = scanner.next();

                    while (!RegrasNegocio.validarAgencia(novoNumeroAgencia)){
                        System.out.println("Número de agência inválido! Deve ter 4 dígitos. Tente novamente.");
                        novoNumeroAgencia = scanner.next();
                    }

                    contaExiste = false;
                    for (Conta conta : listaContas){
                        if (conta.getNumeroConta().equals(novoNumeroConta) && conta.getNumeroAgencia().equals(novoNumeroAgencia)){
                            contaExiste = true;
                            break;
                        }
                    }
                        
                    if (contaExiste){
                        System.out.println("Já existe uma conta com esses dados! Tente novamente.");
                    }else{

                        contadorContas++;
                        String nomeConta = String.format("conta%02d", contadorContas);

                        System.out.println("Informe o seu primeiro nome: ");
                        String novoNome = scanner.next();

                        while(!RegrasNegocio.validarNome(novoNome)){
                            System.out.println("Nome inválido! Digite apenas letras. Tente novamente.");
                            novoNome = scanner.next();
                        }

                        scanner.nextLine();
                        System.out.println("Informe o seu sobrenome: ");
                        String novoSobrenome = scanner.nextLine().trim();

                        while(!RegrasNegocio.validarSobrenome(novoSobrenome)){
                            System.out.println("Sobrenome inválido! Digite apenas letras. Tente novamente.");
                            novoSobrenome = scanner.next();
                        }
                            
                        System.out.println("Informe qual é o tipo de conta que você deseja criar (Corrente/ Poupanca/ Pagamento");
                        String tipoConta = scanner.next();

                        
                        while(!tipoConta.equalsIgnoreCase("Corrente") && !tipoConta.equalsIgnoreCase("Poupanca") && !tipoConta.equalsIgnoreCase("Pagamento")){
                            System.out.println("Entrada inválida. Informe o tipo de conta que deseja criar (Corrente/ Poupanca/ Pagamento)");
                            tipoConta = scanner.next();
                        }
       
                        Conta novaConta = new Conta();
                        novaConta.setNome(RegrasNegocio.formatarNome(novoNome));
                        novaConta.setSobrenome(RegrasNegocio.formatarSobrenome(novoSobrenome));
                        novaConta.setTipoConta(RegrasNegocio.formatarNome(tipoConta));
                        novaConta.setNomeConta(nomeConta);
                        novaConta.setNumeroAgencia(novoNumeroAgencia);
                        novaConta.setNumeroConta(novoNumeroConta);
                        listaContas.add(novaConta);

                        System.out.println(listaContas);

                        System.out.println("Conta criada com sucesso.");
                        System.out.println("Olá, "  + novaConta.getNome() +  " " + novaConta.getSobrenome());
                        System.out.println("Tipo de conta: " + novaConta.getTipoConta());

                        //Nome da nova conta(conta04, conta05, conta06...)
                        //System.out.println(novaConta.getNomeConta());

                        System.out.println("Número da conta: " + novaConta.getNumeroConta());
                        System.out.println("Número da agência: " + novaConta.getNumeroAgencia());
                        System.out.println("Seu saldo: R$" + novaConta.getSaldo());

                        
                    }

                }while (contaExiste == true);
                break;

                case 3:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }while (escolha != 3);

        scanner.close();
                
    
    }
} 