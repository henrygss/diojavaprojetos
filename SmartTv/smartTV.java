package SmartTv;

/**
 * @autor Henry Gabriel
 * @version 1.0
 * @since 27/06/2025 
 * @param numerocanal
 */


public class smartTV {
    boolean ligada = false;
    int canal = 42;
    int volume = 12;

    public void aumentarCanal()
    {
        canal++;
    }

    public void descerCanal()
    {
        canal--;
    }

    public void aumentarVolume()
    {
        volume++;
    }

    
    public void diminuirVolume()
    {
        volume--;
    }

    public void ligarTV()
    {
        ligada = true;
    }

    public void desligarTV()
    {
        ligada = false;
    }

    public void definirCanal(int numerocanal)
    {
        canal = numerocanal; 
    }
}
