package SmartTv;


public class usuario {

    public static void main(String[] args) {
        
        smartTV smartTV = new smartTV();

        System.out.println(smartTV.ligada);
        System.out.println(smartTV.canal);
        System.out.println(smartTV.volume);

        smartTV.ligarTV();
        System.out.println(smartTV.ligada);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        System.out.println(smartTV.canal);

        smartTV.descerCanal();
        System.out.println(smartTV.canal);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println(smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println(smartTV.volume);

        smartTV.definirCanal(30);
        System.out.println(smartTV.canal);

        smartTV.descerCanal();
        smartTV.descerCanal();
        System.out.println(smartTV.canal);
        


    }
    
}
