import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Hirsipuu{
    
    
    private String arvattavaSana;
	private int arvauksiaJaljella;
	private int oikeitaArvauksia;
	private List<Character> oikeatArvaukset;
	private List<Character> vaaratArvaukset;
	private boolean voitto;
    
    
    public Hirsipuu(List<String> lista, int arvauksia){
		this.oikeatArvaukset = new ArrayList<Character>();
		this.vaaratArvaukset = new ArrayList<Character>();
		this.arvauksiaJaljella = arvauksia;
		Random rand = new Random();
		this.arvattavaSana = lista.get(rand.nextInt(lista.size()));
    }
	
	
	/*vertaa parametrina
	annettua merkkiä arvattavaan sanaan. Lisää arvauksen arvauslistalle. Jos merkki löytyy
	arvattavasta sanasta, palautetaan arvo true. Jos merkkiä ei löydy, vähennetään arvausten
	määrää yhdellä ja palautetaan false*/	
	public boolean arvaa(Character merkki){		
		if(arvattavaSana.contains(String.valueOf(merkki))){
			oikeatArvaukset.add(merkki);
			oikeitaArvauksia +=1;
			return true;
		}else{
			vaaratArvaukset.add(merkki);
			arvauksiaJaljella -=1;
			return false;
		}
	}
    
    
	//palauttaa oikeat arvaukset listaoliona.
    public List<Character> oikeatArvaukset(){
        return this.oikeatArvaukset;
    }
	
	
	//palauttaa väärät arvaukset listaoliona.
    public List<Character> vaaratArvaukset(){
        return this.vaaratArvaukset;
    }
    
	
	//palauttaa jäljellä olevien arvausten määrän.
	public int arvauksiaOnJaljella(){
		return arvauksiaJaljella;
	}
    
	
	// palauttaa arvattavan sanan peittelemättömänä.
	public String sana(){
		return arvattavaSana;
	}
	
	
	//ilmaisee onko peli voitettu vai hävitty.
	public boolean voitto(){
		return voitto;
	}
	
	
	//ilmaisee onko peli loppu. Peli loppuu, jos arvattavan sanan kaikki merkit on arvattu.
	public boolean onLoppu(){	
		if(arvauksiaOnJaljella() == 0){
			voitto = false;
			return true;
		}
		for(char c : sana().toCharArray()){
			if(oikeatArvaukset.contains(c) == false){
				return false;
			}			
		}
		voitto = true;
		return true;
	}
	
	
}