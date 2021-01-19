import java.util.Scanner;

public class HirsipuuMain{
    
    
    public static void main(String[] args){
        
		
        Scanner sc = new Scanner(System.in);
        Sanalista lista = new Sanalista("Sanat.txt");
		
		
		int arvaukset = 0;
		System.out.print("Anna arvauksien määrä: ");
		try{
            arvaukset = Integer.valueOf(sc.nextLine());
        }catch(Exception e){
            System.out.println("Arvauksien määrän täytyy olla kokonaisluku.");
        }
		
		
		Hirsipuu hirsipuu = new Hirsipuu(lista.annaSanat(), arvaukset);
		char c;
		while(hirsipuu.onLoppu() == false){
			System.out.println("Oikeat kirjaimet: " + hirsipuu.oikeatArvaukset());
			System.out.println("Väärät kirjaimet: " + hirsipuu.vaaratArvaukset());
			System.out.println("Arvauksia jäljellä: " + hirsipuu.arvauksiaOnJaljella());
			System.out.print("Arvaa kirjain: ");
			
			try{
				c = sc.nextLine().charAt(0);
				hirsipuu.arvaa(c);
			}catch(Exception e){
				System.out.println("Virhe!");
			}
			System.out.println("");
		}
        
		if(hirsipuu.voitto() == true){
			System.out.println("Voitit");
		}else{
			System.out.println("Hävisit");
		}
		System.out.println("Sana oli: " + hirsipuu.sana());
		
    }
    
    
}