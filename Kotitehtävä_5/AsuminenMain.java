import java.util.Scanner;

public class AsuminenMain{
    
	
    public static void main(String[] args){
        
		
        Scanner sc = new Scanner(System.in); 
        
		
        Tontti tontti = new Tontti();
		System.out.println("");
        System.out.println("Luotiin uusi tontti. Anna seuraavat tiedot:"); 
        System.out.println("");
        
		
        System.out.print("Tontin nimi: ");
        tontti.setNimi(sc.nextLine());
        System.out.println("");
        
		
        System.out.print("Osoite: ");
        tontti.setOsoite(sc.nextLine()); 
        System.out.println("");
        
		
        System.out.print("Pinta-ala neliömetreinä: ");
        try{
            System.out.println(tontti.setPintaAla(Double.valueOf(sc.nextLine())));
        }catch(Exception e){
            System.out.println("Pinta-alan täytyy olla luku.");
        }
		
		
        System.out.print("Anna rakennuksen tyyppi (rivitalo,kerrostalo tai omakotitalo): ");
        System.out.println(tontti.setRakennusTyyppi(sc.nextLine()));
		
		
		while(true){
			System.out.println("Anna asunnon tiedot (tyhjän syötteen antaminen lopettaa):");         
			System.out.print("Pinta-ala neliömetreinä: ");
			String pa = sc.nextLine();
			if (pa.equals("")){
				System.out.println("");
				break;
			}	
			tontti.newAsunto();
			try{
				System.out.println(tontti.setTalonPintaAla(Double.valueOf(pa)));
			}catch(Exception e){
				System.out.println("Pinta-alan täytyy olla luku.");
			}
               
			System.out.print("Huoneiden lukumäärä: ");
			try {           
				System.out.println(tontti.setHuoneidenLkm(Integer.valueOf(sc.nextLine())));
			}catch(Exception e) {
				System.out.println("Huoneiden lukumäärän täytyy olla kokonaisluku.");
			}
			
			
			System.out.println("Syötä rakennuksen asukkaat (tyhjän syötteen antaminen lopettaa):");
			while(true){
				System.out.print("Nimi: ");
				String nimi = sc.nextLine();
				if (nimi.equals("")){
					System.out.println("");
					break;
				}
				tontti.setAsukas(nimi);
				System.out.println("");
			}
			tontti.addAsunto();
		}       
        
        
        tontti.tulostaTontti();
        
    }
    
}