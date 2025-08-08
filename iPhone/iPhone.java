package iPhone;


import funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import funcionalidades.navegadorinternet.NavegadorInternet;
import funcionalidades.reprodutormusical.ReprodutorMusical;





public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar(){
        System.out.println("Fazendo ligação via Iphone");
    }
    
    public void atender(){
        System.out.println("Atendendo ligação via Iphone");
    }

    
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz via Iphone");
    }

    
    public void tocarMusica(){
        System.out.println("Tocando música via Iphone");
    }

    
    public void pausarMusica(){
        System.out.println("Pausando música via Iphone");
    }

    
    public void selecionarMusica(){
        System.out.println("Selecionando música via Iphone");
    }

    
    public void exibirPagina(){
        System.out.println("Exibindo página via Iphone");
    }

    
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba via Iphone");
    }

    
    public void atualizarPagina(){
        System.out.println("Atualizando página via Iphone");
    }
}
