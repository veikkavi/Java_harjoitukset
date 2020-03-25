

public class StandingSubscription extends Subscription{
    
    private int alennusprosentti;
    
    public StandingSubscription(){
        this.alennusprosentti = 0;
    }
    
    public void setAlennusprosentti(int prosentti){   
        this.alennusprosentti = prosentti;
    }  
    
    public int getAlennusprosentti(){
        return this.alennusprosentti;
    }
    
    public void printInvoice(){
        System.out.println("");
        System.out.println("LASKU");
        System.out.println("Kestotilaus ");
        System.out.println("Lehden nimi: " + getLehden_nimi());
        System.out.println("Tilaajan nimi: " + getTilaajan_nimi());
        System.out.println("Toimitusosoite: " + getToimitusosoite());
        System.out.println("Kuukausihinta: " + getKuukausihinta() + " euroa");
        System.out.println("Laskutettavia kuukausia: 12");
        System.out.println("Alennusprosentti: " + getAlennusprosentti() + "%");
        double kerroin =(100 - getAlennusprosentti()) / 100.0;       
        System.out.printf("Maksettava: %.2f euroa\n", getKuukausihinta() * 12 * kerroin);
    }
    
}