import java.util.List;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Sanalista{
    
    
    private List<String> sanalista;
    
    
    public Sanalista(String tiedosto){
		try{
			this.sanalista = Files.readAllLines(Paths.get(tiedosto), Charset.defaultCharset());
		}catch(Exception e){
			System.out.println("Virhe.");
		}
    }
	
	
	public List<String> annaSanat(){
		return this.sanalista;
	}
    
    
    public void tulostaSanat(){
        for(String sana : sanalista){
            System.out.println(sana);
        }
        
    }
    
    
}