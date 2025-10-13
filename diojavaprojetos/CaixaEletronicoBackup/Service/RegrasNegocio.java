package Service;



import java.text.DecimalFormat;
import java.util.Locale;

public class RegrasNegocio {

    public static final DecimalFormat df = new DecimalFormat();

    public static boolean validarNome(String nome){
        return nome != null && nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+");
    }

    public static boolean validarSobrenome(String sobrenome){
        return sobrenome != null && sobrenome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+");
    }


    public static String formatarNome(String nome){
        String nomeFormatado = nome.toUpperCase();
        return nomeFormatado;

    }

    public static String formatarSobrenome(String sobrenome){

        String sobrenomeFormatado = sobrenome.toUpperCase();
        return sobrenomeFormatado;

    }

    public static boolean validarEntrada(String entrada){

        //Remove vírgulas(separador de milhas)
        String limpa = entrada.replace(",", "");

        //Verifica se o número tem formato americano (Ex 30000 ou 30000.25)
        return limpa.matches("\\d+(\\.\\d+)?");
    }

    public static double converterEntrada(String entrada){
        //Remove vírgula para separador de milhar
        entrada = entrada.replace(",", "");

        return Double.parseDouble(entrada);
    }

    public static boolean validarConta(String conta){
        return conta!= null && conta.matches("\\d{6}");
    }

    public static boolean validarAgencia(String agencia){
        return agencia!= null && agencia.matches("\\d{4}");
    }

    public static String formatarCasasDecimais(double valor){
        return String.format(new Locale("pt", "BR"),"R$%,.2f", valor);
    }


        
}


