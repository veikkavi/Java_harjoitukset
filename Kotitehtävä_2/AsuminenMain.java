import java.util.Scanner;

public class AsuminenMain{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); 
        
        Tontti tontti = new Tontti();
        System.out.println("Luotiin uusi tontti. Anna seuraavat tiedot:"); 
        System.out.println("");
        
        System.out.print("Tontin nimi: ");
        tontti.setNimi(sc.nextLine());
        System.out.println("");
        
        System.out.println("Sijainti: ");
        System.out.print("Leveyspiiri: ");
        tontti.setSijaintiLeveys(sc.nextLine()); 
        System.out.print("Pituuspiiri: ");
        tontti.setSijaintiPituus(sc.nextLine());
        System.out.println("");
        
        System.out.print("Pinta-ala neliömetreinä: ");
        try{
            System.out.println(tontti.setPintaAla(Double.valueOf(sc.nextLine())));
        }catch(Exception e){
            System.out.println("Pinta-alan täytyy olla luku.");
        }
        
        System.out.println("Anna rakennuksen tiedot:");         
        System.out.print("Pinta-ala neliömetreinä: ");
        try{
            System.out.println(tontti.setTalonPintaAla(Double.valueOf(sc.nextLine())));
        }catch(Exception e){
            System.out.println("Pinta-alan täytyy olla luku.");
        }
               
        System.out.print("Huoneiden lukumäärä: ");
        try {           
            System.out.println(tontti.setHuoneidenLkm(Integer.valueOf(sc.nextLine())));
        }catch(Exception e) {
            System.out.println("Huoneiden lukumäärän täytyy olla kokonaisluku.");
        }        
        
        System.out.println("Syötä rakennuksen asukkaat.");
        while(true){
            System.out.print("Nimi: ");
            String nimi = sc.nextLine();
            if (nimi.equals("")){
                System.out.println("");
                break;
            }
            System.out.print("Syntymäaika: ");
            String syntymaAika = sc.nextLine();
            tontti.setAsukas(nimi, syntymaAika);
            System.out.println("");
        }
        
        tontti.tulostaTontti();
        
    }
    
}