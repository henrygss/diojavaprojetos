package funcionalidades.reprodutormusical;

public class iTunesStore implements ReprodutorMusical {
    
    public void tocarMusica(){
        System.out.println("Tocando música via iTunes Store");
    }

    public void pausarMusica(){
        System.out.println("Pausando música via iTunes Store");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando música via iTunes Store");
    }
    
}
