import java.util.ArrayList;


public class Rakennus{
    
	
    private Asunto asunto;
	private ArrayList<Asunto> asunnot;
	private int asuntojenMaara;
	private String rakennusTyyppi;
	
    
    
    public Rakennus(){	
        this.asunnot = new ArrayList<Asunto>();
		this.asuntojenMaara = 0;
		this.rakennusTyyppi = "";
    }
	
	
	public void newAsunto(){
		this.asunto = new Asunto();
	}
    
	
	public String setRakennusTyyppi(String tyyppi){   
        if(tyyppi.equals("kerrostalo")){
			this.rakennusTyyppi = tyyppi;
			return "";
		}else if(tyyppi.equals("rivitalo")){
			this.rakennusTyyppi = tyyppi;
			return "";
		}else if(tyyppi.equals("omakotitalo")){
			this.rakennusTyyppi = tyyppi;
			return "";
		}else{
			return "Väärä rakennustyyppi!";
		}
    } 
	
    
    public String setPintaAla(double pintaAla){
        if(pintaAla < 0)
            return "Pinta-ala ei voi olla negatiivinen";
        else
            asunto.setPintaAla(pintaAla);
            return "";
    }
    
	
    public String setHuoneidenLkm(int lkm){
        if(lkm < 1)
            return "Huoneita täytyy olla vähintään yksi.";
        else 
            asunto.setHuoneidenLkm(lkm);
            return "";
    }
	
	
    public void setAsukas(String nimi){       
        asunto.setAsukas(nimi);
    }   
	
		
	public void addAsunto(){
		asunnot.add(asunto);
	}
    
	
	public String getRakennusTyyppi(){
        return this.rakennusTyyppi;
    }
	
        
    public double getPintaAla(){
        return asunto.getPintaAla();
    }
    
	
    public int getHuoneidenLkm(){
        return asunto.getHuoneidenLkm();
    }
    
	
    public ArrayList<Asukas> getAsukkaat(){
        return asunto.getAsukkaat();
    }
       
	   
    public void tulostaRakennus(){
        System.out.println("Rakennuksen Tiedot:");
		System.out.println("Rakennuksen tyyppi: " + rakennusTyyppi);
		System.out.println("Asuntojen määrä: " + asunnot.size());
        System.out.println("");
		for(Asunto asunto : asunnot){
			asunto.tulostaAsunto();
		}
    }

}