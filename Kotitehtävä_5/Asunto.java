import java.util.ArrayList;

public class Asunto{
    
    
    private double pintaAla;
    private int huoneidenLkm;
	private Asukas asukas;
    private ArrayList<Asukas> asukkaat;
    
    
    public Asunto(){
        this.pintaAla = 0;
        this.huoneidenLkm = 0;
        this.asukkaat = new ArrayList<Asukas>();
    }
    
	
	public void newAsukas(){
		this.asukas = new Asukas();
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
    
    public void setAsukas(String nimi){ 
		newAsukas();
		asukas.setNimi(nimi);
        asukkaat.add(asukas);
    }   
        
    public double getPintaAla(){
        return this.pintaAla;
    }
    
    public int getHuoneidenLkm(){
        return this.huoneidenLkm;
    }
    
    public ArrayList<Asukas> getAsukkaat(){
        return this.asukkaat;
    }
       
    public void tulostaAsunto(){
        System.out.println("Asunnon Tiedot:");
        System.out.println("Pinta-ala: " + pintaAla);
        System.out.println("Huoneiden lukumäärä: " + huoneidenLkm);
        System.out.println("");
		System.out.println("Asukkaat:");
		for(Asukas asukas : asukkaat){
			asukas.tulostaAsukas();
		}
		System.out.println("");		
    }


}
