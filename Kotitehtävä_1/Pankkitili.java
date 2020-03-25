

public class Pankkitili{
    
    private String tilinumero;
    private String omistaja;
    private double saldo;
    
    public Pankkitili(){
        this.tilinumero = "";
        this.omistaja = "";
        this.saldo = 0;
    }
    
    public void setTilinumero(String tilinumero){
        this.tilinumero = tilinumero;
    }
    
    public void setOmistaja(String omistaja){
        this.omistaja = omistaja;
    }
    
    public void setSaldo(double saldo){
        if(saldo >= 0)
            this.saldo = saldo;
        else 
            System.out.println("Saldo ei voi olla negatiivinen.");
    }      
    
    public String getTilinumero(){
        return this.tilinumero;
    }
    
    public String getOmistaja(){
        return this.omistaja;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void talletus(double maara){
        if(maara < 0 )
            System.out.println("Määrä ei voi olla negatiivinen.");
        else
            saldo = saldo + maara;
    }
    
    public void otto(double maara){        
        if(maara < 0 )
            System.out.println("Määrä ei voi olla negatiivinen.");
        else if(saldo < maara)
            System.out.println("Tilillä ei ole tarpeeksi rahaa!");
        else
            saldo = saldo - maara;        
    }
    
    public void tulostaTili(){
        System.out.println("Tilin Tiedot:");
        System.out.println("Tilin omistaja: " + omistaja);
        System.out.println("Tilinumero: " + tilinumero);
        System.out.println("Saldo: " + saldo);
        System.out.println("");
    }
}