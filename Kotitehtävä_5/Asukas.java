

public class Asukas{
    
    private String nimi;
    
    public Asukas(){
        this.nimi = "";
    }
    
    public void setNimi(String nimi){   
        this.nimi = nimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public void tulostaAsukas(){
        System.out.println(nimi);        
    }
    
}