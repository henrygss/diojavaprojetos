package ProcessoSeletivo;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo
{
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        String candidatos [] = {"Henry", "Gabriel", "Silva", "Antonio", "Márcio", "Pedro", "Luan", "Rodrigo", "Rodolfo", "Natan", "Pedro", "Paulo", "Edu"};

        for(String candidato: candidatos)
        {
            entrandoEmContato(candidato);
        }

        selecaocandidatos();
    }


    public static void entrandoEmContato(String candidato)
    {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
            {
                tentativasRealizadas++;
            }
            else
            {
                System.out.println("Contato realizado com sucesso");
            }
        }
        while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
        {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }
        else
        {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas: " + tentativasRealizadas + " realizadas");
        }
    }

    public static boolean atender()
    {
        return new Random().nextInt(3) == 1;
    }


     public static void selecaocandidatos()
    {
        String candidatos [] = {"Henry", "Gabriel", "Silva", "Antonio", "Márcio", "Pedro", "Luan", "Rodrigo", "Rodolfo", "Natan", "Pedro", "Paulo", "Edu"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        String listaCandidatosSelecionados [] = new String[6];


        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
        {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido);
            if (salarioBase >= salarioPretendido)
            {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;

                listaCandidatosSelecionados[candidatosSelecionados] = candidato;

            
            }
            candidatoAtual++;
        }


        System.out.println("Lista candidatos: ");
        for (String nome : listaCandidatosSelecionados)
        {
            if (nome != null)
            {
            System.out.println(nome);

            }
        }


    } 

    public static void analisarCandidato(double salarioPretendido)
    {
        double salarioBase = 2000.0;

        if (salarioPretendido < salarioBase)
        {
            System.out.println("Ligar para o candidato");
        }
        else if (salarioPretendido == salarioBase)
        {
            System.out.println("Ligar para o candidato com contraproposta");
        }
        else
        {
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }

    public static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


}