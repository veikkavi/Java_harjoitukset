import java.util.ArrayList;

public class Asukkaat{
    
    private ArrayList<String[]> asukkaat;
    
    public Asukkaat(){
        this.asukkaat = new ArrayList<String[]>();
    }
    
    public void setAsukas(String[] asukas){   
        asukkaat.add(asukas);
    }
    
    public ArrayList<String[]> getAsukkaat(){
        return asukkaat;
    }
    
    public void tulostaAsukkaat(){
        System.out.println("Asukkaat:");
        for(String[] asukas : asukkaat)
            System.out.println(asukas[0] + " Syntymäaika: " + asukas[1]);
        
    }
    
}