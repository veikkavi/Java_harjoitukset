

public class Subscription{
    
    private String lehden_nimi;
    private String tilaajan_nimi;
    private String toimitusosoite;
    private double kuukausihinta;
    
    public Subscription(){
        this.lehden_nimi = "dasda";
        this.tilaajan_nimi = "";
        this.toimitusosoite = "";
        this.kuukausihinta = 0;
    }
    
    public void setLehden_nimi(String nimi){   
        this.lehden_nimi = nimi;
    }  
    
    public void setTilaajan_nimi(String nimi){   
        this.tilaajan_nimi = nimi;
    }  
    
    public void setToimitusosoite(String osoite){   
        this.toimitusosoite = osoite;
    }  
    
    public void setKuukausihinta(double hinta){   
        this.kuukausihinta = hinta;
    }  
    
    public String getLehden_nimi(){
        return this.lehden_nimi;
    }
    
    public String getTilaajan_nimi(){
        return this.tilaajan_nimi;
    }
    
    public String getToimitusosoite(){
        return this.toimitusosoite;
    }
    
    public double getKuukausihinta(){
        return this.kuukausihinta;
    }
    
    public void printInvoice(){
        System.out.println("");
        System.out.println("Lehden nimi: " + getLehden_nimi());
        System.out.println("Tilaajan nimi: " + getTilaajan_nimi());
        System.out.println("Toimitusosoite: " + getToimitusosoite());
        System.out.println("Kuukausihinta: " + getKuukausihinta() + " euroa");
    }
    
}