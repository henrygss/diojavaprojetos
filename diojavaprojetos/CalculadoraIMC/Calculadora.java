import java.util.Scanner;
import java.util.Locale;
public class Calculadora {
    public static void main(String[] args) {

       

        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

            String nomeUsuario;
            float pesoUsuario = 0;
            float alturaUsuario = 0;

            while(true){

                System.out.println("Informe o seu nome:");
                nomeUsuario = scanner.nextLine().trim();

                if (!nomeUsuario.isEmpty() && nomeUsuario.matches("[a-zA-ZáéíóúÁÉÍÓÚãõÃÕçÇ ]+")){
                    break;
                }else{
                    System.out.println("O nome não deve conter números");
                }
            }

            while (true){

                System.out.println("Informe o seu peso: ");
                try{
                    pesoUsuario = Float.parseFloat(scanner.nextLine());
                    if (pesoUsuario > 0){
                        break;
                    }else{
                        System.out.println("Peso deve ser maior que 0 ");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Peso inválido. Digite um número válido");
                }

            }

            while (true){
                System.out.println("Informe sua altura:");

                try{
                    alturaUsuario = Float.parseFloat(scanner.nextLine());

                    if (alturaUsuario > 0){
                        break;
                    }else{
                        System.out.println("A altura deve ser maior que 0");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Altura inválida. Digite uma altura válida");
                }
            }
            
            calcularIMC(nomeUsuario, pesoUsuario, alturaUsuario);
        }
            
    }

    public static void calcularIMC(String nome, float peso, float altura){
        float imc = peso / (altura * altura);
        String imcFormatado = String.format("%.2f", imc);

        if (imc < 18.5)
        {
            System.out.println( nome + ", você está abaixo do peso. Seu IMC: " + imcFormatado);
        }else if (imc <= 24.9){
            System.out.println(nome + ", você está com o peso normal. Seu IMC: " + imcFormatado);
        }else if (imc <= 29.9 ){
            System.out.println(nome + ", você está com o sobrepeso. Seu IMC: " + imcFormatado);
        }else if (imc <= 34.9){
            System.out.println(nome + ", você está com obesidade grau 1. Seu IMC: " + imcFormatado);
        }else if (imc <= 39.9){
            System.out.println(nome + ", você está com obesidade grau 2. Seu IMC: " + imcFormatado);
        }else
        {
            System.out.println(nome + ", você está com obesidade grau 3. Seu IMC: " + imcFormatado);
        }

    }
}
