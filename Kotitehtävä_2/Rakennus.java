import java.util.ArrayList;

public class Rakennus{
    
    private double pintaAla;
    private int huoneidenLkm;
    private Asukkaat asukkaat;
    
    public Rakennus(){
        this.pintaAla = 0;
        this.huoneidenLkm = 0;
        this.asukkaat = new Asukkaat();
    }
    
    public String setPintaAla(double pintaAla){
        if(pintaAla < 0)
            return "Pinta-ala ei voi olla negatiivinen";
        else
            this.pintaAla = pintaAla;
            return "";
    }
    
    public String setHuoneidenLkm(int lkm){
        if(lkm < 1)
            return "Huoneita täytyy olla vähintään yksi.";
        else 
            this.huoneidenLkm = lkm;
            return "";
    }
    
    public void setAsukas(String[] asukas){       
        asukkaat.setAsukas(asukas);
    }   
        
    public double getPintaAla(){
        return this.pintaAla;
    }
    
    public int getHuoneidenLkm(){
        return this.huoneidenLkm;
    }
    
    public ArrayList<String[]> getAsukkaat(){
        return asukkaat.getAsukkaat();
    }
       
    public void tulostaRakennus(){
        System.out.println("Rakennuksen Tiedot:");
        System.out.println("Pinta-ala: " + pintaAla);
        System.out.println("Huoneiden lukumäärä: " + huoneidenLkm);
        System.out.println("");
        asukkaat.tulostaAsukkaat();
    }

}