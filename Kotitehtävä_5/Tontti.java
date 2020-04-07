import java.util.ArrayList;

public class Tontti{
    
    
    private String nimi;
    private String osoite;
    private double pintaAla;
    private Rakennus talo;
    private String rakennusTyyppi;
    
    
    public Tontti(){
        this.nimi = "";
        this.osoite = "";
        this.pintaAla = 0;
        this.talo = new Rakennus();
        this.rakennusTyyppi = "";
    }
    
    
    public void setNimi(String nimi){   
        this.nimi = nimi;
    }    
    
    
    public void setOsoite(String osoite){
        this.osoite = osoite;
    }
    
    
    public String setPintaAla(double pintaAla){
        if(pintaAla < 0)
            return "Pinta-ala ei voi olla negatiivinen";
        else
            this.pintaAla = pintaAla;
            return "";
    }
    
    
    public String getNimi(){
        return this.nimi;
    }
    
    
    public String getOsoite(){
        return this.osoite;
    }
    

    public double getPintaAla(){
        return this.pintaAla;
    }
 
 
    public String setTalonPintaAla(double pintaAla){
        return talo.setPintaAla(pintaAla);
    }
  
  
    public String setHuoneidenLkm(int lkm){
        return talo.setHuoneidenLkm(lkm);
    }
 
 
    public void setAsukas(String nimi, String syntymaAika){
        String[] asukas = {nimi, syntymaAika};
        talo.setAsukas(asukas);
    }
  
  
    public double getTalonPintaAla(){        
        return talo.getPintaAla();
    }
 
 
    public int getHuoneidenLkm(){
        return talo.getHuoneidenLkm();
    }
  
  
    public ArrayList<String[]> getAsukkaat(){
        return talo.getAsukkaat();
    }
 
 
    public void tulostaTontti(){
        System.out.println("Tontin Tiedot:");
        System.out.println("Tontin nimi: " + nimi);
        System.out.println("Sijainti: ");
        System.out.println("Leveys: " + osoite);
        System.out.println("Pituus: " + sijaintiPituus);
        System.out.println("Pinta-ala: " + pintaAla);
        System.out.println("");
        talo.tulostaRakennus();
    }

}