

public class RegularSubscription extends Subscription{
    
    private int  tilauksen_kesto;
    
    public RegularSubscription(){
        this.tilauksen_kesto = 0;        
    }
    
    public void setTilauksen_kesto(int kesto){   
        this.tilauksen_kesto = kesto;
    }  
    
    public int getTilauksen_kesto(){
        return this.tilauksen_kesto;
    }
    
    public void printInvoice(){
        System.out.println("");
        System.out.println("LASKU");
        System.out.println("Kuukausitilaus ");
        System.out.println("Lehden nimi: " + getLehden_nimi());
        System.out.println("Tilaajan nimi: " + getTilaajan_nimi());
        System.out.println("Toimitusosoite: " + getToimitusosoite());
        System.out.println("Kuukausihinta: " + getKuukausihinta() + " euroa");
        System.out.println("Laskutettavia kuukausia: " + getTilauksen_kesto());
        System.out.printf("Maksettava: %.2f euroa\n", getKuukausihinta() * getTilauksen_kesto());
    }
    
}