package usuario;

import funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import funcionalidades.aparelhotelefonico.Telefone;
import funcionalidades.navegadorinternet.NavegadorInternet;
import funcionalidades.navegadorinternet.Safari;
import funcionalidades.reprodutormusical.ReprodutorMusical;
import funcionalidades.reprodutormusical.iTunesStore;
import iPhone.iPhone;


public class Usuario {
    public static void main(String[] args) {
        
        /*ReprodutorMusical reprodutorMusical = new iTunesStore();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();
        reprodutorMusical.selecionarMusica();

        NavegadorInternet navegadorInternet = new Safari();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();

        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();*/

        iPhone iphone = new iPhone();
        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
